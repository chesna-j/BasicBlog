package com.ches.lifestyle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class View extends AppCompatActivity {
    AppCompatButton b1;
    //TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view);
        Intent intent = getIntent();
       /* int count = intent.getIntExtra("EXTRA_COUNT", 0);
        t1 = findViewById(R.id.textView);*/
        b1=(AppCompatButton) findViewById(R.id.menubtn);
        //t1.setText(String.format("%s post was created", String.valueOf(count)));
        b1.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                Intent i=new Intent(getApplicationContext(), BlogPage.class);
                startActivity(i);
            }
        });

    }
}