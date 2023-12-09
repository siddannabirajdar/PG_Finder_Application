package com.example.pgFinder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button shalom,divya,karthik;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        shalom= findViewById(R.id.shalom);
        divya=findViewById(R.id.deepa);
        karthik=findViewById(R.id.karthik);
        shalom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.magicbricks.com/propertyDetail/shalom-pg-pandeshwar-in-mangalore&pgid=4d42333738353533677261646532";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        divya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.magicbricks.com/propertyDetail/deepa-girls-pg-sector-14-in-gurgaon&pgid=4d4238313637677261646531";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        karthik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.magicbricks.com/propertyDetail/sri-sai-resedenshal-luxery-pg-for-lades-thirumenahalli-in-bangalore&pgid=4d42393935677261646531";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });

    }
}