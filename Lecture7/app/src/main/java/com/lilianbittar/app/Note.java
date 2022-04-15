package com.lilianbittar.app;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")

public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;



    public Note(String title)
    {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
