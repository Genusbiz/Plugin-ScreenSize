
var exec = require('cordova/exec');


var screenSize = function() {


	var calcScreenSize = function() {
		exec(function(result) {
				console.log("Got result from native: " + result);
				window.screenSize = result;
				return result;
			}, 
			function(err) {
		    	console.log("SOMETHING WENT WRONG: " + err);
		    	return -1
		    }, 
		    "ScreenSize", 
		    "getSize",
		    []
		);

	}  

	if(!window.screenSize)
		calcScreenSize();

}

screenSize();

