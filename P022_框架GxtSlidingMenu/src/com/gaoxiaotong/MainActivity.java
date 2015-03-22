package com.gaoxiaotong;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {
	private SlideMenu slideMenu;
	//private SlideMenuRight slideMenuRight;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		slideMenu = (SlideMenu) findViewById(R.id.slide_menu);
		//slideMenuRight = (SlideMenuRight) findViewById(R.id.slide_menu_right);
		ImageView menuImg = (ImageView) findViewById(R.id.title_bar_menu_btn);
		menuImg.setOnClickListener(this);
		//ImageView menuImgRight = (ImageView) findViewById(R.id.title_bar_menu_btn2);
		//menuImgRight.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.title_bar_menu_btn:
			if (slideMenu.isMainScreenShowing()) {
				slideMenu.openMenu();
			} else {
				slideMenu.closeMenu();
			}
			break;

//		case R.id.title_bar_menu_btn2:
//			if (slideMenuRight.isMainScreenShowing()) {
//				slideMenuRight.openMenu();
//			} else {
//				slideMenuRight.closeMenu();
//			}
//			break;
		}

	}

}
