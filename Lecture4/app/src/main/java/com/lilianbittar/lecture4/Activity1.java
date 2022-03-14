package com.lilianbittar.lecture4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


    Toolbar toolbar = findViewById(R.id.my_toolbar);
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int itemId = item.getItemId();

        if (itemId == R.id.activity_1){
            Intent intent = new Intent(Activity1.this, Activity1.class);
            startActivity(intent);
            return true;
        } else if (itemId == R.id.activity_2) {
            Intent intent = new Intent(Activity1.this, Activty2.class);
            startActivity(intent);
            return true;
        }
        else if (itemId == R.id.activity_3) {
            Intent intent = new Intent(Activity1.this, Activity3.class);
            startActivity(intent);
            return true;
        }
        return  super.onOptionsItemSelected(item);
    }
}