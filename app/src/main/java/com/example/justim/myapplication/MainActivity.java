package com.example.justim.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    public void doClick(View view) {
        transaction = fmag.beginTransaction();
        resetAllButton();
        switch (view.getId()) {
            case R.id.rbPersonal:
                rbUser.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_assignment_ind_white_24dp, 0, 0);
                rbUser.setTextColor(getResources().getColor(R.color.colorTextEnable));
                transaction.replace(R.id.frame_contain, new FragmentUser());
                break;
            case R.id.rbObject:
                rbObject.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_free_breakfast_white_24dp, 0, 0);
                rbObject.setTextColor(getResources().getColor(R.color.colorTextEnable));
                transaction.replace(R.id.frame_contain, new CatelogFragment());
                break;
        }
        transaction.commit();
    }

    private void resetAllButton() {
        rbUser.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_assignment_ind_gray_24dp, 0, 0);
        rbObject.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_free_breakfast_gray_24dp, 0, 0);
        rbMessage.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_message_gray_24dp, 0, 0);
        rbSetting.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_settings_gray_24dp, 0, 0);
        rbUser.setTextColor(getResources().getColor(R.color.colorTextDisable));
        rbObject.setTextColor(getResources().getColor(R.color.colorTextDisable));
        rbMessage.setTextColor(getResources().getColor(R.color.colorTextDisable));
        rbSetting.setTextColor(getResources().getColor(R.color.colorTextDisable));
    }
}
