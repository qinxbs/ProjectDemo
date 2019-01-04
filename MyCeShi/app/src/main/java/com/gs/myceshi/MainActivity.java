package com.gs.myceshi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import PbUtils.DensityUtils;
import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.internal.CustomAdapt;
import me.jessyan.autosize.unit.Subunits;

public class MainActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        AutoSizeConfig.getInstance().getUnitsManager()
//                .setSupportDP(false)
//                .setSupportSP(false)
//                .setSupportSubunits(Subunits.MM);
        setContentView(R.layout.acitivity_new);
        Log.e("Tag","1920px = "+ DensityUtils.px2dip(this,1920)+"dp"+"    1080px="+DensityUtils.px2dip(this,1080)+"dp");
        Log.e("Tag","1280px = "+ DensityUtils.px2dip(this,1280)+"dp"+"    720px="+DensityUtils.px2dip(this,720)+"dp");
        Log.e("Tag","2560px = "+ DensityUtils.px2dip(this,2560)+"dp"+"    1440px="+DensityUtils.px2dip(this,1440)+"dp");
    }

//    @Override
//    public boolean isBaseOnWidth() {
//        return false;
//    }
//
//    @Override
//    public float getSizeInDp() {
//        return 391;
//    }

    public void internal(View view){
      startActivity(new Intent(this,TwoActivity.class));
    }

//    public void btn(View v){
//       int str= Integer.valueOf(ed_text.getText().toString().trim());
//        Log.e("tag",str+"dp  ="+DensityUtils.dip2px(this,str)+"  px");
//    }



}
