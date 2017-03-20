/*
 * Copyright (c) 2017 for Oskar Polak
 */

package adapter.newApi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class NewNote implements NewInterface {

    public List<String> noteList;

    public NewNote(){
        noteList = new ArrayList<>();
    }

    @Override
    public void addNote(String note, String toWho) {
       noteList.add(note + " || " + toWho);
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
