package com.polar.nextcloudservices.intentproviders;

import android.content.Context;
import android.content.Intent;

import org.json.JSONException;
import org.json.JSONObject;

public interface NotificationIntentProvider {

    /**
     * Builds an intent to start the relevant activity or, if not present, the browser
     * @param notification the notification received from Nextcloud
     * @return Intent
     */
    public Intent getIntent(Context context, JSONObject notification) throws JSONException;

}
