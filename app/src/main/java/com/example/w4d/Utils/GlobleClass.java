package com.example.w4d.Utils;

import android.app.Application;
import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.google.android.material.snackbar.Snackbar;

public class GlobleClass extends Application {
    public static final String TAG = "response";

    //base urls
//    public static final String BASE_URL = "https://reportes.intradel.es/api/v1/";
//    public static final String DELEGATIONS_URL = "https://reportes.intradel.es/api/v1/delegation/";
    public static GlobleClass singleton;
//    public static SharedPref sharedPref;
    public static boolean isInApp=false;


    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("response", "onCreate: url sent");
        singleton=this;
    //    sharedPref=new SharedPref(this);
//        FirebaseApp.initializeApp(this);
    }

    public static GlobleClass getInstance(){
        return singleton;
    }


    public static boolean isGPSEnabled(Context mContext) {
        LocationManager locationManager = (LocationManager)
                mContext.getSystemService(Context.LOCATION_SERVICE);
        assert locationManager != null;
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
    }


    public static boolean isOnline(Context context) {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        assert cm != null;
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }

    /*public static boolean failedAuthentication(User user, View rootLayout){
        if (user.getStatusCode() == Constants.RESPONSE_EMPTY_STATUS_CODE){
            snackBar(rootLayout, user.);
        }
    }*/

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public static void hideKeyboard(View view)
    {
        InputMethodManager imm = (InputMethodManager) getInstance().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void snackBar(View rootLayout, String text) {
        Snackbar snackbar;
        snackbar = Snackbar.make(rootLayout, text, Snackbar.LENGTH_SHORT);
        snackbar.show();
    }

//    public static File getOutputDirectory() {
//        File mediaStorageDir = new File(Environment.getExternalStorageDirectory() + "/" + getInstance()
//                .getResources().getString(R.string.app_name) + "/Images");
//        if (!mediaStorageDir.exists()) {
//            mediaStorageDir.mkdirs();
//        }
//        return mediaStorageDir;
//    }
//
//
//    public static File getAudioOutputDirectory() {
//        File mediaStorageDir = new File(Environment.getExternalStorageDirectory() + "/" + getInstance()
//                .getResources().getString(R.string.app_name) + "/Audios");
//        if (!mediaStorageDir.exists()) {
//            mediaStorageDir.mkdirs();
//        }
//        return mediaStorageDir;
//    }


//    public static void changeAppLanguage(Activity activity) {
//        Locale locale = new Locale(getInstance().getResources().getString(R.string.spanish));
//        Locale.setDefault(locale);
//        Resources resources = activity.getResources();
//        Configuration config = resources.getConfiguration();
//        config.setLocale(locale);
//        resources.updateConfiguration(config, resources.getDisplayMetrics());
//    }

}


