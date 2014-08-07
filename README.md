#Cordova screen size plugin for Android

Plugin to get the physical screen size (diagonal) of the Android device.
 
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

This plugin use DisplayMetrics withPixels, heightPixels and densityDpi to calculate the size. It is not 100% correct, but will give an approximation.

##License

MIT