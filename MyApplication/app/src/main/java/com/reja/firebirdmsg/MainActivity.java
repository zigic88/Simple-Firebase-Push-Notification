package com.reja.firebirdmsg;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        if (getIntent().getExtras() != null) {
//            for (String key : getIntent().getExtras().keySet()) {
//                String value = getIntent().getExtras().getString(key);
//                Log.d(TAG, "Key: " + key + " Value: " + value);
//            }
//
//            if (getIntent().getExtras().keySet().size() > 1) {
//                Intent newIntent = new Intent(this, notifactivity.class);
//                startActivity(newIntent);
//                finish();
//            }
//        }

//        // Get token
//        String token = FirebaseInstanceId.getInstance().getToken();
//        // Log and toast
//        Log.d(TAG, "GG : " + token);


        Button logTokenButton = (Button) findViewById(R.id.btnrefresh);
        logTokenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DeleteTokenService.class);
                startService(intent);

                Toast.makeText(getApplicationContext(), "TOKEN BERHASIL",
                        Toast.LENGTH_LONG).show();

//                SharedPreferences prefs = getSharedPreferences("MYTOKEN", MODE_PRIVATE);
//                String restoredText = prefs.getString("tokenid", null);
//                if (restoredText != null) {
//                    String tokenid = prefs.getString("tokenid", "No token defined");//"No name defined" is the default value.
//                    Log.d(TAG,"tokenid : >> " + tokenid);
//                }
            }
        });

        Button logTokenButton2 = (Button) findViewById(R.id.btngettoken);
        logTokenButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences prefs = getSharedPreferences("MYTOKEN", MODE_PRIVATE);
                String restoredText = prefs.getString("tokenid", null);
                if (restoredText != null) {
                    String tokenid = prefs.getString("tokenid", "No token defined");//"No name defined" is the default value.
                    Log.d(TAG,"tokenid : >> " + tokenid);

                    Toast.makeText(getApplicationContext(), "tokenid : >> " + tokenid,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}



