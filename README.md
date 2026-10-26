# BootCheck for Android

<p align="center">
  <strong>A clearer view of your Android device's boot and security signals</strong><br>
  A practical utility for checking selected bootloader, root, and integrity indicators.
</p>

<p align="center">
  <a href="https://github.com/game6789y-wq/Test-/releases">
    <img alt="Download APK" src="https://img.shields.io/badge/Download-APK-218838?logo=android&logoColor=white" />
  </a>
  <a href="https://github.com/game6789y-wq/Test-/actions/workflows/build-apk.yml">
    <img alt="Build status" src="https://github.com/game6789y-wq/Test-/actions/workflows/build-apk.yml/badge.svg" />
  </a>
  <a href="https://github.com/game6789y-wq/Test-/commits/main">
    <img alt="Latest commits" src="https://img.shields.io/github/last-commit/game6789y-wq/Test-" />
  </a>
</p>

---

## About

**BootCheck** is an Android device-inspection utility that brings selected boot and security-related checks together. It is intended to help users understand device configuration and investigate compatibility or troubleshooting questions.

## Key areas

| Area | What it helps you investigate |
| --- | --- |
| **Bootloader** | Available indicators about the device's bootloader state |
| **Root detection** | Signals that may indicate root access or system modification |
| **Integrity checks** | Available device or app integrity-related findings |
| **Troubleshooting** | Clues to help guide further investigation when an app or feature has compatibility issues |

The checks available and their results can vary by device, manufacturer, Android version, and system configuration. Treat findings as indicators—not definitive proof.

## Who might use it?

- Android users exploring their device's configuration.
- Users troubleshooting bootloader- or root-related compatibility issues.
- Developers and testers performing an initial device check.

## Download and install

1. Open **[GitHub Releases](https://github.com/game6789y-wq/Test-/releases)**.
2. Select a release and download `app-debug.apk`.
3. Review the release notes and checksum file, if included.
4. Open the APK on your Android device and follow Android's installation prompts. Only install APKs you trust.

### Important signing note

The current automated workflow creates a **debug-signed test APK**, not a production-signed release. Each workflow run generates a temporary debug keystore, so its signing certificate can differ between builds. Android may not allow an update over an older build signed with a different certificate. Uninstalling the old app may resolve that conflict, but **can delete its local data**.

## Accuracy and safe use

- A clean result does **not** guarantee that a device is secure.
- A detected signal does **not** always mean the device is compromised; false positives are possible.
- Device restrictions can prevent checks from seeing every relevant detail.
- Verify important findings with trusted tools and independent sources.
- Avoid publicly sharing diagnostic output that contains private device information.

BootCheck is an informational aid and should not be the sole basis for high-impact security decisions.

## Project links

- **[Download releases](https://github.com/game6789y-wq/Test-/releases)**
- **[Build history and logs](https://github.com/game6789y-wq/Test-/actions)**
- **[Source archive](https://github.com/game6789y-wq/Test-/blob/main/bootcheck-oct-27-2026-12-24-44-am.zip)**
- **[Report an issue](https://github.com/game6789y-wq/Test-/issues)**

## For contributors

The Android project is stored in the source ZIP. The GitHub Actions workflow builds a debug APK when that archive or the workflow changes, then publishes the APK and SHA-256 checksum to a GitHub Release. Documentation-only changes no longer trigger an unnecessary APK build.

---

<p align="center">
  <sub>BootCheck · Android device inspection · Built with GitHub Actions</sub>
</p>
