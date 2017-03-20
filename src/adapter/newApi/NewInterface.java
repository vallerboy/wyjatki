/*
 * Copyright (c) 2017 for Oskar Polak
 */

package adapter.newApi;

import java.util.List;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public interface NewInterface {
    void addNote(String note, String toWho);
    void removeNote(String remove);
    List<String> getAllNotes();
}
