package com.reja.firebirdmsg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by reja on 9/26/16.
 */
public class notifactivity extends AppCompatActivity {
    private String TAG = "NOTIFY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notif);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.d(TAG, "BODY : " + null);
        } else {
            Log.d(TAG, "BODY : " + extras.getString("PESAN"));
        }
    }
}