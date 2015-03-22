package com.liangxiao.tabviewpagerindicator.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.liangxiao.tabviewpagerindicator.fragment.ViewPagerIndicatorFragment;

public class ViewPagerIndicatorAdapter extends FragmentPagerAdapter {

	// public String[] mTitle;
	public static final String[] TITLES = new String[] { "课程", "问答", "求课", "学习", "计划" };

	public ViewPagerIndicatorAdapter(FragmentManager fm) {
		super(fm);

		// this.mTitle = mTitle;
	}

	@Override
	public Fragment getItem(int position) {
		ViewPagerIndicatorFragment fragment = new ViewPagerIndicatorFragment(
				position);
		return fragment;
	}

	@Override
	public int getCount() {
		return TITLES.length;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return TITLES[position];
	}
}
