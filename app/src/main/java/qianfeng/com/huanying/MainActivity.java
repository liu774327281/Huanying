package qianfeng.com.huanying;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//1233213213

    private boolean isFirst = true;  //是否是第一次

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
           new Handler().postDelayed(new Runnable() {
               @Override
               public void run() {
                   Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                   startActivity(intent);
                   finish();
               }
           },3000);
    }





}



