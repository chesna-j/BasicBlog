package com.ches.lifestyle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Add extends AppCompatActivity {
    AppCompatButton b1,b2;
    EditText e1,e2,e3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        b1=(AppCompatButton) findViewById(R.id.menubtn);
        b2=(AppCompatButton)findViewById(R.id.addbtn);
        e1=(EditText)findViewById(R.id.title);
        e2=(EditText)findViewById(R.id.des);
        e3=(EditText)findViewById(R.id.author);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*int count=1;
                Intent intent = new Intent(Add.this, View.class);
                intent.putExtra("EXTRA_COUNT",count);
                startActivity(intent);*/
                Intent i = new Intent(getApplicationContext(), com.ches.lifestyle.View.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), BlogPage.class);
                startActivity(i);
            }
        });

    }
}