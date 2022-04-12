package com.lilianbittar.app;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class Dao {

    private MutableLiveData<List<Note>> allNotes;
    private static Dao instance;

    private Dao(){
        allNotes = new MutableLiveData<>();
        List<Note> newList = new ArrayList<>();
        allNotes.setValue(newList);
    }

    public static Dao getInstance(){
        if (instance == null)
            instance = new Dao();

        return instance;
    }

    public LiveData<List<Note>> getAllNotes(){
        return allNotes;
    }


    public void insert(Note note){
        List<Note> currentNodes = allNotes.getValue();
        currentNodes.add(note);
        allNotes.setValue(currentNodes);
    }

    public void deleteAllNotes() {
        List<Note> newList = new ArrayList<>();
        allNotes.setValue(newList);
    }
}
