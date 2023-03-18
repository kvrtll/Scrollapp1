package com.example.scrollapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView plList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plList = findViewById(R.id.tv_pl_names);

        String[] names = {"H","eцу","l","l","o","","w","o","r","l","d","","my","name","is","Nikita","^_^"};

        plList.setText("");
        for(String name : names) {
            plList.append(name+ "\n");
        }


    }
}