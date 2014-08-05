(function(window){
    
    window.screenSize = function(str, callback) {
        cordova.exec(function(winParam) {
        	alert(winParam);
        }, function(err) {
            callback('Something went wrong.');
        }, "ScreenSize", "getSize", [str]);
    };    
    
})(window);