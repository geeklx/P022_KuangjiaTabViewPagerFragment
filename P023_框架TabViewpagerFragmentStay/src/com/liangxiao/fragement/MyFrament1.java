package com.liangxiao.fragement;

import com.liangxiao.fragmentviewpagerdemo.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MyFrament1 extends Fragment {

	private TextView myTextView;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.myfragment_huati, container, false);
		myTextView = (TextView) v.findViewById(R.id.myTextView);
		myTextView.setOnClickListener(listener);
		return v;
	}

	private OnClickListener listener = new OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.myTextView:
				Toast.makeText(getActivity(), "ΩÁ√Ê“ª", Toast.LENGTH_SHORT).show();
				break;
			}
		}
	};
}
