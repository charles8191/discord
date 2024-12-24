# Discord

An Android WebView wrapper for the hidden Discord mobile PWA.

## Download

- [Download stable APK](https://github.com/charles8191/discord/releases/latest)
- [Download unstable APK](https://nightly.link/charles8191/discord/workflows/android/master/apk.zip)

## Functionality

### Tested Working

- Core functions (sending, receiving, etc)
- Uploading files
- Screen rotation
  - Refreshes the page [built in to WebView]

### Mostly Working

- Certain views are built for larger screens and go off the screen. Shouldn't happen on tablets [website]
- Hard to exit certain views [website]
- Typing can be flaky, especially with autocorrect [keyboard? website?]

### Broken

- Voice & video calls [no permission, no code, website?, Chromium?]
- Notifications [no code]
  - You may get a ping sound if the app is open in the background [untested]
