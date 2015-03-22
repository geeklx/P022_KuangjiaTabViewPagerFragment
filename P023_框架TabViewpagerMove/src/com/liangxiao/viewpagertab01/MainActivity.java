package com.liangxiao.viewpagertab01;

import java.util.ArrayList;
import java.util.List;

import com.liangxiao.viewpagertab01.adapter.ViewpagerAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements OnClickListener {
	private ViewPager mViewPager;
	private List<View> mViews = new ArrayList<View>();
	private ViewpagerAdapter mAdapter;
	private Context mContext;
	private ImageButton iv_weixin;
	private ImageButton iv_frd;
	private ImageButton iv_address;
	private ImageButton iv_settings;
	private LinearLayout ll_weixin;
	private LinearLayout ll_frd;
	private LinearLayout ll_address;
	private LinearLayout ll_settings;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = this;
		initView();
		initEvent();
	}

	private void initEvent() {
		ll_weixin.setOnClickListener(this);
		ll_frd.setOnClickListener(this);
		ll_address.setOnClickListener(this);
		ll_settings.setOnClickListener(this);

		mViewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
				int mCurrentItem = mViewPager.getCurrentItem();
				resetImg();
				switch (mCurrentItem) {
				case 0:
					iv_weixin.setImageResource(R.drawable.tab_weixin_pressed);
					break;
				case 1:
					iv_frd.setImageResource(R.drawable.tab_find_frd_pressed);
					break;
				case 2:
					iv_address.setImageResource(R.drawable.tab_address_pressed);
					break;
				case 3:
					iv_settings
							.setImageResource(R.drawable.tab_settings_pressed);
					break;
				default:
					break;
				}
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {

			}
		});

	}

	private void initView() {
		mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
		iv_weixin = (ImageButton) findViewById(R.id.id_tab_weixin_img);
		iv_frd = (ImageButton) findViewById(R.id.id_tab_frd_img);
		iv_address = (ImageButton) findViewById(R.id.id_tab_address_img);
		iv_settings = (ImageButton) findViewById(R.id.id_tab_settings_img);
		ll_weixin = (LinearLayout) findViewById(R.id.id_tab_weixin);
		ll_frd = (LinearLayout) findViewById(R.id.id_tab_frd);
		ll_address = (LinearLayout) findViewById(R.id.id_tab_address);
		ll_settings = (LinearLayout) findViewById(R.id.id_tab_settings);

		LayoutInflater inflater = LayoutInflater.from(mContext);
		View tab01 = inflater.inflate(R.layout.tab01, null);
		View tab02 = inflater.inflate(R.layout.tab02, null);
		View tab03 = inflater.inflate(R.layout.tab03, null);
		View tab04 = inflater.inflate(R.layout.tab04, null);

		mViews.add(tab01);
		mViews.add(tab02);
		mViews.add(tab03);
		mViews.add(tab04);

		mAdapter = new ViewpagerAdapter(mViews, mContext);
		mViewPager.setAdapter(mAdapter);

	}

	@Override
	public void onClick(View v) {
		resetImg();
		switch (v.getId()) {
		case R.id.id_tab_weixin:
			mViewPager.setCurrentItem(0);
			iv_weixin.setImageResource(R.drawable.tab_weixin_pressed);
			break;
		case R.id.id_tab_frd:
			mViewPager.setCurrentItem(1);
			iv_frd.setImageResource(R.drawable.tab_find_frd_pressed);
			break;
		case R.id.id_tab_address:
			mViewPager.setCurrentItem(2);
			iv_address.setImageResource(R.drawable.tab_address_pressed);
			break;
		case R.id.id_tab_settings:
			mViewPager.setCurrentItem(3);
			iv_settings.setImageResource(R.drawable.tab_settings_pressed);
			break;
		default:
			break;
		}
	}

	/**
	 * ÇÐ»»Í¼Æ¬Îª°µÉ«
	 */
	private void resetImg() {
		iv_weixin.setImageResource(R.drawable.tab_weixin_normal);
		iv_frd.setImageResource(R.drawable.tab_find_frd_normal);
		iv_address.setImageResource(R.drawable.tab_address_normal);
		iv_settings.setImageResource(R.drawable.tab_settings_normal);
	}

}
