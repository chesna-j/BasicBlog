package com.ches.lifestyle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Search extends AppCompatActivity {
AppCompatButton b1,b2;
EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search);
        b1=(AppCompatButton) findViewById(R.id.menubtn);
        e1=(EditText)findViewById(R.id.title);
        b2=(AppCompatButton)findViewById(R.id.search);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String getTitle=e1.getText().toString();
                    Toast.makeText(getApplicationContext(), "searching "+getTitle, Toast.LENGTH_SHORT).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), e1.toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        b1.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), BlogPage.class);
                startActivity(i);
            }
        });
    }
}