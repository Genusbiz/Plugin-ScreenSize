 package org.apache.cordova.plugin;

    import org.apache.cordova.CordovaPlugin;
    import org.apache.cordova.CallbackContext;

    import org.json.JSONArray;
    import org.json.JSONException;
    import org.json.JSONObject;

    /**
     * This class returns the screen size in inches.
     */
    public class ScreenSize extends CordovaPlugin {

        @Override
        public double execute(String action, JSONArray args, CallbackContext callbackContext) {
            if (action.equals("getSize")) {

                DisplayMetrics dm = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(dm);
                int width=dm.widthPixels;
                int height=dm.heightPixels;
                int dens=dm.densityDpi;
                double wi=(double)width/(double)dens;
                double hi=(double)height/(double)dens;
                double x = Math.pow(wi,2);
                double y = Math.pow(hi,2);
                double screenInches = Math.sqrt(x+y);

                return screenInches;
            }
            return -1;
        }
    }