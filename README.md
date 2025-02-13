# Llama Stack Client Kotlin API Library

We are excited to share a guide for a Kotlin Library that brings front the benefits of [Llama Stack](https://github.com/meta-llama/llama-stack) to your Android device. This library is a set of SDKs that provide a simple and effective way to integrate AI capabilities into your Android app whether it is local (on-device) or remote inference. 

Features:
- Local Inferencing: Run Llama models purely on-device with real-time processing. We currently utilize ExecuTorch as the local inference distributor and may support others in the future.
    - [ExecuTorch](https://github.com/pytorch/executorch/tree/main) is a complete end-to-end solution within the PyTorch framework for inferencing capabilities on-device with high portability and seamless performance.
- Remote Inferencing: Perform inferencing tasks remotely with Llama models hosted on a remote connection (or serverless localhost).
- Simple Integration: With easy-to-use APIs, a developer can quickly integrate Llama Stack in their Android app. The difference with local vs remote inferencing is also minimal.

Latest Release Notes: [v0.1.2](https://github.com/meta-llama/llama-stack-client-kotlin/releases/tag/v0.1.2) 

*Tagged releases are stable versions of the project. While we strive to maintain a stable main branch, it's not guaranteed to be free of bugs or issues.*

## Android Demo App
Check out our demo app to see how to integrate Llama Stack into your Android app: [Android Demo App](https://github.com/meta-llama/llama-stack-apps/tree/android-kotlin-app-latest/examples/android_app)

The key files in the app are `ExampleLlamaStackLocalInference.kt`, `ExampleLlamaStackRemoteInference.kts`, and `MainActivity.java`. With encompassed business logic, the app shows how to use Llama Stack for both the environments.

## Quick Start

### Add Dependencies
#### Kotlin Library
Add the following dependency in your `build.gradle.kts` file:
```
dependencies {
 implementation("com.llama.llamastack:llama-stack-client-kotlin:0.1.2")
}
```
This will download jar files in your gradle cache in a directory like `~/.gradle/caches/modules-2/files-2.1/com.llama.llamastack/` 

If you plan on doing remote inferencing this is sufficient to get started.

#### Dependency for Local

For local inferencing, it is required to include the ExecuTorch library into your app.

Include the ExecuTorch library by:
1. Download the `download-prebuilt-et-lib.sh` script file from the [llama-stack-client-kotlin-client-local](https://github.com/meta-llama/llama-stack-client-kotlin/blob/release/0.0.58/llama-stack-client-kotlin-client-local/download-prebuilt-et-lib.sh) directory to your local machine.
2. Move the script to the top level of your Android app where the app directory resides:
<p align="center">
<img src="https://raw.githubusercontent.com/meta-llama/llama-stack-client-kotlin/refs/heads/release/0.0.58/doc/img/example_android_app_directory.png" style="width:300px">
</p>

3. Run `sh download-prebuilt-et-lib.sh` to create an `app/libs` directory and download the `executorch.aar` in that path. This generates an ExecuTorch library for the XNNPACK delegate with commit: [0a12e33](https://github.com/pytorch/executorch/commit/0a12e33d22a3d44d1aa2af5f0d0673d45b962553).
4. Add the `executorch.aar` dependency in your `build.gradle.kts` file:
```
dependencies {
  ...
  implementation(files("libs/executorch.aar"))
  ...
}
```

## Llama Stack APIs in Your Android App
Breaking down the demo app, this section will show the core pieces that are used to initialize and run inference with Llama Stack using the Kotlin library.

### Setup Remote Inferencing
Start a Llama Stack server on localhost. Here is an example of how you can do this using the firework.ai distribution:
```
conda create -n stack-fireworks python=3.10 
conda activate stack-fireworks
pip install llama-stack=0.1.2
llama stack build --template fireworks --image-type conda
export FIREWORKS_API_KEY=<SOME_KEY>
llama stack run /Users/<your_username>/.llama/distributions/llamastack-fireworks/fireworks-run.yaml --port=5050
```

Ensure the Llama Stack server version is the same as the Kotlin SDK Library for maximum compatibility.

Other inference providers: [Table](https://llama-stack.readthedocs.io/en/latest/index.html#supported-llama-stack-implementations)

How to set remote localhost in Demo App: [Settings](https://github.com/meta-llama/llama-stack-apps/tree/main/examples/android_app#settings)

### Initialize the Client
A client serves as the primary interface for interacting with a specific inference type and its associated parameters. Only after client is initialized then you can configure and start inferences. 

<table>
<tr>
<th>Local Inference</th>
<th>Remote Inference</th>
</tr>
<tr>
<td>

```
client = LlamaStackClientLocalClient
                    .builder()
                    .modelPath(modelPath)
                    .tokenizerPath(tokenizerPath)
                    .temperature(temperature)
                    .build()
```
</td>
<td>

```
// remoteURL is a string like "http://localhost:5050"
client = LlamaStackClientOkHttpClient
                .builder()
                .baseUrl(remoteURL)
                .headers(mapOf("x-llamastack-client-version" to listOf("0.1.2")))
                .build()
```
</td>
</tr>
</table>

### Agents

Llama Stack agent is capable of running multi-turn inference using both customized and built-in tools.  

Create the agent configuration:
```
        val agentConfig =
            AgentConfig.builder()
                .enableSessionPersistence(false)
                .instructions("You're a helpful assistant")
                .maxInferIters(100)
                .model("meta-llama/Llama-3.1-8B-Instruct")
                .samplingParams(
                    SamplingParams.builder()
                        .strategy(
                            SamplingParams.Strategy.ofGreedySampling()
                        )
                        .build()
                )
                .toolChoice(AgentConfig.ToolChoice.AUTO)
                .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                .clientTools(
                    listOf(
                        CustomTools.getCreateCalendarEventTool() #Custom local tools
                    )
                )
                .build()
```

Create the agent:
```
        val agentService = client!!.agents()
        val agentCreateResponse = agentService.create(
            AgentCreateParams.builder()
                .agentConfig(agentConfig)
                .build(),
        )
        val agentId = agentCreateResponse.agentId()
```

Create the session:
```
        val sessionService = agentService.session()
        val agentSessionCreateResponse = sessionService.create(
            AgentSessionCreateParams.builder()
                .agentId(agentId)
                .sessionName("test-session")
                .build()
        )

        val sessionId = agentSessionCreateResponse.sessionId()
```

Create a turn:
```
        val turnService = agentService.turn()
        turnService.createStreaming(
            AgentTurnCreateParams.builder()
                .agentId(agentId)
                .messages(
                    listOf(
                        AgentTurnCreateParams.Message.ofUser(
                            UserMessage.builder()
                                .content(InterleavedContent.ofString("What is the capital of France?"))
                                .build()
                            )
                    )
                .sessionId(sessionId)
                .build()
        )
```

Handle the stream chunk callback:
```
        agentTurnCreateResponseStream.use {
            agentTurnCreateResponseStream.asSequence().forEach {
                val agentResponsePayload = it.responseStreamChunk()?.event()?.payload()
                if (agentResponsePayload != null) {
                    when {
                        agentResponsePayload.isAgentTurnResponseTurnStart() -> {
                            // Handle Turn Start Payload
                        }
                        agentResponsePayload.isAgentTurnResponseStepStart() -> {
                            // Handle Step Start Payload
                        }
                        agentResponsePayload.isAgentTurnResponseStepProgress() -> {
                            // Handle Step Progress Payload
                        }
                        agentResponsePayload.isAgentTurnResponseStepComplete() -> {
                            // Handle Step Complete Payload
                        }
                        agentResponsePayload.isAgentTurnResponseTurnComplete() -> {
                            // Handle Turn Complete Payload
                        }
                    }
                }
            }
        }
```

More examples can be found in our [demo app](https://github.com/meta-llama/llama-stack-apps/tree/main/examples/android_app) 


### Run Image Reasoning
The Kotlin SDK also supports single image inference where the image can be a HTTP web url or captured on your local device.  

Create an image inference with agent:

```
        val agentTurnCreateResponseStream =
            turnService.createStreaming(
                AgentTurnCreateParams.builder()
                    .agentId(agentId)
                    .messages(
                        listOf(
                            AgentTurnCreateParams.Message.ofUser(
                                UserMessage.builder()
                                    .content(InterleavedContent.ofString("What is in the image?"))
                                    .build()
                            ),
                            AgentTurnCreateParams.Message.ofUser(
                                UserMessage.builder()
                                    .content(InterleavedContent.ofImageContentItem(
                                        InterleavedContent.ImageContentItem.builder()
                                            .image(image)
                                            .type(JsonValue.from("image"))
                                            .build()
                                    ))
                                    .build()
                            )
                         )
                    )
                    .sessionId(sessionId)
                    .build()
            )
```

Note that image captured on device needs to be encoded with Base64 before sending it to the model. Check out our demo app example [here](https://github.com/meta-llama/llama-stack-apps/tree/main/examples/android_app)


### Run Simple Inference
With the Kotlin Library managing all the major operational logic, there are minimal to no changes when running simple chat inference for local or remote:

```
val result = client!!.inference().chatCompletion(
            InferenceChatCompletionParams.builder()
                .modelId(modelName)
                .messages(listOfMessages)
                .build()
        )

// response contains string with response from model
var response = result.completionMessage().content().string();
```

[Remote only] For inference with a streaming response:

```
val result = client!!.inference().chatCompletionStreaming(
            InferenceChatCompletionParams.builder()
                .modelId(modelName)
                .messages(listOfMessages)
                .build()
        )

// Response can be received as a asChatCompletionResponseStreamChunk as part of a callback.
// See Android demo app for a detailed implementation example.
```

### Setup Simple Inference with Custom Tool Calling

Android demo app for more details: [Custom Tool Calling](https://github.com/meta-llama/llama-stack-apps/tree/main/examples/android_app#tool-calling)

## Advanced Users

The purpose of this section is to share more details with users that would like to dive deeper into the Llama Stack Kotlin Library. Whether you’re interested in contributing to the open source library, debugging or just want to learn more, this section is for you!

### Prerequisite

You must complete the following steps:
1. Clone the repo (`git clone https://github.com/meta-llama/llama-stack-client-kotlin.git -b release/0.1.2`)
2. Port the appropriate ExecuTorch libraries over into your Llama Stack Kotlin library environment.
```
cd llama-stack-client-kotlin-client-local
sh download-prebuilt-et-lib.sh --unzip
```

Now you will notice that the `jni/` , `libs/`, and `AndroidManifest.xml` files from the `executorch.aar` file are present in the local module. This way the local client module will be able to realize the ExecuTorch SDK.

### Building for Development/Debugging
If you’d like to contribute to the Kotlin library via development, debug, or add play around with the library with various print statements, run the following command in your terminal under the llama-stack-client-kotlin directory.

```
sh build-libs.sh
```

Output: .jar files located in the build-jars directory

Copy the .jar files over to the lib directory in your Android app. At the same time make sure to remove the llama-stack-client-kotlin dependency within your build.gradle.kts file in your app (or if you are using the demo app) to avoid having multiple llama stack client dependencies.

### Additional Options for Local Inferencing
Currently we provide additional properties support with local inferencing. In order to get the tokens/sec metric for each inference call, add the following code in your Android app after you run your chatCompletion inference function. The Reference app has this implementation as well:
```
var tps = (result._additionalProperties()["tps"] as JsonNumber).value as Float
```
We will be adding more properties in the future.

### Additional Options for Remote Inferencing

#### Network options

##### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default.
You can provide a `maxRetries` on the client builder to configure this:

```kotlin
val client = LlamaStackClientOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

##### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```kotlin
val client = LlamaStackClientOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

##### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```kotlin
val client = LlamaStackClientOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
        Type.HTTP,
        new InetSocketAddress("proxy.com", 8080)
    ))
    .build()
```

##### Environments

Requests are made to the production environment by default. You can connect to other environments, like `sandbox`, via the client builder:

```kotlin
val client = LlamaStackClientOkHttpClient.builder()
    .fromEnv()
    .sandbox()
    .build()
```

### Error Handling
This library throws exceptions in a single hierarchy for easy handling:

- **`LlamaStackClientException`** - Base exception for all exceptions

  - **`LlamaStackClientServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

    | 400    | BadRequestException           |
    | ------ | ----------------------------- |
    | 401    | AuthenticationException       |
    | 403    | PermissionDeniedException     |
    | 404    | NotFoundException             |
    | 422    | UnprocessableEntityException  |
    | 429    | RateLimitException            |
    | 5xx    | InternalServerException       |
    | others | UnexpectedStatusCodeException |

  - **`LlamaStackClientIoException`** - I/O networking errors
  - **`LlamaStackClientInvalidDataException`** - any other exceptions on the client side, e.g.:
    - We failed to serialize the request body
    - We failed to parse the response body (has access to response code and body)

## Reporting Issues
If you encountered any bugs or issues following this guide please file a bug/issue on our [Github issue tracker](https://github.com/meta-llama/llama-stack-client-kotlin/issues).

## Known Issues
We're aware of the following issues and are working to resolve them:
- Because of the different model behavior when handling function calls and special tags such as "ipython", Llama Stack currently returning streaming events payload for Llama 3.2 1B/3B models as textDelta object rather than toolCallDelta object when making a tool call. At the the StepComplete, the Llama Stack will still return the entire toolCall detail.

## Thanks
We'd like to extend our thanks to the ExecuTorch team for providing their support as we integrated ExecuTorch as one of the local inference distributors for Llama Stack. Checkout [ExecuTorch Github repo](https://github.com/pytorch/executorch/tree/main) for more information.

---

The API interface is generated using the OpenAPI standard with [Stainless](https://www.stainlessapi.com/).
