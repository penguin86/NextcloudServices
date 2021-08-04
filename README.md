# Nextcloud services
[![Java CI with Gradle](https://github.com/Andrewerr/NextcloudServices/actions/workflows/gradle.yml/badge.svg)](https://github.com/Andrewerr/NextcloudServices/actions/workflows/gradle.yml)
[![F-Droid build](https://img.shields.io/f-droid/v/com.polar.nextcloudservices.svg?logo=f-droid)](https://f-droid.org/wiki/page/com.polar.nextcloudservices/lastbuild)
![Github tag](https://img.shields.io/github/v/tag/Andrewerr/NextcloudServices?logo=github)
<br>
[<img src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png" height="75">](https://f-droid.org/en/packages/com.polar.nextcloudservices/)
<br>
Nextcloud services is a simple app to poll notifications from your Nextcloud server without using proprietary Google Play services. 
## Screenshots
![Screenshot 1](https://github.com/Andrewerr/NextcloudServices/raw/main/img/Screenshot_scaled.png)
## Instructions
Currently login available only by putting credentials into app. So to login into your Nextcloud via this app follow steps below:
* At your Nextcloud  open settings and navigate to "Security" 
* Generate per-app password
* Enter you login and server address into the app(Enter server address without `https://` prefix)
* Enter generated per-app password
* On Nextcloud server click "Add" button to add generated password to list of authenticated devices(Additionally it is recommended to disable file access to this key)

**IMPORTANT:** Do **NOT** ommit first two steps - this may be risky for your security

## Building 
You can build this app using android studio

## Credits
* [Deck Android app](https://github.com/stefan-niedermann/nextcloud-deck) for deck logo
* [Nextcloud app](https://github.com/nextcloud/android/) for Nextcloud logo and spreed(talk) logo
* [@invissvenska](https://github.com/invissvenska) for [NumberPickerPreference](https://github.com/invissvenska/NumberPickerPreference/) (licensed under LGPL-3.0)
