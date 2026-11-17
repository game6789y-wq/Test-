# MaaHatsuboshiTA Android

<p align="center">
  <strong>Android-native companion for controlling a second Android device</strong><br>
  A development project inspired by <a href="https://github.com/Carpenter-MK1/MaaHatsuboshiTA">Carpenter-MK1/MaaHatsuboshiTA</a>.
</p>

<p align="center">
  <a href="https://github.com/game6789y-wq/Test-/actions/workflows/build-maahatsuboshi-android.yml">
    <img alt="Android build workflow" src="https://github.com/game6789y-wq/Test-/actions/workflows/build-maahatsuboshi-android.yml/badge.svg" />
  </a>
  <a href="https://github.com/game6789y-wq/Test-/tree/android-maahatsuboshi">
    <img alt="Development branch" src="https://img.shields.io/badge/branch-android--maahatsuboshi-blue" />
  </a>
  <img alt="Platform" src="https://img.shields.io/badge/platform-Android-3DDC84?logo=android&logoColor=white" />
</p>

---

## Overview

MaaHatsuboshiTA Android is an Android application project intended to become a companion/controller for a second Android device. The current codebase is an early development foundation: it provides a native dashboard and the initial Kotlin, C++, and Rust project structure.

**This is not yet a functional automation tool.** Wireless ADB pairing, device communication, screen streaming, remote input, OCR, and task execution have not been completed.

## Technology

| Component | Purpose |
| --- | --- |
| Kotlin + Jetpack Compose | Native Android interface |
| C++ + JNI + CMake | Native processing layer |
| Rust | Platform-independent task-state core |
| GitHub Actions | Automated tests and debug APK build |

## Current implementation

- Compose dashboard with remote device IP and ADB connection fields.
- Pairing-port and pairing-code input fields.
- Native C++ library connected through JNI.
- Rust task-state core with unit tests.
- CI workflow configured to run Rust tests, build a debug APK, verify its checksum, and upload the APK as a workflow artifact.

### Not implemented yet

- Wireless Debugging pairing, authentication, and ADB transport.
- Remote screen capture or streaming.
- Remote touch and key input forwarding.
- OCR and image/template matching.
- Daily, Contest, Farm New Account, or other task pipelines.
- Import and integration of upstream resources or MaaFramework components.

## Build status and downloads

- **[Android build workflow](https://github.com/game6789y-wq/Test-/actions/workflows/build-maahatsuboshi-android.yml)**
- **[Workflow runs and build artifacts](https://github.com/game6789y-wq/Test-/actions)**
- **[Development branch](https://github.com/game6789y-wq/Test-/tree/android-maahatsuboshi)**

Debug APKs are distributed as workflow artifacts only after a successful build and verification. A successful debug build does not mean the device-control features are complete. No production release is promised at this stage.

## Build locally

Requirements:
- Android SDK
- JDK 17
- Gradle compatible with the project's Android Gradle Plugin
- Rust toolchain (for Rust tests)

Build the Android debug APK from the project directory:

```bash
cd maahatsuboshi-android
gradle --no-daemon assembleDebug
```

Run the Rust tests:

```bash
cd maahatsuboshi-android/rust
cargo test
```

Expected APK path:

```
maahatsuboshi-android/app/build/outputs/apk/debug/app-debug.apk
```

## Roadmap

1. Implement secure Wireless Debugging pairing and authenticated ADB communication.
2. Add authorized remote screen capture and input forwarding.
3. Design a reliable device connection lifecycle, timeout handling, reconnect, pause, and stop behavior.
4. Add OCR and template-matching components.
5. Port task pipelines only after reviewing upstream licensing and dependencies.
6. Validate on real devices before describing the app as functional.

## Safety and permissions

- Pair only with Android devices that you own or are explicitly authorized to control.
- Display the target device and connection state clearly before sending input.
- Do not store pairing codes or credentials unnecessarily.
- Treat diagnostic and screen content as potentially private.

## Upstream project and licensing

This project is inspired by the upstream repository linked above. Before importing source files, images, models, binaries, or framework components, review the applicable licenses and preserve required copyright and third-party notices. The current foundation does not claim to include the upstream automation pipelines or assets.

---

<p align="center">
  <sub>MaaHatsuboshiTA Android · Early development foundation</sub>
</p>
