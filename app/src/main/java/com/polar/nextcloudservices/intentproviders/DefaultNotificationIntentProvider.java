package com.polar.nextcloudservices.intentproviders;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

import org.json.JSONException;
import org.json.JSONObject;

public class DefaultNotificationIntentProvider implements NotificationIntentProvider {

    @Override
    public Intent getIntent(Context context, JSONObject notification) throws JSONException {
        String link = notification.getString("link");
        String app = notification.getString("app");

        PackageManager pm = context.getPackageManager();
        String packageName = this.packageNameFromAppName(context, app);
        Intent i = pm.getLaunchIntentForPackage(packageName);
        if (i == null) {
            // Application not found
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(link));
        }
        return i;
    }

    /**
     * Returns the android app package name, given the Nextcloud app name
     * i.e.: called passing "spreed", returns "com.nextcloud.talk2"
     * The mapping is in res/nextcloud_package_names.xml
     * @param appName as provided by Nextcloud
     * @return packageName for the corresponding Android app
     */
    protected String packageNameFromAppName(Context context, String appName) {
        // Search in res/nextcloud_package_names.xml
        int id = context.getResources().getIdentifier("pn_" + appName, "string", context.getPackageName());
        if (id != 0)
            return context.getString(id);

        // Try to build the app name (for future official nextcloud apps)
        return "com.nextcloud." + appName.replace('_', '.');
    }

}
