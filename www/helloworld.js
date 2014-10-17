module.exports = {
   sayHello: function(name, age, successCallback, errorCallback) {
       if (typeof successCallback == 'undefined') {
           successCallback = function() {
               console.log("success!");
           }
       }
       if (typeof errorCallback == 'undefined') {
           errorCallback = function(error) {
               console.log(error);
           }
       }
       cordova.exec(successCallback, errorCallback, "HelloWorld", "sayHello", [name, age]);
   },
   sayGoodbye: function(name, successCallback, errorCallback) {
       if (typeof successCallback == 'undefined') {
           successCallback = function() {
               console.log("success!");
           }
       }
       if (typeof errorCallback == 'undefined') {
           errorCallback = function(error) {
               console.log(error);
           }
       }
       cordova.exec(successCallback, errorCallback, "HelloWorld", "sayGoodbye", [name]);
   }
}

