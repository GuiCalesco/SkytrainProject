package com.projectskytrain;

import com.example.projectskytrain.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class SkytrainLine extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.skytrain_map);
		
		final WebView line = (WebView)findViewById(R.id.webView1);
		line.setInitialScale(75);
		line.getSettings().setBuiltInZoomControls(true);
		

		String data = "<body>" + "<img src=\"skytrain_line.png\"/></body>";

		line.loadDataWithBaseURL("file:///android_res/drawable/",data , "text/html", "utf-8",null);
		
	}

}
