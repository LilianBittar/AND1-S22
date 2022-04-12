package com.lilianbittar.app;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private Repository repository;
    private MutableLiveData<Boolean> loading;

    public MainActivityViewModel(){
        repository = Repository.getInstance();
        loading = new MutableLiveData<>(false);
    }

    public LiveData<List<Note>> getAllNotes(){
        return repository.getAllNotes();
    }

    public void addNote(Note note){
        repository.insert(note);
    }

    public void deleteAllNotes(){
       repository.deleteAllNotes();
    }

    public void addNoteFromWeb(){
        loading.setValue(true);
        repository.addNoteFromWeb(() -> loading.setValue(false));
    }

    public LiveData<Boolean> loading(){
        return loading;
    }
}
