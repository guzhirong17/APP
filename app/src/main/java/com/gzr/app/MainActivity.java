package com.gzr.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.gzr.app.activity.AndroidTextActivity;
import com.gzr.app.bean.Person;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.btn)
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btn){
            Person person = new Person();
            person.setAge(30);
            person.setName("zhangsan");
            person.setSex("man");
            Intent intent = new Intent(MainActivity.this, AndroidTextActivity.class);
            intent.putExtra("person", person);
            startActivity(intent);
        }
    }
}
