
var exec = require('cordova/exec');


var screenSize = function(window) {

	window.screenSize = function() {
		var size =  exec(function(result) {
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
		
		return size;
	}  

}
screenSize(window);

//module.exports = screenSize;
