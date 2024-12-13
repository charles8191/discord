# Discord

An Android WebView wrapper for the hidden Discord mobile PWA.

<a href="https://github.com/charles8191/discord/releases/latest"><img src="https://github.com/user-attachments/assets/57e315cc-e729-4a63-adf0-42f17508bb68" alt="Get it on GitHub" width="25%" height="25%"></img></a>


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
