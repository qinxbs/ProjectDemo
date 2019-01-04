package com.gs.myceshi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import me.jessyan.autosize.internal.CancelAdapt;//放弃适配

public class TwoActivity  extends AppCompatActivity implements CancelAdapt{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }
    public void onCll(View view){
        startActivity(new Intent(this,ThreeActivity.class));
    }
}
