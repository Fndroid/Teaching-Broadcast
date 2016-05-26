package com.fndroid.boradcastdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
	private static final String TAG = "MainActivity";
	public static final String ACTION = "com.fndroid.intent.action.BROADCAST";
	private Button order, disorder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		order = (Button) findViewById(R.id.btn_order);
		disorder = (Button) findViewById(R.id.btn_disorder);
		order.setOnClickListener(this);
		disorder.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
			case R.id.btn_disorder:
				Log.d(TAG, "onClick: 发送标准广播");
				sendBroadcast(new Intent(ACTION));
				break;
			case R.id.btn_order:
				Log.d(TAG, "onClick: 发送有序广播");
				sendOrderedBroadcast(new Intent(ACTION), null);
				break;
		}
	}
}
