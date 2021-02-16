package com.example.w4d.Utils;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Utils {


    public static void animate(LinearLayout linearLayout)
    {
        LayoutTransition layoutTransition2 = linearLayout.getLayoutTransition();
        layoutTransition2.setDuration(200);
        layoutTransition2.enableTransitionType(LayoutTransition.CHANGING);
    }


    public static float dp2px(Context context, float dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return dp * scale + 0.5f;
    }

    public static float sp2px(Context context, float sp) {
        final float scale = context.getResources().getDisplayMetrics().scaledDensity;
        return sp * scale;
    }

    @SuppressLint("DefaultLocale")
    public static String convertSecondsToHMmSs(long seconds) {
        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        return String.format("%d:%02d:%02d", h,m,s);
    }


    public static int getScreanWidth(Activity context)
    {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        context.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        return displayMetrics.widthPixels;
    }

    public static int dpToPx(Activity context,int dp) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }

    public static void setProgressAnimate(ProgressBar pb, int progress)
    {
        ObjectAnimator animation = ObjectAnimator.ofInt(pb, "progress", progress);
//      animation.setDuration(500);
        animation.setInterpolator(new DecelerateInterpolator());
        animation.start();
    }

}
