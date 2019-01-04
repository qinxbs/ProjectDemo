package com.gs.myceshi.viewpage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.gs.myceshi.R;

import PbUtils.DensityUtils;


public class MyLinearLayout extends LinearLayout {
    private int sjxWidth;//三角形宽度
    private int sjxHeigth;//高度
    private float sjx_pl = 1 / 6F;
    private int initTranstlateX;
    private int moveTranstlaeX = 0;
    Paint paint;
    private int TAB_NUM = 3;
    private int list_size=0;
    public MyLinearLayout(Context context) {
        this(context, null);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //初始化画笔
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#ffffff"));
        paint.setStyle(Paint.Style.FILL);
        paint.setPathEffect(new CornerPathEffect(2));

        TypedArray array = context.getTheme().obtainStyledAttributes(attrs, R.styleable.MyLinearLayout,defStyleAttr,0);
        TAB_NUM = array.getInt(R.styleable.MyLinearLayout_tab_num,FIND_VIEWS_WITH_CONTENT_DESCRIPTION);
        if(TAB_NUM==0){
            TAB_NUM=3;
        }
        array.recycle();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(initTranstlateX + moveTranstlaeX, getHeight());
        canvas.drawPath(path, paint);
        canvas.restore();
        super.dispatchDraw(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        sjxWidth = (int) (w / TAB_NUM * sjx_pl);
        initTranstlateX = w / TAB_NUM / 2 - sjxWidth / 2;
        sjxHeigth = sjxWidth / 2;
        initPath();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View view = getChildAt(i);
            LinearLayout.LayoutParams ll = (LayoutParams) view.getLayoutParams();
            if(DensityUtils.getWindowWidth(getContext())>0){
                ll.width = DensityUtils.getWindowWidth(getContext()) / TAB_NUM;
//                view.setLayoutParams(ll);
            }
        }
    }

    Path path = new Path();

    private void initPath() {
        path.moveTo(0, 0);
        path.lineTo(sjxWidth, 0);
        path.lineTo(sjxWidth / 2, -sjxHeigth);
        path.close();
    }
    public void setListS(int size){
        list_size=size;
    }
    public void onScrol(int position, float positionOffset) {
        int tabWith=getWidth() / TAB_NUM;
        moveTranstlaeX = (int) (tabWith* (position + positionOffset));
        //容器移动
        if(TAB_NUM!=1){
            if(position>=(TAB_NUM-2)&&position<(list_size-2)&&positionOffset>0&&getChildCount()>TAB_NUM){
                scrollTo((position-(TAB_NUM-2))*tabWith+(int)(tabWith*positionOffset),0);
            }
        }else{
            scrollTo(position*tabWith+(int)(tabWith*position),0);
        }


        invalidate();
    }
}
