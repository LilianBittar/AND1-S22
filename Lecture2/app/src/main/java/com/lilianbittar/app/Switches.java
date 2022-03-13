package com.lilianbittar.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class Switches extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switches);

        ImageView im = findViewById(R.id.imageView);
        Switch s = findViewById(R.id.switch1);

        s.setOnClickListener(view -> {
            if (s.isChecked()){
                im.setImageResource(R.drawable.seal);
            } else {
                im.setImageResource(R.drawable.cat);
            }
        });
    }

    @Override
    public void onConfigurationChanged( Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.switch_landscape);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.switches);
        }
    }
}
