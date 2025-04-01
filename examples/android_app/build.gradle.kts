/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
  id("com.android.application") version "8.1.0" apply false
  id("org.jetbrains.kotlin.android") version "2.1.0"  apply false
}

buildscript {
  val objectboxVersion by extra("4.2.0")

  repositories {
    mavenCentral()
  }

  dependencies {
    classpath("io.objectbox:objectbox-gradle-plugin:$objectboxVersion")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.0")
  }
}
