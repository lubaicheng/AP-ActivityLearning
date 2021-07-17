package com.example.ap_activitylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private String[] hobby=new String[]{"游泳","读书","篮球"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("mylog","oncreate");
        btn=findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //隐式意图的使用方法:实现页面的跳转；根据action属性到清单文件中进行匹配，然后执行匹配上的对应的activity；
                Intent intent=new Intent("helloworld");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("mylog","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("mylog","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("mylog","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("mylog","onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("mylog","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("mylog","nDestroy");
    }


    public void myclick(View view) {
        //显式意图的使用方法:实现页面的跳转
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        //intent传递数据的方式一：putExtra(数据名称，数据内容)
//        intent.putExtra("UserName","jack");
//        intent.putExtra("Age",23);
//        intent.putExtra("Sex",true);
//        intent.putExtra("Hobby",new String[]{"游泳","读书","篮球"});
//        //执行意图
//        this.startActivity(intent);


        //intent传递数据的方式二：Bundle    捆
        Bundle bundle=new Bundle();
        bundle.putString("UserName","jeny");
        bundle.putInt("Age",23);
        bundle.putBoolean("Sex",false);
        bundle.putStringArray("Hobby",hobby);
        intent.putExtras(bundle);
        //执行意图
        this.startActivity(intent);

    }




}