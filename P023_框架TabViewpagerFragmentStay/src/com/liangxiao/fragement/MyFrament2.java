package com.liangxiao.fragement;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.liangxiao.fragmentviewpagerdemo.R;

public class MyFrament2 extends Fragment {

	private TextView myTextView;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.myfragment_huodong, container, false);
		myTextView = (TextView) v.findViewById(R.id.myTextView);
		myTextView.setOnClickListener(listener);
		return v;
	}

	private OnClickListener listener = new OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.myTextView:
				Toast.makeText(getActivity(), "½çÃæ¶þ", Toast.LENGTH_SHORT).show();
				break;
			}
		}
	};
}
