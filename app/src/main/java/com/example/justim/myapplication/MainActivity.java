package com.example.justim.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private FragmentTransaction transaction;
    private FragmentManager fmag;
    private RadioButton rbUser, rbObject, rbSetting, rbMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        rbUser.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_assignment_ind_white_24dp, 0, 0);
        rbUser.setTextColor(getResources().getColor(R.color.colorTextEnable));
        fmag = getFragmentManager();
        transaction = fmag.beginTransaction();
        transaction.add(R.id.frame_contain, new FragmentUser());
        transaction.commit();
    }

    private void initViews() {
        rbUser = findViewById(R.id.rbPersonal);
        rbObject = findViewById(R.id.rbObject);
        rbSetting = findViewById(R.id.rbSetting);
        rbMessage = findViewById(R.id.rbMessage);
    }
}
