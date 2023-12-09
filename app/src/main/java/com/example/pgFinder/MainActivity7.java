package com.example.pgFinder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    Button rb,guru;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        guru= findViewById(R.id.guru);
        rb=findViewById(R.id.rb);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.magicbricks.com/propertyDetail/eshwari-cottage-pg-ballalbagh-in-mangalore&pgid=4d42333439353739677261646532";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        guru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.magicbricks.com/propertyDetail/guru-kripa-pg-kodikal-in-mangalore&pgid=4d42323531323437677261646532";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });


    }
}