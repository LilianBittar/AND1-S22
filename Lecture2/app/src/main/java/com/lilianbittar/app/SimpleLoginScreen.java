package com.lilianbittar.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SimpleLoginScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_login);

        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        Button b = findViewById(R.id.login);

       b.setOnClickListener(view -> {
           if (email.getText().toString().equals("user@email.com") && password.getText().toString().equals("ILOVEAND")){
               Toast.makeText(this, "welcome dum dum!", Toast.LENGTH_LONG).show();
           }
           else {
               Toast.makeText(this, "dum dum!", Toast.LENGTH_LONG).show();
           }
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