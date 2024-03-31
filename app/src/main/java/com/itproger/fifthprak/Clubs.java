package com.itproger.fifthprak;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Clubs extends AppCompatActivity {
    ArrayList<Club> clubs = new ArrayList<Club>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        ClubAdapter adapter = new ClubAdapter(this, clubs);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){

        clubs.add(new Club ("ЦСКА", "Россия", R.drawable.cska));
        clubs.add(new Club ("Барселона", "Испания", R.drawable.barcelona));
        clubs.add(new Club ("Интер", "Италия", R.drawable.inter));
        clubs.add(new Club ("Бавария", "Германия", R.drawable.bayern));
        clubs.add(new Club ("Ливерпуль", "Англия", R.drawable.liverpool));
    }
}