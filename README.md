HelloWorld-PhoneGap-Plugin
==========================

A sample cordova / phonegap plugin for Android.

## Installation

    cordova plugin add https://github.com/eonardol/HelloWorld-PhoneGap-Plugin.git

## Usage

    var successCallback = function(result){console.log("success: " + result)}
    var errorCallback = function(message){console.log("error: " + message)}
    window.plugins.helloworld.sayHello("Jack", 18, successCallback, errorCallback);
    window.plugins.helloworld.sayGoodbye("Jack", successCallback, errorCallback);
