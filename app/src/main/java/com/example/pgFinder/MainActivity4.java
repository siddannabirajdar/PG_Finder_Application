package com.example.pgFinder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    SearchView searchView;
    ListView myListView;


    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        searchView = findViewById(R.id.searchView);
        myListView = findViewById(R.id.listview);
        myListView.setVisibility(View.GONE);
        arrayList = new ArrayList<>();
        arrayList.add("Moodbidri");
        arrayList.add("Mangalore");
        arrayList.add("Surathkal");
        arrayList.add("Udupi");
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        myListView.setAdapter((adapter));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                myListView.setVisibility(View.VISIBLE);
                adapter.getFilter().filter(s);
                return false;
            }
        });




        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedItem = (String) adapterView.getItemAtPosition(position);


                if (selectedItem.equals("Moodbidri")) {
                    // Handle the button click for "Monday"
                    // For example, show a Toast message
                    Toast.makeText(MainActivity4.this, " button clicked", Toast.LENGTH_SHORT).show();
                    Intent intent  = new Intent(getApplicationContext(),MainActivity5.class);
                    startActivity(intent);
                }
                else if (selectedItem.equals("Mangalore")){
                    Toast.makeText(MainActivity4.this, " button clicked", Toast.LENGTH_SHORT).show();
                    Intent intent  = new Intent(getApplicationContext(),MainActivity6.class);
                    startActivity(intent);
                }
                else if (selectedItem.equals("Surathkal")){
                    Toast.makeText(MainActivity4.this, " button clicked", Toast.LENGTH_SHORT).show();
                    Intent intent  = new Intent(getApplicationContext(),MainActivity7.class);
                    startActivity(intent);
                }
                else if (selectedItem.equals("Udupi")){
                    Toast.makeText(MainActivity4.this, " button clicked", Toast.LENGTH_SHORT).show();
                    Intent intent  = new Intent(getApplicationContext(),MainActivity8.class);
                    startActivity(intent);
                }
            }

        });
    }}



