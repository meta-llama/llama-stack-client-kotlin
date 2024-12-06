#!/usr/bin/env bash
# Copyright (c) Meta Platforms, Inc. and affiliates.
# All rights reserved.
#
# This source code is licensed under the BSD-style license found in the
# LICENSE file in the root directory of this source tree.

# Purpose: The goal of this script is to get ExecuTorch AAR file for local inferencing.
# How to run:
# - `sh download-prebuild-et-lib.sh` : download ExecuTorch AAR in apps/libs (meant to be run in Android App environment)
# - `sh download-prebuild-et-lib.sh` : download+unzip ExecuTorch AAR in working directory and clean-up.
# Based on ExecuTorch Commit ID: 0a12e33d22a3d44d1aa2af5f0d0673d45b962553

set -eu

AAR_URL="https://ossci-android.s3.amazonaws.com/executorch/release/executorch-20241202/executorch.aar"
AAR_SHASUM_URL="https://ossci-android.s3.amazonaws.com/executorch/release/executorch-20241202/executorch.aar.sha256sums"
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

curl -O "${AAR_SHASUM_URL}"
shasum --check --status executorch.aar.sha256sums || curl "${AAR_URL}" -o "${LIBS_PATH}/executorch.aar"

if [ "$UNZIP" = true ]; then
    unzip -q executorch.aar
    rm "executorch.aar" "executorch.aar.sha256sums"
fi