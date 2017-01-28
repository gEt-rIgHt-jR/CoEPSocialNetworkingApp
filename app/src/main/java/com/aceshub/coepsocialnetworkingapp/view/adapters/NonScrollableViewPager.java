package com.aceshub.coepsocialnetworkingapp.view.adapters;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NonScrollableViewPager extends ViewPager {
    public NonScrollableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NonScrollableViewPager(Context context) {
        super(context);
    }

    @Override
    public boolean canScrollHorizontally(int direction) {
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }
}
