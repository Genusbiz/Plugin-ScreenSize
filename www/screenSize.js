
var exec = require('cordova/exec');


var screenSize = function(window) {

	window.screenSize = function() {
		exec(function(result) {
				callback(result);
			}, 
			function(err) {
		    	console.log("SOMETHING WENT WRONG: " + err);
		    }, 
		    "ScreenSize", 
		    "getSize"
		);
	}  
}
screenSize(window);

//module.exports = screenSize;
