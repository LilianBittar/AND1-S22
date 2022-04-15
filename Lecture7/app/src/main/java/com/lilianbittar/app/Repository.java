package com.lilianbittar.app;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Repository {
    private NoteDao dao;
    private static Repository instance;
    private LiveData<List<Note>> allNotes;
    private ExecutorService executorService;


    private Repository(Application application){
        NoteDatabase database = NoteDatabase.getInstance(application);
        dao = database.noteDao();
        allNotes = dao.getAllNotes();
        executorService = Executors.newFixedThreadPool(2);
    }



    public static synchronized Repository getInstance(Application application){
        if(instance == null)
            instance = new Repository(application);

        return  instance;

    }

    public LiveData<List<Note>> getAllNotes(){
        return allNotes;
    }

    public void insert(Note note){
        executorService.execute(() -> dao.insert(note));
    }

    public void deleteAllNotes(){
        executorService.execute(dao ::deleteAllNotes);
    }


}

