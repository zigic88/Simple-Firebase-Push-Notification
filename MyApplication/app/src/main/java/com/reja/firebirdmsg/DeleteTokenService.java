package com.reja.firebirdmsg;

import android.app.IntentService;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;

/**
 * Created by reja on 10/2/16.
 */
public class DeleteTokenService extends IntentService {
    public static final String TAG = DeleteTokenService.class.getSimpleName();

    public DeleteTokenService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            // Resets Instance ID and revokes all tokens.
            FirebaseInstanceId.getInstance().deleteInstanceId();
            FirebaseInstanceId.getInstance().getToken();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}