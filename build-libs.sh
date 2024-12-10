# Skip Prism mock test. If you want to enable this (SKIP_MOCK_TESTS=false), you will need to setup Prism server.
# You can follow the error instructions on how to setup and run a server prism
export SKIP_MOCK_TESTS=true

# Code linting
./gradlew :llama-stack-client-kotlin-core:spotlessApply
./gradlew :llama-stack-client-kotlin-client-okhttp:spotlessApply
./gradlew :llama-stack-client-kotlin:spotlessApply
./gradlew :llama-stack-client-kotlin-client-local:spotlessApply

# Remove old jars
rm -rf llama-stack-client-kotlin/build/libs
rm -rf llama-stack-client-kotlin-client-okhttp/build/libs
rm -rf llama-stack-client-kotlin-core/build/libs
rm -rf llama-stack-client-kotlin-client-local/build/libs

./gradlew build

# Copy jars
mkdir -p build-jars
BUILD_JARS_DIR=$(pwd)/build-jars
export BUILD_JARS_DIR
echo $BUILD_JARS_DIR
cp -a llama-stack-client-kotlin/build/libs/. $BUILD_JARS_DIR
cp -a llama-stack-client-kotlin-client-okhttp/build/libs/. $BUILD_JARS_DIR
cp -a llama-stack-client-kotlin-core/build/libs/. $BUILD_JARS_DIR
cp -a llama-stack-client-kotlin-client-local/build/libs/. $BUILD_JARS_DIR
