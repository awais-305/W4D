package com.example.w4d.Utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SharedPref {
    private static final String USER_INFO="user_info";
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Set<String> stringSet;
    private final HashSet<String> hashSetnew=new HashSet<>();
    private String value;
    private Boolean boolSwitchValue;


    public SharedPref(Context context) {
        try {
            sharedPreferences=context.getSharedPreferences(USER_INFO,Context.MODE_PRIVATE);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    private SharedPreferences getSharedPref() {
        return sharedPreferences;
    }


    public void clearAllPreferances()
    {
        editor=getSharedPref().edit().clear();
        editor.apply();
    }
    public void removeKey(String key)
    {
        editor.remove(key);
        editor.commit();
    }

    //for boolean values
    public void storeBoolean(String key,Boolean boolValue)
    {
        editor=getSharedPref().edit();
        editor.putBoolean(key,boolValue);
        editor.apply();
    }
    public boolean getBoolean(String key)
    {
        return getSharedPref().getBoolean(key,false);
    }

    //for boolean values
    public void storeSettingsSwitchBoolean(String key,boolean boolValue)
    {
        editor=getSharedPref().edit();
        editor.putBoolean(key,boolValue);
        editor.apply();
    }
    public boolean getSettingsSwitchBoolean(String key,boolean boolSwitchValue)
    {
        return getSharedPref().getBoolean(key,boolSwitchValue);
    }

    //for boolean values
    public void storeSwitchBoolean(String key,Boolean boolValue)
    {try {
        editor=getSharedPref().edit();
        editor.putBoolean(key,boolValue);
        editor.apply();
    }catch (Exception e)
    {
        e.printStackTrace();
    }

    }
    public boolean getSwitchBoolean(String key)
    {
        try {
            boolSwitchValue=   getSharedPref().getBoolean(key,false);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return boolSwitchValue;
    }

    //for int values
    public int storeInt(String key, int value)
    {
        editor=getSharedPref().edit();
        editor.putInt(key,value);
        editor.apply();
        return value;
    }
    public int getInt(String key,int val)
    {
        return getSharedPref().getInt(key,val);
    }

    //userprofileImg
    public void storeString(String key,String value) {
        try {
            editor = getSharedPref().edit();
            editor.putString(key,value);
            editor.apply();
        }catch (Exception e)
        {e.printStackTrace();}
    }
    public String getString(String key,String val) {
        try {
            value= getSharedPref().getString(key,val);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return value;
    }


    //userprofileImg
    public void storeString1(String key,String value) {
        try {
            editor = getSharedPref().edit();
            editor.putString(key,value);
            editor.apply();
        }catch (Exception e)
        {e.printStackTrace();}
    }
    public String getString1(String key,String val) {
        try {
            value= getSharedPref().getString(key,val);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return value;
    }



    public void storeLong(long lat)
    {
        editor=getSharedPref().edit();
        editor.putLong("lati",  lat);
        editor.apply();
    }
    public long getLong()
    {
        return getSharedPref().getLong("lati",-1);
    }


    public ArrayList<String> getValue_list(String str) {

        ArrayList<String> arrayList;
        try {
            stringSet = sharedPreferences.getStringSet(str, hashSetnew);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        if (stringSet == null) {
            return new ArrayList<>();
        }
        arrayList= new ArrayList<>();
        arrayList.addAll(stringSet);
        return arrayList;
    }

    public void setValue_list(String str, ArrayList<String> arrayList) {
        HashSet<String> hashSet = new HashSet<>(arrayList);
        editor=sharedPreferences.edit();
        editor.putStringSet(str, hashSet);
        editor.apply();
    }
}

