package com.gzr.app.activity;

import android.app.Person;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

import com.gzr.app.R;

import java.io.Serializable;

public class AndroidTextActivity extends Activity  {

    private TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_text);

        tvTest = (TextView) findViewById(R.id.tv_test);


        Serializable person = getIntent().getSerializableExtra("person");
    }

}
