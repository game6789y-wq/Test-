# BootCheck Android — automated test build

This repository contains the source archive and GitHub Actions workflow for building a **debug-signed test APK**.

## Source
- Project archive: [bootcheck-oct-27-2026-12-24-44-am.zip](./bootcheck-oct-27-2026-12-24-44-am.zip)
- Workflow: [Build APK and publish test release](./.github/workflows/build-apk.yml)

## Build and release
A push to `main` that changes the source archive, workflow, or this README triggers GitHub Actions. You can also run it manually from **Actions → Build APK and publish test release → Run workflow**.

When the build succeeds, the workflow:
1. Extracts the Android project from the ZIP.
2. Builds `app-debug.apk` without a private release keystore.
3. Checks that the APK exists and writes its SHA-256 checksum.
4. Uploads the APK and checksum as a workflow artifact.
5. Publishes a GitHub **pre-release** with the APK and checksum.

## Important signing note
This workflow builds a **debug-signed test APK**, not a production-signed release APK. Android may not allow it to update an existing installation signed with a different key. A production release intended for seamless updates requires the original signing key or a planned signing-key reset/migration.

## Current status
Check the [Actions tab](../../actions) for the actual build result and the [Releases page](../../releases) for a pre-release. A workflow file being committed does not itself prove that the APK built successfully; only a completed successful run confirms that.
