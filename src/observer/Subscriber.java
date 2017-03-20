/*
 * Copyright (c) 2017 for Oskar Polak
 */

package observer;

import observer.interfaces.Observer;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class Subscriber implements Observer {

    private int newFilms;
    private String username;

    public Subscriber(String username) {
        this.newFilms = 0;
        this.username = username;
    }

    public int getNewFilms() {
        return newFilms;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public void update() {
        newFilms ++;
        System.out.println("Witaj, " + username + ". Kanał AkademiaKodu wrzucił nowy film. Koniecznie sprawdź.");
    }
}
