/*
 * Copyright (c) 2017 for Oskar Polak
 */

package observer.interfaces;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public interface Publisher {

    void register(Observer o);
    void unregiser(Observer o);
    void notifyObservers();

}
