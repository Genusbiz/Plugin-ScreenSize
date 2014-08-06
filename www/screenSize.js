
var exec = require('cordova/exec');


var screenSize = function(window) {

	window.screenSize = function() {
		exec(function(result) {
				console.log("Got result from native: " + result);
				return result;
			}, 
			function(err) {
		    	console.log("SOMETHING WENT WRONG: " + err);
		    }, 
		    "ScreenSize", 
		    "getSize",
		    []
		);
	}  
}
screenSize(window);

//module.exports = screenSize;
