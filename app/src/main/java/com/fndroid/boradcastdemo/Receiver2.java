package com.fndroid.boradcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2016/5/22.
 */
public class Receiver2 extends BroadcastReceiver {
	private static final String TAG = "Receiver2";
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d(TAG, "onReceive: 接收到广播");
	}
}
