package com.example.appghichu.broadCastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.appghichu.activity.AlarmActivity;

public class AlarmBroadcastReceiver extends BroadcastReceiver {

    String title, desc, date, time;
    @Override
    public void onReceive(Context context, Intent intent) {

        title = intent.getStringExtra("TITLE");
        desc = intent.getStringExtra("DESC");
        date = intent.getStringExtra("DATE");
        time = intent.getStringExtra("TIME");

        Intent i = new Intent(context, AlarmActivity.class);
        i.putExtra("TITLE", title);
        i.putExtra("DESC", desc);
        i.putExtra("DATE", date);
        i.putExtra("TIME", time);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
