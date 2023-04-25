package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView3;
    ImageView imageView3;
    ImageView img;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Get the Intent that started this activity and extract the string
        imageView3= findViewById(R.id.imageView3);
        textView3 = findViewById(R.id.textView3);

        String text = getIntent().getStringExtra("text");
        int image = getIntent().getIntExtra("image",0);
        textView3.setText(text);
        imageView3.setImageResource(image);


    }
}