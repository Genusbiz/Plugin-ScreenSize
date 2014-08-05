 package org.apache.cordova.plugin;

    import org.apache.cordova.CordovaPlugin;
    import org.apache.cordova.CallbackContext;

    import android.util.DisplayMetrics;
    import android.view.WindowManager;
    import android.content.Context;


    import org.json.JSONArray;
    import org.json.JSONException;
    import org.json.JSONObject;

    /**
     * This class returns the screen size in inches.
     */
    public class ScreenSize extends CordovaPlugin {

        @Override
        public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
            if (action.equals("getSize")) {

                DisplayMetrics metrics = new DisplayMetrics();
                Context context;
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

                callbackContext.success((int) screenInches);
                
                return true;
            }
            return false;
        }
    }