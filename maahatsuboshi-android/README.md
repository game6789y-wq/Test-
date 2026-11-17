# MaaHatsuboshiTA Android

Android-native companion/controller inspired by [Carpenter-MK1/MaaHatsuboshiTA](https://github.com/Carpenter-MK1/MaaHatsuboshiTA).

## Architecture
- Kotlin + Jetpack Compose: Android UI.
- C++ / JNI + CMake: native processing layer.
- Rust: platform-independent task state core.
- Android Wireless debugging: intended connection to a second Android device.

## Foundation build 0.1.0
- Android Gradle project and Compose dashboard.
- Remote IP, ADB port and wireless pairing fields.
- C++ JNI library loaded by the app.
- Rust task-state crate with unit tests.
- GitHub Actions workflow builds a debug APK and uploads it as an artifact.

**Not implemented yet:** ADB pairing/authentication and TLS transport. The Connect button is informational only. Screen capture, input forwarding, OCR/template matching, upstream resource import and game task execution are also pending. This is a buildable development shell, not a working game automation app.

## Build
From this directory, run: gradle --no-daemon assembleDebug
APK output: app/build/outputs/apk/debug/app-debug.apk

Run Rust tests from the rust directory with: cargo test

## Milestones
1. Implement Wireless Debugging pairing and authenticated ADB transport.
2. Add remote screen capture and input forwarding with explicit device authorization.
3. Port upstream task pipelines and resource assets.
4. Add OCR/template matching, timeouts, pause and stop controls.
5. Test on a real second Android device before declaring a functional release.

## Licensing
Review and preserve the upstream license and third-party notices before importing its pipeline files, images, model assets or MaaFramework components. This initial scaffold does not copy upstream binary assets.
