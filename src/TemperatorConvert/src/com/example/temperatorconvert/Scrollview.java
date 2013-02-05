package com.example.temperatorconvert;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Scrollview extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scrollview);
		TextView view =  (TextView) findViewById(R.id.TextView02);
        String s="";
        for (int i=0; i < 100; i++) {
          s += "vogella.com ";
        }
        view.setText(s);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_scrollview, menu);
		return true;
	}

}
