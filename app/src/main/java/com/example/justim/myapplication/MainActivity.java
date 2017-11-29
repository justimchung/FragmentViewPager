package com.example.justim.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private FragmentTransaction transaction;
    private FragmentManager fmag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fmag = getFragmentManager();
        transaction = fmag.beginTransaction();
        transaction.add(R.id.frame_contain, new FragmentUser());
        transaction.commit();
    }
}
