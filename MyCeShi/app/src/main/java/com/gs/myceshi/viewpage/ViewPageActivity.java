package com.gs.myceshi.viewpage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.gs.myceshi.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewPageActivity extends FragmentActivity implements View.OnClickListener{
    List<Fragment> frList = new ArrayList<>();
    List<String> alist = Arrays.asList("测试1", "测试2", "测试3","测试4","测试5","测试6","测试7");
    ViewPager viewPager;
    MyLinearLayout id_mylinear;
    TextView tv_tv1,tv_tv2,tv_tv3,tv_tv4,tv_tv5,tv_tv6,tv_tv7;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpage);
        initData();
        initView();
    }

    private void initData() {
        for (String s : alist) {
            frList.add(ViewPageFragment.getInstante(s));
        }
    }
   private void initView(){
       id_mylinear=(MyLinearLayout)findViewById(R.id.id_mylinear);
      viewPager =(ViewPager) findViewById(R.id.id_viewpage);
       tv_tv1=findViewById(R.id.tv_tv1);
       tv_tv2=findViewById(R.id.tv_tv2);
       tv_tv3=findViewById(R.id.tv_tv3);
       tv_tv4=findViewById(R.id.tv_tv4);
       tv_tv5=findViewById(R.id.tv_tv5);
       tv_tv6=findViewById(R.id.tv_tv6);
       tv_tv7=findViewById(R.id.tv_tv7);
       tv_tv1.setOnClickListener(this);
       tv_tv2.setOnClickListener(this);
       tv_tv3.setOnClickListener(this);
       tv_tv4.setOnClickListener(this);
       tv_tv5.setOnClickListener(this);
       tv_tv6.setOnClickListener(this);
       tv_tv7.setOnClickListener(this);
      viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
          @Override
          public Fragment getItem(int position) {
              return frList.get(position);
          }

          @Override
          public int getCount() {
              return frList.size();
          }
      });
      viewPager.setCurrentItem(0);
       id_mylinear.setListS(frList.size());
       viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
           @Override
           public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
               id_mylinear.onScrol(position,positionOffset);
           }

           @Override
           public void onPageSelected(int position) {

           }

           @Override
           public void onPageScrollStateChanged(int state) {

           }
       });
   }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_tv1:
                viewPager.setCurrentItem(0);
                break;
            case R.id.tv_tv2:
                viewPager.setCurrentItem(1);
                break;
            case R.id.tv_tv3:
                viewPager.setCurrentItem(2);
                break;
            case R.id.tv_tv4:
                viewPager.setCurrentItem(3);
                break;
            case R.id.tv_tv5:
                viewPager.setCurrentItem(4);
                break;
            case R.id.tv_tv6:
                viewPager.setCurrentItem(5);
                break;
            case R.id.tv_tv7:
                viewPager.setCurrentItem(6);
                break;
        }
    }
}
