package com.chinalwb.are;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;

public class NoBackgroundColorImageView extends android.support.v7.widget.AppCompatImageView {

    private static final int GRAY_COLOR = Color.parseColor("#D8D8D8");

    public NoBackgroundColorImageView(Context context) {
        super(context);
    }

    public NoBackgroundColorImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public NoBackgroundColorImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setBackgroundColor(int color) {
        if (color == Color.TRANSPARENT) {
            super.setBackgroundColor(color);
        } else {
            super.setBackgroundColor(GRAY_COLOR);
        }
    }
}
