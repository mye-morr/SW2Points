package com.example.sonymobile.smartextension.hellolayouts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    private static final String HOST_APP_PACKAGE_NAME = "com.sonymobile.smartconnect.smartwatch2";

    @Override
    public void onReceive(Context context, Intent intent) {
    /*
        if(intent.getAction().equals("com.example.SendBroadcast")) {

            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
            prefs.edit()
                    .putBoolean("notif", true)
                    .putString("string_notif", intent.getStringExtra("STRING_MSG"))
                    .commit();

        }
    */
    }
}

        /*
        String message = "Broadcast intent detected "
                + intent.getAction();

        Toast.makeText(context, message,
                Toast.LENGTH_LONG).show();
        */

        /*
        Intent i1 = new Intent(Control.Intents.CONTROL_START_REQUEST_INTENT);
        i1.putExtra(Widget.Intents.EXTRA_AEA_PACKAGE_NAME, context.getPackageName());
        i1.setPackage(intent.getStringExtra(Control.Intents.EXTRA_AHA_PACKAGE_NAME));
        context.sendBroadcast(i1, Registration.HOSTAPP_PERMISSION);
        */

        /*
        Intent i2 = new Intent(Control.Intents.CONTROL_SEND_TEXT_INTENT);
        i2.putExtra(Widget.Intents.EXTRA_AEA_PACKAGE_NAME, context.getPackageName());
        i2.setPackage(intent.getStringExtra(Control.Intents.EXTRA_AHA_PACKAGE_NAME));
        i2.putExtra(Control.Intents.EXTRA_LAYOUT_REFERENCE, R.id.btn_1_3);
        i2.putExtra(Control.Intents.EXTRA_TEXT, "\n\n" + intent.getStringExtra("STRING_MSG"));
        context.sendBroadcast(i2, Registration.HOSTAPP_PERMISSION);

        Intent i3 = new Intent(Control.Intents.CONTROL_SEND_TEXT_INTENT);
        i3.putExtra(Widget.Intents.EXTRA_AEA_PACKAGE_NAME, context.getPackageName());
        i3.setPackage(intent.getStringExtra(Control.Intents.EXTRA_AHA_PACKAGE_NAME));
        i3.putExtra(Control.Intents.EXTRA_LAYOUT_REFERENCE, R.id.txt_title);
        i3.putExtra(Control.Intents.EXTRA_TEXT, intent.getStringExtra("STRING_MSG"));
        context.sendBroadcast(i3, Registration.HOSTAPP_PERMISSION);
        */

