package com.example.ap_activitylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //接受intent意图
        Intent intent =this.getIntent();
        //从intent对象中取值
//       String name=intent.getStringExtra("UserName");
//       int age=intent.getIntExtra("Age",-1);
//       boolean sex=intent.getBooleanExtra("sex",false);
//       String[] hobby=intent.getStringArrayExtra("Hobby");


       //从intent对象中获取bundle对象
        Bundle bundle=intent.getExtras();
        String name=bundle.getString("UserName");
        int age= bundle.getInt("Age",-1);
        boolean sex=bundle.getBoolean("sex",false);
        String[] hobby=bundle.getStringArray("Hobby");

        Toast.makeText(SecondActivity.this,name+age+sex+hobby[1],Toast.LENGTH_LONG).show();
    }
}