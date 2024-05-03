package com.example.discord;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        TextView textView = findViewById(R.id.공지);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 토스트 메시지를 생성하고 표시합니다.
                Toast.makeText(getApplicationContext(), "공지사항을 클릭했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        TextView textView = findViewById(R.id.동기);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 토스트 메시지를 생성하고 표시합니다.
                Toast.makeText(getApplicationContext(), "동기에게-물어봐를 클릭했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        TextView textView = findViewById(R.id.인공);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 토스트 메시지를 생성하고 표시합니다.
                Toast.makeText(getApplicationContext(), "인공지능-과정을 클릭했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        TextView textView = findViewById(R.id.앱);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 토스트 메시지를 생성하고 표시합니다.
                Toast.makeText(getApplicationContext(), "앱-과정을 클릭했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        TextView textView = findViewById(R.id.프로);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 토스트 메시지를 생성하고 표시합니다.
                Toast.makeText(getApplicationContext(), "프로젝트-과정을 클릭했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        TextView textView = findViewById(R.id.점심);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 토스트 메시지를 생성하고 표시합니다.
                Toast.makeText(getApplicationContext(), "점심-추천해요를 클릭했습니다.", Toast.LENGTH_SHORT).show();
            }

            TextView textView = findViewById(R.id.오프);
                                textView.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View v){
                // 토스트 메시지를 생성하고 표시합니다.
                Toast.makeText(getApplicationContext(), "오프더레코드를 클릭했습니다.", Toast.LENGTH_SHORT).show();
            }
            });

            TextView textView = findViewById(R.id.정보);
        textView.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View v){
                // 토스트 메시지를 생성하고 표시합니다.
                Toast.makeText(getApplicationContext(), "정보-공유해요를 클릭했습니다.", Toast.LENGTH_SHORT).show();
            }
            });
        }
    }

