package com.liangxiao.tabviewpagerindicator.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.liangxiao.tabviewpagerindicator.R;
import com.liangxiao.tabviewpagerindicator.adapter.ViewPagerIndicatorAdapter;

@SuppressLint("ValidFragment")
public class ViewPagerIndicatorFragment extends Fragment {

	private int pos;

	@SuppressLint("ValidFragment")
	public ViewPagerIndicatorFragment(int pos) {
		this.pos = pos;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.frag, container, false);
		TextView tv = (TextView) v.findViewById(R.id.id_tv);
		tv.setText(ViewPagerIndicatorAdapter.TITLES[pos]);
		return v;
	}
}
