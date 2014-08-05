(function(window){
    
    window.screenSize = function(str, callback) {
        cordova.exec(callback, function(err) {
            callback('Something went wrong.');
        }, "ScreenSize", "getSize", [str]);
    };    
    
})(window);