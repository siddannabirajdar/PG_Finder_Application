package com.example.pgFinder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    Button nest,down,thapasya,dabba,brahmi;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        nest= findViewById(R.id.nest);
        down=findViewById(R.id.down);
        thapasya=findViewById(R.id.thapasya);
        dabba=findViewById(R.id.dabba);
        brahmi=findViewById(R.id.brahmi);

        nest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.magicbricks.com/propertyDetail/the-nest-pg-vivek-vihar-in-new-delhi%26pgid=4d42323836313635677261646532";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.magicbricks.com/propertyDetail/downtown-pg-mahindra-world-city-in-chennai&pgid=4d423135363231677261646531";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        thapasya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.magicbricks.com/propertyDetail/rose-villa-pg-mallikatte-in-mangalore&pgid=4d42333139343333677261646532";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        dabba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.magicbricks.com/propertyDetail/varahi-pg-for-girls-and-working-women-kadri-in-mangalore&pgid=4d42333737303835677261646532";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        brahmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.magicbricks.com/propertyDetail/gangotri-pg-urwa-in-mangalore&pgid=4d42333438393037677261646532";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
    }
}