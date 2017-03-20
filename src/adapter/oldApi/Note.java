/*
 * Copyright (c) 2017 for Oskar Polak
 */

package adapter.oldApi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class Note implements OldInterface{

    public List<String> noteList;

    public Note(){
        noteList = new ArrayList<>();
    }

    @Override
    public void addNote(String note) {
        noteList.add(note);
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
