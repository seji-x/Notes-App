package com.example.appghichu.activity;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
        // Sử dụng ViewPump để bọc (wrap) ngữ cảnh mới với ViewPumpContextWrapper
        // ViewPump là một thư viện giúp tùy chỉnh Font chữ trong ứng dụng
        // Bằng cách gọi wrap(newBase), nó có thể tương tác với cấu trúc ngôn ngữ và UI của ứng dụng
    }

}

