package com.abcd.speechifyapptask.json;

import org.json.JSONObject;

public class Utils {
    public static boolean contains(JSONObject jsonObject, String key) {
        return ( jsonObject != null && jsonObject.has(key) && !jsonObject.isNull(key) ) ? true : false;
    }
}
