package it.eonardol.cordova.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

public class HelloWorld extends CordovaPlugin {
   private static final String ACTION_SAY_HELLO = "sayHello";
   private static final String ACTION_SAY_GOODBYE = "sayGoodbye";

   private static final String LOG_TAG = HelloWorld.class.getSimpleName();

   @Override
   public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
       if (ACTION_SAY_HELLO.equals(action)) {
           final String name = args.getString(0);
           final int age = args.getInt(1);
           if (name.length()>2 && age>0){
               Log.i(LOG_TAG, "name and age are valid");
               callbackContext.success("Hello my name is " + name + " and I'm " + age);
               return true;
           }
           else {
               Log.i(LOG_TAG, "name and age not valid");
               callbackContext.error("name and/or age not valid");
               return false;
           }
       } else if (ACTION_SAY_GOODBYE.equals(action)) {
           final String name = args.getString(0);
           if (name.length()>2){
               Log.i(LOG_TAG, "name are valid");
               callbackContext.success("Goodbye. " + name);
               return true;
           }
           else {
               Log.i(LOG_TAG, "name not valid");
               callbackContext.error("name not valid");
               return false;
           }

       } else {
           callbackContext.error("helloworld." + action + " is not valid");
           return false;
       }
   }
}
