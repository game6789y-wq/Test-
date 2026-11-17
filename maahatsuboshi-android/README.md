# MaaHatsuboshiTA Android

Native Android companion/controller project inspired by [Carpenter-MK1/MaaHatsuboshiTA](https://github.com/Carpenter-MK1/MaaHatsuboshiTA).

> **Status: early foundation — not yet a functional ADB controller.** The current app does not pair with or control a second Android device.

## Architecture

- **Kotlin + Jetpack Compose** — Android application and dashboard.
- **C++ + JNI + CMake** — initial native library integration.
- **Rust** — platform-independent task-state core.
- **GitHub Actions** — Rust tests and Android debug APK workflow.

## Project layout

```text
maahatsuboshi-android/
├── app/
│   └── src/main/
│       ├── java/                 # Kotlin application UI
│       ├── cpp/                  # C++, JNI, CMake
│       └── AndroidManifest.xml
├── rust/                         # Rust task core and tests
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## Implemented

- Compose dashboard.
- Input fields for target IP, ADB port, wireless pairing port, and pairing code.
- Initial C++ JNI library.
- Rust task-state model with start/pause handling and unit tests.
- CI workflow configured to run Rust tests, build a debug APK, verify its checksum, and upload the artifact.

## Not implemented

- Wireless ADB pairing, authentication, or network transport.
- Device session management and reconnect logic.
- Remote screen capture or streaming.
- Touch/key input forwarding.
- OCR, template matching, or game recognition.
- Daily, Contest, Farm New Account, or other automation pipelines.

The **Connect** button is currently a placeholder. The app should be treated as a development shell only.

## Requirements

- JDK 17
- Android SDK with the packages required by the Gradle configuration
- Gradle compatible with the configured Android Gradle Plugin
- Rust toolchain (for Rust tests)

## Build debug APK

Run from this directory:

```bash
gradle --no-daemon assembleDebug
```

Expected output:

```
app/build/outputs/apk/debug/app-debug.apk
```

## Run Rust tests

```bash
cd rust
cargo test
```

## Continuous integration

See [GitHub Actions](https://github.com/game6789y-wq/Test-/actions/workflows/build-maahatsuboshi-android.yml) for the current build result.

The workflow is intended to:
1. Run Rust unit tests.
2. Build the Android debug APK.
3. Verify the APK and checksum.
4. Upload the APK as a workflow artifact.

Only treat an APK as available when the run succeeds and the artifact is present. A debug artifact is not a signed production release.

## Development roadmap

1. Implement secure Wireless Debugging pairing and authenticated ADB transport.
2. Add device connection state, timeout, disconnect, and reconnect handling.
3. Implement authorized screen capture and input forwarding.
4. Add OCR and template matching.
5. Port automation pipelines after reviewing upstream licenses and dependencies.
6. Test on real devices and document verified compatibility.

## Security and licensing

Only connect to devices you own or are authorized to control. Do not unnecessarily log or store pairing codes, credentials, or private screen content.

This project is inspired by the upstream project. Review its license and all third-party notices before reusing source code, resources, models, binaries, or framework components. No upstream automation assets are claimed to be included in this foundation.
