package com.lilianbittar.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    RecyclerView recyclerView;
    celebrityAdapter celebrityAdapter;
    List<celebrity> celebrities = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        recyclerView = findViewById(R.id.rv);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.hasFixedSize();
//
//
//        celebrities.add(new celebrity("Johnny", R.drawable.johnny,'m', "I'm Johnny!"));
//        celebrities.add(new celebrity("Angelina", R.drawable.angelinajpg,'f', "I'm Angelina!"));
//        celebrityAdapter = new celebrityAdapter(celebrities,this);
//        recyclerView.setAdapter(celebrityAdapter);


//
//        List<Cat> cats = new ArrayList<>();
//
//        cats.add(new Cat("RESHEE",2,"cray"," "));
//        cats.add(new Cat("CATMAN",4,"black",""));
//        cats.add(new Cat("GENGER",1,"orange"," "));
//
//        CatAdapter adapter = new CatAdapter(cats, this);
//        recyclerView.setAdapter(adapter);
    }

//    @Override
//    public void onClick(int position) {
//        Toast.makeText(this, celebrities.get(position).getQuote(), Toast.LENGTH_SHORT).show();
//    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
      String text = adapterView.getItemAtPosition(i).toString();
      Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}