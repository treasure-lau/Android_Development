package com.osanwen.fragtabhost.activity;

import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;

import com.osanwen.fragtabhost.R;
import com.osanwen.fragtabhost.activity.base.BaseActivity;
import com.osanwen.fragtabhost.model.MainModel;
import com.osanwen.fragtabhost.widget.FragmentTabHost;

/**
 * HomeActivity类，主界面
 * 
 * @author	lyb25_000 liusaibao@wiseuc.com
 * @since	2015年1月5日
 */
public class MainActivity extends BaseActivity{

	private FragmentTabHost mTabHost;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setBackButton(false);
		
		setContentView(R.layout.activity_main);
		initView();
		
		if (savedInstanceState != null) {
            mTabHost.setCurrentTabByTag(savedInstanceState.getString("tab"));
        }
	}
	
	
	private void initView() {
		mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        TabWidget tabWidget = (TabWidget)findViewById(android.R.id.tabs);
        
        List<MainModel> mainList = MainModel.getMainData();
        for (MainModel main : mainList) {
        	View view = getLayoutInflater().inflate(R.layout.view_tab, tabWidget, false);
        	TextView tabText = (TextView) view.findViewById(R.id.tab_text);
        	tabText.setText(main.getStringRes());
        	tabText.setCompoundDrawablesWithIntrinsicBounds(0, main.getDrawableRes(), 0, 0);
        	
        	TabSpec tabSpec = mTabHost.newTabSpec(main.getTag()).setIndicator(view);
        	mTabHost.addTab(tabSpec, main.getClss(), null);
        }
	}
	
	@Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("tab", mTabHost.getCurrentTabTag());
    }
}
