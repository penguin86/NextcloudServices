package com.polar.nextcloudservices.intentproviders;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

public class TalkNotificationIntentProvider extends DefaultNotificationIntentProvider {
    private static final String KEY_FROM_NOTIFICATION_START_CALL = "KEY_FROM_NOTIFICATION_START_CALL";
    private static final String KEY_INTERNAL_USER_ID = "KEY_INTERNAL_USER_ID";
    private static final String KEY_ROOM_TOKEN = "KEY_ROOM_TOKEN";


    @Override
    public Intent getIntent(Context context, JSONObject notification) throws JSONException {
        JSONObject srParams = notification.getJSONObject("subjectRichParameters");
        Intent i = super.getIntent(context, notification);
        if (i.getPackage() != null) {
            // Talk app present, add data to open the right activity
            i.putExtra(KEY_FROM_NOTIFICATION_START_CALL, srParams.getJSONObject("call").getInt("id"));
            i.putExtra(KEY_INTERNAL_USER_ID, srParams.getJSONObject("call").getInt("id"));
            //i.putExtra(KEY_ROOM_TOKEN, ); //TODO: Where to find this?
        }
        return i;
    }

}
