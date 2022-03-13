package com.lilianbittar.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class ExternalizingResources extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.externalizing_reaources);

        Button b = findViewById(R.id.button);
        TextView t1 = findViewById(R.id.textView);
        TextView t2 = findViewById(R.id.textView2);
        b.setOnClickListener(view -> {
            t1.setText(R.string.Reshee);
        });
    }
}
