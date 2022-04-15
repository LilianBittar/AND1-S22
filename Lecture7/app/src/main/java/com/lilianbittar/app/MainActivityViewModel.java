package com.lilianbittar.app;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private Repository repository;
    private MutableLiveData<Boolean> loading;

    public MainActivityViewModel(Application application){
        super(application);
        repository = Repository.getInstance(application);
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


    public LiveData<Boolean> loading(){
        return loading;
    }
}
