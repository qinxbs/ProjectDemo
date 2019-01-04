package com.gs.myceshi.viewpage;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ViewPageFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.parseColor("#000000"));
        if (getArguments() != null) {
            textView.setText(getArguments().getString("key"));
        }
        return textView;
    }

    public static ViewPageFragment getInstante(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("key", str);
        ViewPageFragment vf = new ViewPageFragment();
        vf.setArguments(bundle);
        return vf;
    }
}
