package com.lilianbittar.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = findViewById(R.id.button1);
        Context context = getApplicationContext();
        Class destination = MainActivity2.class;
        EditText ed = findViewById(R.id.editText1);
        Bundle bundle = getIntent().getExtras();

        button.setOnClickListener(view -> {
            Intent intent = new Intent(context, destination);
            intent.putExtra("key", ed.getText().toString());
            startActivity(intent);
        });

        String data = bundle.getString("key");
        TextView tv = findViewById(R.id.text);
        tv.setText(data);

    }
}

