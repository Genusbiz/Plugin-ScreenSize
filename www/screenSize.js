
var exec = require('cordova/exec');


var screenSize = function(window) {

	(function(str, callback) {
  		exec(function(result) {
  				window.screenSize = result;
  				callback(result);
  			}, 
  			function(err) {
  		    	console.log("SOMETHING WENT WRONG");
  		        callback('Something went wrong.');
  		    }, 
  		    "ScreenSize", 
  		    "getSize", 
  		    [str]
  		);
  	})(window)  
}
screenSize(window);

//module.exports = screenSize;
