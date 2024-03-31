package com.itproger.fifthprak;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class FilmsList extends AppCompatActivity {
    ArrayList<String> films = new ArrayList<String>();
    ArrayList<String> selectedFilms = new ArrayList<String>();
    ArrayAdapter<String> filmsAdapter;
    ListView filmsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films_list);

        // добавление элементов в список
        String[] films_names = getResources().getStringArray(R.array.films_names);
        Collections.addAll(films, films_names);

        // получение элемента
        filmsList = findViewById(R.id.films_list);

        // создание адаптера
        filmsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, films);

        filmsList.setAdapter(filmsAdapter);

        filmsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // получаем нажатый элемент
                String film = filmsAdapter.getItem(position);

                if (filmsList.isItemChecked(position)){
                    selectedFilms.add(film);
                }
                else{
                    selectedFilms.remove(film);
                }
            }
        });
    }

    public void add(View view){
        EditText filmName = findViewById(R.id.film_name);
        String film = filmName.getText().toString();

        if(!film.isEmpty()){
            films.add(film);
            filmName.setText("");
            filmsAdapter.notifyDataSetChanged();
        }
    }

    public void remove(View view){
        for (int i=0; i< selectedFilms.size();i++){
            films.remove(selectedFilms.get(i));
        }
        filmsList.clearChoices();
        selectedFilms.clear();
        filmsAdapter.notifyDataSetChanged();
    }
}
