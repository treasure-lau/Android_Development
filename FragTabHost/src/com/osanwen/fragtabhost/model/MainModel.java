package com.osanwen.fragtabhost.model;

import java.util.ArrayList;
import java.util.List;

import com.osanwen.fragtabhost.R;
import com.osanwen.fragtabhost.activity.fragment.AppSupport;
import com.osanwen.fragtabhost.activity.fragment.HomePageSupport;
import com.osanwen.fragtabhost.activity.fragment.SafeSupport;

public class MainModel {

	private String tag;
	private Class<?> clss;
	private int stringRes;
	private int drawableRes;
	
	public String getTag() {
		return tag;
	}

	public Class<?> getClss() {
		return clss;
	}

	public int getStringRes() {
		return stringRes;
	}

	public int getDrawableRes() {
		return drawableRes;
	}
	
	private MainModel(String tag, Class<?> clss, int stringRes, int drawableRes) {
		this(stringRes, drawableRes);
		this.tag = tag;
		this.clss = clss;
	}

	private MainModel(int stringRes, int drawableRes) {
		this.stringRes = stringRes;
		this.drawableRes = drawableRes;
	}
	
	public static List<MainModel> getMainData() {
		
		String[] tags = {"homepage", "safe", "app"};
		Class<?>[] clsses = {HomePageSupport.HomePageFragment.class, SafeSupport.SafeFragment.class, AppSupport.AppFragment.class};
		int[] stringReses = {R.string.homepage, R.string.safe, R.string.app};
		int[] drawableReses = {R.drawable.bottom_nav_homepage_selector, R.drawable.bottom_nav_safe_selector, R.drawable.bottom_nav_app_selector};
		
		List<MainModel> mainList = new ArrayList<MainModel>();
		for (int i = 0; i < stringReses.length; i++) {
			mainList.add(new MainModel(tags[i], clsses[i], stringReses[i], drawableReses[i]));
		}
		return mainList;
	}
}
