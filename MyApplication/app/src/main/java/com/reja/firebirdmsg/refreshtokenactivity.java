package com.reja.firebirdmsg;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by reja on 10/2/16.
 */
public class refreshtokenactivity  extends AppCompatActivity {
    private String TAG = "REFRESH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.refreshtokenactivity);

//        Intent serviceIntent = new Intent(this, MyFirebaseInstanceIDService.class);
//        serviceIntent.setAction("com.google.firebase.INSTANCE_ID_EVENT");
//        startService(serviceIntent);
//        Log.d(TAG, "After start service");
    }
}
