package com.lilianbittar.app;

import android.os.Looper;
import android.os.Handler;

import androidx.core.os.HandlerCompat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
;

public class NoteWebClient {

    private static NoteWebClient instance;
    ExecutorService executorService = Executors.newFixedThreadPool(1);
    Handler mainThreadHandler = HandlerCompat.createAsync(Looper.getMainLooper());

    public static NoteWebClient getInstance(){
        if (instance == null)
            instance = new NoteWebClient();
        return instance;
    }

    private NoteWebClient() {}

    public void getNote(NoteReceivedListener listener) {
        executorService.execute(() -> {
            Note result = someBackgroundWork();
            mainThreadHandler.post(() -> listener.onNoteReceived(result));
        });
    }

    private Note someBackgroundWork() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new Note("HELLO FROM INTERNET");
    }
}
