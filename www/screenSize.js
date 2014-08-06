
var exec = require('cordova/exec');


var screenSize = function(window) {

	window.screenSize = function() {
		exec(function(result) {
				callback(result);
				return result;
			}, 
			function(err) {
		    	console.log("SOMETHING WENT WRONG");
		        callback('Something went wrong.');
		    }, 
		    "ScreenSize", 
		    "getSize"
		);
	}  
}
screenSize(window);

//module.exports = screenSize;
