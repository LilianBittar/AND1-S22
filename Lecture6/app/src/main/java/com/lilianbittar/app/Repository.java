package com.lilianbittar.app;

import androidx.lifecycle.LiveData;

import java.util.List;

public class Repository {
    private Dao dao;
    private static Repository instance;
    private NoteWebClient noteWebClient;


    private Repository(){
        dao = dao.getInstance();
        noteWebClient = NoteWebClient.getInstance();
    }



    public static Repository getInstance(){
        if(instance == null)
            instance = new Repository();

        return  instance;

    }

    public LiveData<List<Note>> getAllNotes(){
        return dao.getAllNotes();
    }

    public void insert(Note note){
        dao.insert(note);
    }

    public void deleteAllNotes(){
        dao.deleteAllNotes();
    }

    public void addNoteFromWeb(Callback callback){
        noteWebClient.getNote(note -> {
            insert(note);
            callback.call();
        });
    }
}

