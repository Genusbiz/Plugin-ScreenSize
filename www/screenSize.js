
var exec = require('cordova/exec');

var screenSize = function(window) {
	console.log("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");

	window.screenSize = function(str, callback) {
	    exec(function(winParam) {
	    	console.log("SOMETHING WENT RIGHT");
	    	console.log(winParam);
	    	alert(winParam);
	    }, function(err) {
	    	console.log("SOMETHING WENT WRONG");
	        callback('Something went wrong.');
	    }, "ScreenSize", "getSize", [str]);
	}  
}

module.exports = screenSize;
