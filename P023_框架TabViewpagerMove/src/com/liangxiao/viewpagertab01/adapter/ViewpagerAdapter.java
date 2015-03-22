package com.liangxiao.viewpagertab01.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class ViewpagerAdapter extends PagerAdapter {
	private List<View> mViews = new ArrayList<View>();
	private Context mContext;

	public ViewpagerAdapter(List<View> mViews, Context mContext) {
		this.mViews = mViews;
		this.mContext = mContext;
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		View view = mViews.get(position);
		container.addView(view);
		return view;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView(mViews.get(position));
	}

	@Override
	public int getCount() {

		return mViews.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {

		return arg0 == arg1;
	}

}
