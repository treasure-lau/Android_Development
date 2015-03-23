package com.osanwen.fragtabhost.activity.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public abstract class BaseActivity extends SherlockFragmentActivity {

	protected ActionBar mActionBar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // 固定为竖屏

		super.onCreate(savedInstanceState);
        mActionBar = getSupportActionBar();
	}
	
	protected void addContent(Fragment fragment) {
		FragmentManager fm = getSupportFragmentManager();
		
		if (fm.findFragmentById(android.R.id.content) == null) {
			fm.beginTransaction().add(android.R.id.content, fragment).commit();
		}
	}
	
	protected void setBackButton(boolean flag)
	{
		if (mActionBar != null)
		{
//			mActionBar.setIcon(R.drawable.title_logo);
			mActionBar.setDisplayHomeAsUpEnabled(flag);	// 是否隐藏返回图标
	        mActionBar.setHomeButtonEnabled(flag);	// 是否禁用返回操作
		}
	}
}
