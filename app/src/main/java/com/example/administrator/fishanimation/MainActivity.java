package com.example.administrator.fishanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题栏
        setContentView(R.layout.activity_main);
        ImageView ivFish = findViewById(R.id.iv_fish);
        ivFish.setImageDrawable(new FinishDrawable());
    }
}
