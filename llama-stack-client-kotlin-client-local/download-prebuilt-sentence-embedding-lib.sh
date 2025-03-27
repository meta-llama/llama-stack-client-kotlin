#!/usr/bin/env bash
# Copyright (c) Meta Platforms, Inc. and affiliates.
# All rights reserved.
#
# This source code is licensed under the BSD-style license found in the
# LICENSE file in the root directory of this source tree.

# Purpose: The goal of this script is to get the Sentence Embedding AAR file for local inferencing.
# How to run:
# - `sh download-prebuilt-sentence-embedding-lib.sh` : download Sentence Embedding AAR in apps/libs (meant to be run in Android App environment)
# - `sh download-prebuilt-sentence-embedding-lib.sh --unzip` : download+unzip Sentence Embedding AAR in working directory and clean-up.

# IMPORTANT not to replace the classes.jar file when unzipping. Replace the names with:
# classes_sentence_embedding.jar and classes_model2dev.jar
# Based on https://github.com/shubham0204/Sentence-Embeddings-Android/releases/tag/v6

set -eu

AAR_URL_SE="https://github.com/shubham0204/Sentence-Embeddings-Android/releases/download/v6/sentence_embeddings.aar"
AAR_URL_M2V="https://github.com/shubham0204/Sentence-Embeddings-Android/releases/download/v6/model2vec.aar"
LIBS_PATH="$(dirname "$0")/app/libs"
UNZIP=false
while [[ $# -gt 0 ]]; do
    case $1 in
        --unzip)
            UNZIP=true
            LIBS_PATH="$(dirname "$0")"
            shift
            ;;
        *)
            echo "Unknown option: $1"
            exit 1
            ;;
    esac
done

if [ "$UNZIP" = false ]; then
    mkdir -p "${LIBS_PATH}"
fi

wget "${AAR_URL_SE}" -O "${LIBS_PATH}/sentence_embeddings.aar"
wget "${AAR_URL_M2V}" -O "${LIBS_PATH}/model2vec.aar"

if [ "$UNZIP" = true ]; then
    unzip -q sentence_embeddings.aar
    rm "sentence_embeddings.aar"

    unzip -q model2vec.aar
    rm "model2vec.aar"
fi

mv classes_sentence_embedding.jar "${LIBS_PATH}/libs"
mv classes_model2dev.jar "${LIBS_PATH}/libs"