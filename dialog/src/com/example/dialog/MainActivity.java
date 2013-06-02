package com.example.dialog;

 
import com.example.dialog.MyDialog.Dialogcallback;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView textView;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		textView = (TextView) findViewById(R.id.textView11);
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				MyDialog myDialog = new MyDialog(MainActivity.this);
				myDialog.setContent("哥来自Activity");
				myDialog.setDialogCallback(dialogcallback);
				myDialog.show();

			}
		});
	}
/**
 * 设置mydialog需要处理的事情
 */
	Dialogcallback dialogcallback = new Dialogcallback() {

		@Override
		public void dialogdo(String string) {
			textView.setText("哥來自Dialog: " + string);

		}
	};

}