(function(window){
    
    window.screenSize = function(str, callback) {
        cordova.exec(function(winParam) {
        	console.log("SOMETHING WENT RIGHT");
        	console.log(winParam);
        	alert(winParam);
        }, function(err) {
        	console.log("SOMETHING WENT WRONG");
            callback('Something went wrong.');
        }, "ScreenSize", "getSize", [str]);
    };    
    
})(window);