package com.itxy.android_process;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button=(Button)findViewById(R.id.button1);
		
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				new ChangButtonTask().execute("");
				
			}
		});
				
		
		
	}
	//声明一个继承了 AsyncTask 异步任务的ChangeButtonTask子类
	private class ChangButtonTask extends AsyncTask<String, Void, String>{
		

		@Override
		protected String doInBackground(String... params) {
			// TODO Auto-generated method stub
			return "活干完了";
		}
		@Override
		protected void onPostExecute(String result) {
		
			button.setText(result);
		
		}
		
	}
}
