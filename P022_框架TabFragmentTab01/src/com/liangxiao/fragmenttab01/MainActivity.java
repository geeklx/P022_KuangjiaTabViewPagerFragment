package com.liangxiao.fragmenttab01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.liangxiao.fragmenttab01.fragment.AddressFragment;
import com.liangxiao.fragmenttab01.fragment.FrdFragment;
import com.liangxiao.fragmenttab01.fragment.SettingFragment;
import com.liangxiao.fragmenttab01.fragment.WeixinFragment;

public class MainActivity extends FragmentActivity implements OnClickListener {
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

	private void setSelect(int i) {
		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();
		hideFragment(transaction);
		switch (i) {
		case 0:
			if (mTab01 == null) {
				mTab01 = new WeixinFragment();
				transaction.add(R.id.id_content, mTab01);
			} else {
				transaction.show(mTab01);
			}
			iv_weixin.setImageResource(R.drawable.tab_weixin_pressed);
			break;
		case 1:
			if (mTab02 == null) {
				mTab02 = new FrdFragment();
				transaction.add(R.id.id_content, mTab02);
			} else {
				transaction.show(mTab02);
			}
			iv_frd.setImageResource(R.drawable.tab_find_frd_pressed);
			break;
		case 2:
			if (mTab03 == null) {
				mTab03 = new AddressFragment();
				transaction.add(R.id.id_content, mTab03);
			} else {
				transaction.show(mTab03);
			}
			iv_address.setImageResource(R.drawable.tab_address_pressed);
			break;
		case 3:
			if (mTab04 == null) {
				mTab04 = new SettingFragment();
				transaction.add(R.id.id_content, mTab04);
			} else {
				transaction.show(mTab04);
			}
			iv_settings.setImageResource(R.drawable.tab_settings_pressed);
			break;
		default:
			break;
		}

		transaction.commit();

	}

	private void hideFragment(FragmentTransaction transaction) {
		if (mTab01 != null) {
			transaction.hide(mTab01);
		}
		if (mTab02 != null) {
			transaction.hide(mTab02);
		}
		if (mTab03 != null) {
			transaction.hide(mTab03);
		}
		if (mTab04 != null) {
			transaction.hide(mTab04);
		}
	}

	private void initEvent() {
		ll_weixin.setOnClickListener(this);
		ll_frd.setOnClickListener(this);
		ll_address.setOnClickListener(this);
		ll_settings.setOnClickListener(this);
	}

	private void initView() {
		iv_weixin = (ImageButton) findViewById(R.id.id_tab_weixin_img);
		iv_frd = (ImageButton) findViewById(R.id.id_tab_frd_img);
		iv_address = (ImageButton) findViewById(R.id.id_tab_address_img);
		iv_settings = (ImageButton) findViewById(R.id.id_tab_settings_img);
		ll_weixin = (LinearLayout) findViewById(R.id.id_tab_weixin);
		ll_frd = (LinearLayout) findViewById(R.id.id_tab_frd);
		ll_address = (LinearLayout) findViewById(R.id.id_tab_address);
		ll_settings = (LinearLayout) findViewById(R.id.id_tab_settings);

	}

	@Override
	public void onClick(View v) {
		resetImg();
		switch (v.getId()) {
		case R.id.id_tab_weixin:
			setSelect(0);
			iv_weixin.setImageResource(R.drawable.tab_weixin_pressed);
			break;
		case R.id.id_tab_frd:
			setSelect(1);
			iv_frd.setImageResource(R.drawable.tab_find_frd_pressed);
			break;
		case R.id.id_tab_address:
			setSelect(2);
			iv_address.setImageResource(R.drawable.tab_address_pressed);
			break;
		case R.id.id_tab_settings:
			setSelect(3);
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
