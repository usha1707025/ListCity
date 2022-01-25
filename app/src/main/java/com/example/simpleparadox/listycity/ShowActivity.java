package com.example.simpleparadox.listycity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextView text1= findViewById(R.id.city);


        Button button = findViewById(R.id.back);
        Intent new_intent = getIntent();
        text1.setText(new_intent.getStringExtra("key"));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ShowActivity.this, MainActivity.class);
                ShowActivity.this.startActivity(in);
            }
        });
    }
}