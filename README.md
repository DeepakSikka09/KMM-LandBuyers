This is a Kotlin Multiplatform project targeting Android, iOS.
 ** `Create by Deepak Sikka`

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* `/shared` is for the code that will be shared between all targets in the project.
  The most important subfolder is `commonMain`. If preferred, you can add code to the platform-specific folders here too.


* `/Ktor` as an HTTP client for retrieving data over the internet.

* `/kotlinx.serialization` to deserialize JSON responses into objects of entity classes.

* `/kotlinx.coroutines` to write asynchronous code.

* `/SQLDelight` to generate Kotlin code from SQL queries and create a type-safe database API.

*  `/Koin` to provide platform-specific database drivers via dependency injection.
*  `/libs.version catalogue`
* `/build.gradle.kts` shared file for androidMain and iosMain
*    ------------      `/Coin Detailing` ---------------- 
* An image loading library for Android and Compose Multiplatform. Coil is:
 *       https://github.com/coil-kt/coil
* `/Fast:` Coil performs a number of optimizations including memory and disk caching, downsampling the image, automatically pausing/cancelling requests, and more.
* `/Lightweight:` Coil only depends on Kotlin, Coroutines, and Okio and works seamlessly with Google's R8 code shrinker.
* `/Easy to use:` Coil's API leverages Kotlin's language features for simplicity and minimal boilerplate.
* `/Modern:` Coil is Kotlin-first and interoperates with modern libraries including Compose, Coroutines, Okio, OkHttp, and Ktor.

* 
Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…