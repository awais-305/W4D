package com.example.w4d.Utils;

import android.text.TextUtils;
import android.util.Patterns;

public class StringUtils {
    //user job

    //user info
    public static final String LOGGED_IN="logged_in";
    public static final String USER_ID="user_id";
    public static final String USER_NAME="user_name";
    public static final String USER_EMAIL="user_email";
    public static final String TOKEN="token";
    public static final String USER_PROFILE="profile";
    public static final String BEARER="Bearer";
    public static final String TYPE="type";

    public static final String EMPTY_FIELDS="One or more fields are empty.";

    public static final String INVALID_EMAIL="invalid_email";
    public static final String INVALID_PASSWORD="incorrect_password";


    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

}
