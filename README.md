# Llama Stack Client Kotlin API Library

We are excited to share a guide for a Kotlin Library that brings front the benefits of Llama Stack to your Android device. This library is a set of SDKs that provide a simple and effective way to integrate AI capabilities into your Android app whether it is local (on-device) or remote inference. 

Features:
- Local Inferencing: Run Llama models purely on-device with real-time processing. We currently utilize ExecuTorch as the local inference distributor and may support others in the future.
- Remote Inferencing: Perform inferencing tasks remotely with Llama models hosted on a remote connection (or serverless localhost).
- Simple Integration: With easy-to-use APIs, a developer can quickly integrate Llama Stack in their Android app. The difference with local vs remote inferencing is also minimal.

Latest release notes: TODO Add Release Notes

## Android Demo App
Check out our demo app to see how to integrate Llama Stack into your Android app:
 - TODO: Link to Demo App

The key files in the app are `LlamaStackLocalInference.kt`, `LlamaStackRemoteInference.kts`, and `MainActivity.java`. With encompassed business logic, the app shows how to use Llama Stack for both the environments.

## Quick Start

### Add Dependencies
Add the following dependency in your `build.gradle.kts` file:
```
dependencies {
 implementation("com.llama.llamastack:llama-stack-client-kotlin:0.0.54")
}
```
This will download jar files in your gradle cache in a directory like `~/.gradle/caches/modules-2/files-2.1/com.llama.llamastack/` 

If you plan on doing remote inferencing this is sufficient to get started.

**This is an important step for local inferencing**

For local inferencing, it is required to include the ExecuTorch library into your app. You can download the ExecuTorch library by:
1. Download the `download-prebuilt-et-lib.sh` script from the github directory (link)
2. Move the script to the top level of your Android app where the app directory resides:
- TODO: Add image of directory
3. Run `sh download-prebuilt-et-lib.sh` to create an `app/libs` directory and download the `executorch.aar` in that path. This generates an ExecuTorch library for the XNNPACK delegate.

Last step is to make sure to add the `executorch.aar` dependency in your `build.gradle.kts` file:
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
pip install llama-stack=0.0.54
llama stack build --template fireworks --image-type conda
export FIREWORKS_API_KEY=<SOME_KEY>
llama stack run /Users/<your_username>/.llama/distributions/llamastack-fireworks/fireworks-run.yaml --port=5050
```

Other inference providers: https://llama-stack.readthedocs.io/en/latest/index.html#supported-llama-stack-implementations

TODO: Link to Demo App on how to set this remote localhost in the Settings.

### Initialize
Initialize Llama Stack for local inference using the following:
```
client = LlamaStackClientLocalClient
                    .builder()
                    .modelPath(modelPath)
                    .tokenizerPath(tokenizerPath)
                    .temperature(temperature)
                    .build()
```

Similarly, remote inference is initialized like so:
```
// remoteURL is a string like "http://localhost:5050"
client = LlamaStackClientOkHttpClient
                .builder()
                .baseUrl(remoteURL) 
                .build()
```

### Run Inference
With the Kotlin Library managing all the major operational logic, there are minimal to no changes when running simple chat inference for local or remote:

```
val result = client!!.inference().chatCompletion(
            InferenceChatCompletionParams.builder()
                .modelId(modelName)
                .putAdditionalQueryParam("seq_len", sequenceLength.toString())
                .messages(listOfMessages)
                .build()
        )

// response contains string with response from model
var response = result.asChatCompletionResponse().completionMessage().content().string();
```

### Setup Tool Calling

TODO: Link to Android demo app readme for more details


## Advanced Users

The purpose of this section is to share more details with users that would like to dive deeper into the Llama Stack Kotlin Library. Whether you’re interested in contributing to the open source library, debugging or just want to learn more, this section is for you!

### Prerequisite

You must complete the following steps:
1. Clone the repo
2. Port the appropriate ExecuTorch libraries over into your Llama Stack Kotlin library environment.
```
cd llama-stack-client-kotlin-client-local
sh download-prebuilt-et-lib.sh --unzip
```

Now you will notice that the jni/ , libs/, and AndroidManifest.xml files from the executorch.aar file are present in the local module. This way the local client module will be able to realize the ExecuTorch SDK.

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
var tps = (result.asChatCompletionResponse()._additionalProperties()["tps"] as JsonNumber).value as Float
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



## Known Issues
1. Streaming response is a work-in-progress for local and remote inference
2. Due to #1, agents are not supported at the time. LS agents only work in streaming mode
3. Changing to another model is a work in progress for local and remote platforms

## Thanks
- We'd like to extend our thanks to the ExecuTorch team for providing their support as we integrated ExecuTorch as one of the local inference distributors for Llama Stack. Checkout [ExecuTorch Github repo](https://github.com/pytorch/executorch/tree/main) for more information about Executorch.

---

The API interface is generated using the OpenAPI standard with [Stainless](https://www.stainlessapi.com/).
