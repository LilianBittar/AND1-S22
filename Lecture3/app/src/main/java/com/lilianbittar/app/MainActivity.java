package com.lilianbittar.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Context context = getApplicationContext();
        Class destination = MainActivity2.class;
        EditText ed = findViewById(R.id.editText);
        TextView tv = findViewById(R.id.textView1);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null && bundle.containsKey("key")) {
            String data = bundle.getString("key");
            tv.setText(data);
        }

        button.setOnClickListener(view -> {
            Intent intent = new Intent(context, destination);
            intent.putExtra("key", ed.getText().toString());
            startActivity(intent);
        });
    }
}