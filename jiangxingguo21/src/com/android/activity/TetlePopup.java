package com.android.activity;

import android.content.Context;
import android.graphics.Rect;
import android.widget.PopupWindow;

public class TetlePopup extends PopupWindow{
	private Context mContext;
	
	protected final int LIST_PADDING = 10;
	private Rect mRect = new Rect();
	private final int[] mLocation = new int[2];
	private int mScreenWidth,mScreenHeight;

}
