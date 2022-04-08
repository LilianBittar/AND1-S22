package com.lilianbittar.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private NavController navController;
    private NavigationView navigationView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setUpNavigation();

        navigationView.setNavigationItemSelectedListener(v -> {
            int itemId = v.getItemId();
            if (itemId == R.id.nav_home) {
                Toast.makeText(this, "SETTINGS WAS CLICKED", Toast.LENGTH_SHORT).show();
                return true;
            } else if (itemId == R.id.nav_gallery) {
                Toast.makeText(this, "GALLERY WAS CLICKED", Toast.LENGTH_SHORT).show();
                return true;
            } else {
                return false;
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    private void initViews(){
        navigationView = findViewById(R.id.navigation_drawer);
        toolbar = findViewById(R.id.toolbar);
    }

    private void setUpNavigation(){
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        setSupportActionBar(toolbar);
    }



}