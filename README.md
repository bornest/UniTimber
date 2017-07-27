# UniTimber
[![](https://jitpack.io/v/bornest/UniTimber.svg)](https://jitpack.io/#bornest/UniTimber)

Android library that is a modification and extension of [Timber](https://github.com/JakeWharton/timber) and [Slimber](https://github.com/PaulWoitaschek/Slimber).

Decoupled from Android platform (so it can be used in Unit tests).

Provides extra Kotlin extensions for more idiomatic usage.

**Most of the Kotlin functions and methods are `inline` and don’t add to your app’s method
count.**

# Setup

To use the latest release add following code to your Gradle dependencies:

```groovy
//core
compile 'com.github.bornest.UniTimber:core:v0.1.0'

//JUnit test rule for Unit Tests
testCompile 'com.github.bornest.UniTimber:test-junit:v0.1.0'

//JUnit test rule for Instrumented Tests
androidTestCompile 'com.github.bornest.UniTimber:test-junit:v0.1.0'
```


To use the latest SNAPSHOT add following code to your Gradle dependencies:

```groovy
//core
compile 'com.github.bornest.UniTimber:core:-SNAPSHOT'

//JUnit test rule for Unit Tests
testCompile 'com.github.bornest.UniTimber:test-junit:-SNAPSHOT'

//JUnit test rule for Instrumented Tests
androidTestCompile 'com.github.bornest.UniTimber:test-junit:-SNAPSHOT'
```


# Usage

## 1. Plant a tree

### a. for logging in your App's main code and in Instrumented tests

In your App class's `onCreate()` add the following code:
```kotlin

if (BuildConfig.DEBUG) {
    UniTimber.plant(UniTimber.DebugTree())
}

```

### b. for logging in your Unit Tests

In your test class add the following field:

```kotlin

@Rule
@JvmField
val uniTimberRule = UniTimberTestRule()

```

## 2. Start logging

There's a lot of ways you can log.

Example:

```kotlin

// if lifeCycleLoggingEnabled == true
// log message "onCreate()" on VERBOSE log level with specified TAG

v(lifeCycleLoggingEnabled, TAG) { "onCreate()" }

```

This library contains [original Kotlin extensions](https://github.com/bornest/UniTimber/blob/master/core/src/main/java/com/github/unitimber/core/extensions/uniTimberBasic.kt) from [Slimber](https://github.com/PaulWoitaschek/Slimber) (adapted for UniTimber).

As well as [additional Kotlin extensions](https://github.com/bornest/UniTimber/blob/master/core/src/main/java/com/github/unitimber/core/extensions/uniTimberAdvanced.kt) for even more flexibility.

# Important note

The library is in the early stages of development – there almost certainly will be
some breaking changes in the future.

Test coverage will be increased over time.

# Special Thanks

Big thanks to [Jake Wharton](https://github.com/JakeWharton) and [Paul Woitaschek](https://github.com/PaulWoitaschek) - without your libraries this library wouldn't exist.

**Please let me know if I need to mention original libraries' license info somewhere except the source code files.**

# License

```
Copyright (c) 2017, Borislav Nesterov

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```
