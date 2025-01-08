package com.app.blingy.reauty.core.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {

    private static SessionManager INSTANCE = null;
    private final SharedPreferences sharedApp;

    private SessionManager(Context context) {
        sharedApp = context.getSharedPreferences("com.reauty.main", Context.MODE_PRIVATE);
    }

    public static SessionManager getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new SessionManager(context);
        }
        return INSTANCE;
    }

    public void setIsFirsRun(boolean val) {
        sharedApp.edit().putBoolean("com.reauty.first.run", val).apply();
    }

    public boolean getIsFirstRun() {
        return sharedApp.getBoolean("com.reauty.first.run", true);
    }

}
