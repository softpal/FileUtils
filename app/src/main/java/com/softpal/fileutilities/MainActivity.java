package com.softpal.fileutilities;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.softpal.fileutils.FileUtils;

public class MainActivity extends AppCompatActivity
{
	private static String TAG = MainActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Uri uri = Uri.parse("file:///storage/emulated/0/com.himangi.imagepreview/ImagesPreview/2545.jpg");
		String path = FileUtils.getPath(MainActivity.this.getBaseContext(),uri);
	}
}
