package com.lilianbittar.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class Email extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);
//        Button button = findViewById(R.id.send);
//        EditText recipient = findViewById(R.id.recipient);
//        EditText subject = findViewById(R.id.subject);
//        EditText editText = findViewById(R.id.texted);

//        button.setOnClickListener(view -> {
//            Intent intent = new Intent(Intent.ACTION_SEND);
//            intent.setType("text/plain");
//            intent.putExtra(Intent.EXTRA_EMAIL, new String[] {recipient.getText().toString()});
//            intent.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
//            intent.putExtra(Intent.EXTRA_TEXT, editText.getText().toString());
//            startActivity(intent);

//        });

        Intent intent = getIntent();
        String action = intent.getAction();
        Uri uri = intent.getData();
        Log.i("Action", "action: " + action);
        Log.i("type", "data:" + uri);
    }
}
