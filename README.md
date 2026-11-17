# MaaHatsuboshiTA Android

<p align="center">
  <strong>A native Android companion for a second Android device</strong><br />
  Built with Kotlin, C++, and Rust · Early development
</p>

<p align="center">
  <a href="https://github.com/game6789y-wq/Test-/actions/workflows/build-maahatsuboshi-android.yml">
    <img alt="Android CI" src="https://github.com/game6789y-wq/Test-/actions/workflows/build-maahatsuboshi-android.yml/badge.svg" />
  </a>
  <a href="https://github.com/game6789y-wq/Test-/tree/android-maahatsuboshi">
    <img alt="Development branch" src="https://img.shields.io/badge/branch-android--maahatsuboshi-blue" />
  </a>
  <img alt="Android" src="https://img.shields.io/badge/platform-Android-3DDC84?logo=android&logoColor=white" />
  <img alt="Kotlin" src="https://img.shields.io/badge/Kotlin-2.0.21-7F52FF?logo=kotlin&logoColor=white" />
  <img alt="C++" src="https://img.shields.io/badge/C++-Native-00599C?logo=cplusplus&logoColor=white" />
  <img alt="Rust" src="https://img.shields.io/badge/Rust-Core-000000?logo=rust&logoColor=white" />
</p>

---

## About

**MaaHatsuboshiTA Android** is an Android application project inspired by [Carpenter-MK1/MaaHatsuboshiTA](https://github.com/Carpenter-MK1/MaaHatsuboshiTA). The long-term goal is to provide a native Android interface for connecting to and operating a second Android device through Android Debug Bridge (ADB).

The project is being developed in stages, with a focus on a maintainable native architecture.

> **Current status: foundation only.** The app currently contains a starter dashboard and initial native components. It cannot yet pair with, communicate with, or control another Android device.

## Architecture

| Layer | Technology | Responsibility |
| --- | --- | --- |
| Android app | Kotlin, Jetpack Compose | Native interface and user settings |
| Native engine | C++, JNI, CMake | Native processing integration |
| Task core | Rust | Initial task-state model |
| CI | GitHub Actions | Tests, debug APK build, verification, artifact upload |

## What exists today

- Android Compose dashboard.
- Fields for target device IP, ADB port, wireless pairing port, and pairing code.
- Initial C++ library exposed to Kotlin through JNI.
- Rust task-state model with start/pause handling and unit tests.
- GitHub Actions workflow configured for Rust tests and Android debug APK generation.

## Planned — not available yet

- Wireless Debugging pairing, authentication, and ADB transport.
- Device connection lifecycle and reconnect handling.
- Remote screen capture or streaming.
- Remote touch and key input forwarding.
- OCR and image/template matching.
- Daily, Contest, Farm New Account, and other automation pipelines.
- Integration of upstream frameworks, resources, or models.

The current **Connect** control is a placeholder. Do not use this project as if it were already a working remote-control or game-automation application.

## Build and CI

Check the live status rather than relying on a README snapshot:

- [Android build workflow](https://github.com/game6789y-wq/Test-/actions/workflows/build-maahatsuboshi-android.yml)
- [All workflow runs and artifacts](https://github.com/game6789y-wq/Test-/actions)
- [Development branch](https://github.com/game6789y-wq/Test-/tree/android-maahatsuboshi)

A debug APK is available only when a workflow run completes successfully, the APK verification step passes, and the artifact is uploaded. A debug artifact is for testing; it is not a production release.

## Build locally

### Requirements

- JDK 17
- Android SDK and the SDK packages required by the Gradle project
- Gradle compatible with the configured Android Gradle Plugin
- Rust toolchain for Rust tests

### Android debug APK

From the repository root:

```bash
cd maahatsuboshi-android
gradle --no-daemon assembleDebug
```

Output:

```
app/build/outputs/apk/debug/app-debug.apk
```

### Rust tests

```bash
cd maahatsuboshi-android/rust
cargo test
```

## Roadmap

1. Implement secure Android Wireless Debugging pairing and authenticated ADB communication.
2. Add connection state, timeout, disconnect, and reconnect handling.
3. Implement authorized screen capture and remote input forwarding.
4. Add OCR and template-matching capabilities.
5. Port automation pipelines in small, testable stages.
6. Validate compatibility and reliability on real Android devices.

## Security

- Connect only to devices you own or are explicitly authorized to control.
- Make the target device and connection state visible before sending commands.
- Do not expose pairing codes, credentials, or private screen content in logs.
- Keep remote-control features disabled until pairing and authorization are implemented.

## Upstream and third-party licensing

This project is inspired by the upstream repository linked above. Before reusing source code, assets, models, binaries, or framework components, review their licenses and preserve all required copyright and third-party notices. This repository's current foundation does not claim to include the upstream automation pipelines or assets.

---

<p align="center">
  <sub>MaaHatsuboshiTA Android · Open development project</sub>
</p>
