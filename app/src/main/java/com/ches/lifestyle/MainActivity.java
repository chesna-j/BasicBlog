package com.ches.lifestyle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    AppCompatButton b1,b2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        SharedPreferences pref =getSharedPreferences("blogapp",MODE_PRIVATE);
        String username=pref.getString("user",null);
        if(username!=null)
        {
            Intent i=new Intent(getApplicationContext(),BlogPage.class);
            startActivity(i);
        }
        e1=(EditText) findViewById(R.id.uname);
        e2=(EditText) findViewById(R.id.pass);
        b1 = (AppCompatButton) findViewById(R.id.logbtn);
        b2= (AppCompatButton) findViewById(R.id.signinbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String getUname=e1.getText().toString();
                    String getPass=e2.getText().toString();
                    if(getUname.equals("admin")&& getPass.equals("12345"))
                    {
                        SharedPreferences pref =getSharedPreferences("blogapp",MODE_PRIVATE);
                        SharedPreferences.Editor editor = pref.edit();
                        editor.putString("user","admin");
                        editor.apply();
                        Intent i=new Intent(getApplicationContext(),BlogPage.class);
                        startActivity(i);
                    }
                    else
                    {

                        Toast.makeText(getApplicationContext(),"invalid credentials",Toast.LENGTH_SHORT).show();
                    }
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),LogEntry.class);
                startActivity(i);
            }
        });
    }

}