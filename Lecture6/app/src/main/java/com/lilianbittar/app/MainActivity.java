package com.lilianbittar.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    protected MainActivityViewModel viewModel;
    TextView textView;
    Button button;
    Button button1;
    Button button2;
    EditText editText;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.add_note);
        button1 = findViewById(R.id.delete_note);
        editText = findViewById(R.id.input);
        button2 = findViewById(R.id.web_button);
        progressBar = findViewById(R.id.progressBar);

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        button.setOnClickListener(view -> { safeNote(); });

        button1.setOnClickListener(view -> { deleteAll(); });

        button2.setOnClickListener(view -> { viewModel.addNoteFromWeb();});

        viewModel.getAllNotes().observe(this, this::putNotesInTextView);
        viewModel.loading().observe(this, this::setProgressbarVisibility);

    }

    private void putNotesInTextView(List<Note> notes){
        if (!notes.isEmpty()){
            textView.setText("");
            for (Note n : notes) {
                textView.append(n.getTitle() + "\n");
            }
        } else {
            textView.setText("Empty");
        }
    }

    private void setProgressbarVisibility(Boolean loading){
        if(loading)
            progressBar.setVisibility(View.VISIBLE);
        else
            progressBar.setVisibility(View.INVISIBLE);
    }

    public void safeNote(){
        viewModel.addNote(new Note(editText.getText().toString()));

    }

    public void deleteAll(){
        viewModel.deleteAllNotes();
    }
}