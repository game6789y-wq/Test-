# BootCheck for Android

<p align="center">
  <strong>Automated Android APK builds with GitHub Actions</strong><br>
  Build, verify, and download BootCheck test APKs directly from GitHub.
</p>

<p align="center">
  <a href="https://github.com/game6789y-wq/Test-/actions/workflows/build-apk.yml">
    <img alt="Build APK" src="https://github.com/game6789y-wq/Test-/actions/workflows/build-apk.yml/badge.svg">
  </a>
  <a href="https://github.com/game6789y-wq/Test-/releases">
    <img alt="GitHub Releases" src="https://img.shields.io/badge/Downloads-GitHub%20Releases-blue?logo=github">
  </a>
</p>

---

## ✨ Overview

This repository packages the BootCheck Android project and uses a GitHub Actions workflow to build an APK automatically. The workflow also calculates a SHA-256 checksum so you can verify the downloaded file.

## 📥 Download

- **[Browse releases and download the APK](https://github.com/game6789y-wq/Test-/releases)**
- **[View build history and logs](https://github.com/game6789y-wq/Test-/actions)**

Choose `app-debug.apk` from a successful release. The `apk-sha256.txt` file contains its SHA-256 checksum.

## 🚀 Automated build

A push to `main` that changes the project ZIP, workflow, or README starts a build. You can also start one manually:

1. Open **[Actions](https://github.com/game6789y-wq/Test-/actions/workflows/build-apk.yml)**.
2. Select **Build APK and publish release**.
3. Choose **Run workflow**.

On success, the workflow:

1. Sets up Java and the Android SDK.
2. Extracts the Android project from the source ZIP.
3. Generates a temporary standard debug keystore.
4. Builds `app-debug.apk` with Gradle.
5. Checks that the APK exists and calculates its SHA-256 checksum.
6. Uploads the APK and checksum as a workflow artifact.
7. Publishes a GitHub Release containing both files.

## 🧾 Verify the download

If you have `sha256sum` available, run this command in the folder containing the APK and checksum file:

```bash
sha256sum -c apk-sha256.txt
```

The checksum file currently records the APK filename and its SHA-256 digest. Keep the APK and checksum together when verifying.

## ⚠️ Signing and installation

This workflow produces a **debug-signed test APK**, not a production-signed Android release.

- A debug APK is intended for testing.
- Because the workflow creates a new debug keystore during each run, APKs from different runs may have different signing certificates.
- Android may refuse to install an APK over an existing app if its signing certificate differs. You may need to uninstall the previous installation first; uninstalling can delete that app's local data.
- For production distribution and reliable in-place updates, configure a protected, persistent release-signing key and use a dedicated release build.

**Do not use this debug build as a production release.**

## 🗂️ Repository contents

| Path | Purpose |
| --- | --- |
| `bootcheck-oct-27-2026-12-24-44-am.zip` | Android project source archive |
| `.github/workflows/build-apk.yml` | Automated build and release workflow |
| `README.md` | Project and build instructions |

## 📊 Build status

The workflow status badge above reflects the latest workflow state. Check the **[Actions page](https://github.com/game6789y-wq/Test-/actions)** for logs and the **[Releases page](https://github.com/game6789y-wq/Test-/releases)** for published APKs. A commit alone does not guarantee a successful build; look for a completed run with a successful conclusion.

---

<p align="center">
  Made with GitHub Actions · BootCheck Android
</p>
