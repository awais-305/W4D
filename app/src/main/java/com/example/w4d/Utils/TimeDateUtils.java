package com.example.w4d.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeDateUtils {

    public static String getTime(String time) {
        try
        {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            //Date past = format.parse("2016.02.05 AD at 23:59:30");
            Date past = format.parse(time);
            Date now = new Date();
            long seconds=TimeUnit.MILLISECONDS.toSeconds(now.getTime() - past.getTime());
            long minutes=TimeUnit.MILLISECONDS.toMinutes(now.getTime() - past.getTime());
            long hours= TimeUnit.MILLISECONDS.toHours(now.getTime() - past.getTime());
            long days=TimeUnit.MILLISECONDS.toDays(now.getTime() - past.getTime());
//
//          System.out.println(TimeUnit.MILLISECONDS.toSeconds(now.getTime() - past.getTime()) + " milliseconds ago");
//          System.out.println(TimeUnit.MILLISECONDS.toMinutes(now.getTime() - past.getTime()) + " minutes ago");
//          System.out.println(TimeUnit.MILLISECONDS.toHours(now.getTime() - past.getTime()) + " hours ago");
//          System.out.println(TimeUnit.MILLISECONDS.toDays(now.getTime() - past.getTime()) + " days ago");

            if(seconds<60)
            {
                return (seconds+" seconds ago");
            }
            else if(minutes<60)
            {
                return(minutes+" minutes ago");
            }
            else if(hours<24)
            {
                return(hours+" hours ago");
            }
            else
            {
                return(days+" days ago");
            }
        }
        catch (Exception j){
            j.printStackTrace();
        }

        return null;
    }
}
