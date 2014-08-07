#Cordova screen size plugin for Android

Android ScreenSize
 
##Install

cordova plugin add net.genus.plugins.screensize

###Source

https://github.com/Jonasei/Plugin-ScreenSize


## Usage

	// Returns the diagonal length of the device.
	window.screenSize

## Example

	// Check if the device is a tablet
	var screenSize = window.screenSize
	var isTablet;

	if (screenSize >= 7)
		isTablet = true;

## Notes

This plugin use DisplayMetrics widthPixels, heightPixels and densityDpi to calculate the size. This means it does not include the button row or status bar as screen space.

##License

MIT