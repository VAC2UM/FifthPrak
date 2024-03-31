package com.itproger.fifthprak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        String[] list_names = getResources().getStringArray(R.array.list_categories);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list_names);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0){
                    Intent intent = new Intent(MainActivity.this, FilmsList.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, SerialsList.class);
                    startActivity(intent);
                }else if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, BooksList.class);
                    startActivity(intent);
                }else if (position == 3){
                    Intent intent = new Intent(MainActivity.this, Clubs.class);
                    startActivity(intent);
                }
            }
        });
    }
}