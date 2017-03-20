/*
 * Copyright (c) 2017 for Oskar Polak
 */

package adapter;

import adapter.newApi.NewNote;
import adapter.oldApi.OldInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class NoteAdapter implements OldInterface {



    public List<String> noteList;
    public NewNote newNote;


    public NoteAdapter(){
        noteList = new ArrayList<>();
        newNote = new NewNote();
    }

    @Override
    public void addNote(String note) {
       newNote.addNote(note, null);
    }

    @Override
    public void removeNote(String remove) {
        noteList.remove(remove);
    }

    @Override
    public List<String> getAllNotes() {
        return noteList;
    }
}
