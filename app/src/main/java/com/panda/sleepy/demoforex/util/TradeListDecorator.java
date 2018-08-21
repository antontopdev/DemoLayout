package com.panda.sleepy.demoforex.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;

import com.panda.sleepy.demoforex.R;

/*
 * Created by Anton Popov on 20.08.18.
 */
public class TradeListDecorator extends DividerItemDecoration {

    private Drawable divider;
    private float dividerHeight;

    public TradeListDecorator(Context context, int orientation) {
        super(context, orientation);
        divider = context.getResources().getDrawable(R.drawable.divider_dark);
        dividerHeight = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1, context.getResources().getDisplayMetrics());
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {

        int left = parent.getPaddingLeft();
        int right = parent.getWidth() - parent.getPaddingRight();

        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = parent.getChildAt(i);

            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            int top = child.getBottom() + params.bottomMargin;
            int bottom = top + (int) dividerHeight;

            divider.setBounds(left, top, right, bottom);
            divider.draw(c);
        }
    }
}
