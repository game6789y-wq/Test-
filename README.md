# BootCheck for Android

<p align="center">
  <strong>Understand your Android device's boot and security status</strong><br>
  A device-inspection app for reviewing bootloader state, root indicators, and app integrity checks.
</p>

<p align="center">
  <a href="https://github.com/game6789y-wq/Test-/releases">
    <img alt="Download APK" src="https://img.shields.io/badge/Download-Android%20APK-2ea44f?logo=android">
  </a>
  <a href="https://github.com/game6789y-wq/Test-/actions/workflows/build-apk.yml">
    <img alt="Build status" src="https://github.com/game6789y-wq/Test-/actions/workflows/build-apk.yml/badge.svg">
  </a>
</p>

---

## 📱 About BootCheck

**BootCheck** is an Android utility designed to help users inspect selected device-security signals in one place. It presents checks and findings in a more accessible way so users can better understand their device's configuration.

## 🔎 What it helps you review

- **Bootloader status** — review available indicators related to the device's bootloader state.
- **Root indicators** — check for signals that may suggest the device has root access or has been modified.
- **Device and app integrity** — review available integrity-related information and checks.
- **Risk overview** — understand the possible security implications of detected indicators.
- **Results at a glance** — use the app's findings to guide further investigation of the device.

> **Important:** Android versions, device manufacturers, system restrictions, and detection methods can affect results. A check may produce false positives or fail to detect some modifications. BootCheck should be treated as an informational aid, not a guarantee that a device is secure or compromised.

## 👤 Who is it for?

- Android users who want to learn more about their device's configuration.
- Users troubleshooting bootloader or root-related compatibility issues.
- Developers and testers who need a convenient first-pass view of device-security indicators.

## 📥 Download

Get the available Android APK from **[GitHub Releases](https://github.com/game6789y-wq/Test-/releases)**. Review the release notes and verify the checksum when one is provided.

This repository currently distributes a **debug-signed test APK**. It is intended for testing, not as a production-signed release. Android may require you to uninstall a previously installed build if its signing certificate differs; uninstalling can erase that app's local data.

## 🛡️ Privacy and safe use

- Use the findings as diagnostic information and verify important results independently.
- Do not share device reports publicly if they contain information you consider private.
- Do not use the app's results as the sole basis for high-impact security decisions.

## 🧰 Project

- **Source package:** [Android project ZIP](https://github.com/game6789y-wq/Test-/blob/main/bootcheck-oct-27-2026-12-24-44-am.zip)
- **Downloads:** [Releases](https://github.com/game6789y-wq/Test-/releases)
- **Build history:** [GitHub Actions](https://github.com/game6789y-wq/Test-/actions)

---

<p align="center">
  BootCheck · Android device inspection
</p>
