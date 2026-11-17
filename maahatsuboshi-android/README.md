# MaaHatsuboshiTA Android

Android-native companion/controller project inspired by [Carpenter-MK1/MaaHatsuboshiTA](https://github.com/Carpenter-MK1/MaaHatsuboshiTA).

> **Development status:** early foundation. The current app is not yet able to pair with or control another Android device.

## Project structure

- `app/src/main/java/` — Kotlin + Jetpack Compose application UI.
- `app/src/main/cpp/` — C++ native library, JNI bridge, and CMake configuration.
- `rust/` — platform-independent task-state core and Rust tests.
- `app/src/main/AndroidManifest.xml` — Android app manifest.
- `.github/workflows/build-maahatsuboshi-android.yml` — CI workflow for tests and debug APK generation.

## Implemented

- Native Compose dashboard.
- Input fields for target IP, ADB port, wireless pairing port, and pairing code.
- Initial C++ JNI library integration.
- Rust task-state model with start/pause state handling and unit tests.
- GitHub Actions workflow for Rust tests, Android debug build, APK/checksum verification, and artifact upload.

## Not implemented

- Wireless ADB pairing or authentication.
- ADB network transport and device session management.
- Remote screen capture or streaming.
- Touch/key input forwarding.
- OCR, template matching, or game recognition.
- Daily, Contest, Farm New Account, or other automation task pipelines.

The Connect control is currently a UI placeholder. Do not treat this foundation as a working automation app.

## Requirements

- JDK 17
- Android SDK (platform/build-tools versions configured by the Gradle project)
- Gradle compatible with the Android Gradle Plugin
- Rust toolchain for running the Rust tests

## Build Android APK

From this directory:

```bash
gradle --no-daemon assembleDebug
```

APK output:

```
app/build/outputs/apk/debug/app-debug.apk
```

## Run Rust tests

```bash
cd rust
cargo test
```

## CI

The workflow runs Rust tests and builds a debug APK. It then verifies the generated APK and checksum before uploading the artifact. Check the [GitHub Actions page](https://github.com/game6789y-wq/Test-/actions) for the actual result of each run.

A debug APK artifact is a test build, not a production release. Do not assume a build succeeded until the corresponding workflow run reports success and the artifact is present.

## Development roadmap

1. Implement secure Wireless Debugging pairing and authenticated ADB transport.
2. Add connection state, timeout, reconnect, pause, and stop handling.
3. Implement authorized screen capture and input forwarding.
4. Add OCR and template matching.
5. Port upstream task pipelines after reviewing their source licenses and dependencies.
6. Test on real devices before claiming feature completion.

## Security and licensing

Only connect to devices you own or are authorized to control. Avoid logging or storing pairing codes and private screen content.

This project is inspired by the upstream project. Review its license and all third-party notices before reusing source code, resources, models, binaries, or framework components. No upstream automation assets are claimed to be included in this foundation.
