package com.example.pgFinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {
    Button omkara,kasturi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        omkara= findViewById(R.id.omkara);
        kasturi=findViewById(R.id.kasturi);
        omkara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.magicbricks.com/propertyDetail/lilly-pg-yeyyadi-in-mangalore&pgid=4d42333437333437677261646532";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        kasturi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.magicbricks.com/propertyDetail/mangala-ladies-pg-hampankatta-in-mangalore&pgid=4d42333437393031677261646532";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });


    }
}