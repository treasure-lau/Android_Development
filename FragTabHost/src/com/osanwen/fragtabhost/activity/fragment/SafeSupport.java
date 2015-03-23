package com.osanwen.fragtabhost.activity.fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragment;
import com.osanwen.fragtabhost.activity.base.BaseActivity;

public class SafeSupport extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		addContent(new SafeFragment());
	}
	
	public static class SafeFragment extends SherlockFragment {
		
		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);
			
			Toast.makeText(getSherlockActivity(), "SafeListFragment:onActivityCreated", Toast.LENGTH_SHORT).show();
		}
	}
}
