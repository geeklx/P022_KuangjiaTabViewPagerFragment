package com.liangxiao.tabviewpagerfragment01;

import java.util.ArrayList;
import java.util.List;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.liangxiao.fragmenttab01.fragment.AddressFragment;
import com.liangxiao.fragmenttab01.fragment.FrdFragment;
import com.liangxiao.fragmenttab01.fragment.SettingFragment;
import com.liangxiao.fragmenttab01.fragment.WeixinFragment;
import com.liangxiao.fragmenttab01.fragmentAdapter.FragmentAdapter;

public class MainActivity extends FragmentActivity implements OnClickListener {
	private ViewPager mViewPager;
	private FragmentAdapter mAdapter;
	private List<Fragment> mFragments;

	private ImageButton iv_weixin;
	private ImageButton iv_frd;
	private ImageButton iv_address;
	private ImageButton iv_settings;
	private LinearLayout ll_weixin;
	private LinearLayout ll_frd;
	private LinearLayout ll_address;
	private LinearLayout ll_settings;
	private Fragment mTab01;
	private Fragment mTab02;
	private Fragment mTab03;
	private Fragment mTab04;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initEvent();
		setSelect(0);
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
				setTab(mCurrentItem);
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

		mFragments = new ArrayList<Fragment>();
		Fragment mTab01 = new WeixinFragment();
		Fragment mTab02 = new FrdFragment();
		Fragment mTab03 = new AddressFragment();
		Fragment mTab04 = new SettingFragment();
		mFragments.add(mTab01);
		mFragments.add(mTab02);
		mFragments.add(mTab03);
		mFragments.add(mTab04);

		mAdapter = new FragmentAdapter(getSupportFragmentManager(), mFragments);

		mViewPager.setAdapter(mAdapter);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.id_tab_weixin:
			setSelect(0);
			break;
		case R.id.id_tab_frd:
			setSelect(1);
			break;
		case R.id.id_tab_address:
			setSelect(2);
			break;
		case R.id.id_tab_settings:
			setSelect(3);
			break;
		default:
			break;
		}
	}

	private void setSelect(int i) {
		setTab(i);
		mViewPager.setCurrentItem(i);
	}

	private void setTab(int i) {
		resetImg();
		switch (i) {
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
