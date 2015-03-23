package com.osanwen.fragtabhost.activity.fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragment;
import com.osanwen.fragtabhost.activity.base.BaseActivity;

public class AppSupport extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		addContent(new AppFragment());
	}
	
	public static class AppFragment extends SherlockFragment {
		
		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);
			
			Toast.makeText(getSherlockActivity(), "AppListFragment:onActivityCreated", Toast.LENGTH_SHORT).show();
		}
	}
}
