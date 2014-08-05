/*
The MIT License (MIT)

Copyright (c) 2014

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package net.genus.plugins.screensize;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.content.Context;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class returns the screen size in inches.
 */
public class ScreenSize extends CordovaPlugin  {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getSize")) {
            Log.d("ScreenSizeDebug", "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-FINDING SCREEN SIZE _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            DisplayMetrics metrics = new DisplayMetrics();
            Context context = this.cordova.getActivity().getApplicationContext();;
            WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
            windowManager.getDefaultDisplay().getMetrics(metrics);
           

            int width=metrics.widthPixels;
            int height=metrics.heightPixels;
            int dens=metrics.densityDpi;
            

            double wi=(double)width/(double)dens;
            double hi=(double)height/(double)dens;
            double x = Math.pow(wi,2);
            double y = Math.pow(hi,2);
            double screenInches = Math.sqrt(x+y);

            Log.d("ScreenSizeDebug", ""+screenInches);
            int result = (int) screenInches;

            Log.d("ScreenSizeDebug", ""+result);
            callbackContext.success(result);

            
            return true;
        }
        return false;
    }
}