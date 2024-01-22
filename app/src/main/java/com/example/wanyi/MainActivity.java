package com.example.wanyi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textview;
    private String[] jianglige = {
            "你好帅",
            "你好",
            "帅",
            "奖励哥"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.textView2);
        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int s = random.nextInt(jianglige.length);
                textview.setText(jianglige[s]);
                Toast.makeText(MainActivity.this, "帅", Toast.LENGTH_SHORT).show();
            }
        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "傻逼", Toast.LENGTH_SHORT).show();
            }
        });
    }
}