package com.liangxiao.tabviewpagerindicator;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Window;

import com.liangxiao.tabviewpagerindicator.adapter.ViewPagerIndicatorAdapter;
import com.viewpagerindicator.TabPageIndicator;

public class MainActivity extends FragmentActivity {

	private ViewPager mViewPager;
	private ViewPagerIndicatorAdapter mAdapter;
	private TabPageIndicator mTabPageIndicator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		initView();
	}

	private void initView() {
		mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
		mTabPageIndicator = (TabPageIndicator) findViewById(R.id.id_indicator);

		mAdapter = new ViewPagerIndicatorAdapter(getSupportFragmentManager());
		mViewPager.setAdapter(mAdapter);

		mTabPageIndicator.setViewPager(mViewPager, 0);

	}
}
