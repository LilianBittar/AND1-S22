package com.lilianbittar.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button1);
        Button b1 = findViewById(R.id.button2);
        ProgressBar pb = findViewById(R.id.progressBar);

        b.setOnClickListener(view -> {
           int current=  pb.getProgress();
          pb.setProgress(--current);
        });
         b1.setOnClickListener(view -> {
             int current=  pb.getProgress();
             pb.setProgress(++current);

         });




//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               Toast.makeText(getApplicationContext(), "Sally", Toast.LENGTH_SHORT).show();
//            }
//        });

//        //another way to write:


    }

//    public void showToast(View view){
//
//        Toast.makeText(this,"you suck", Toast.LENGTH_SHORT).show();
//    }
}