package com.osanwen.fragtabhost.activity.fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragment;
import com.osanwen.fragtabhost.activity.base.BaseActivity;

public class HomePageSupport extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		addContent(new HomePageFragment());
	}
	
	public static class HomePageFragment extends SherlockFragment {
		
		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);
			
			Toast.makeText(getSherlockActivity(), "HomePageFragment:onActivityCreated", Toast.LENGTH_SHORT).show();
		}
	}
}
