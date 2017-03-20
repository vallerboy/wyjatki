/*
 * Copyright (c) 2017 for Oskar Polak
 */

package adapter.oldApi;

import java.util.List;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public interface OldInterface {
    void addNote(String note);
    void removeNote(String remove);
    List<String> getAllNotes();
}
