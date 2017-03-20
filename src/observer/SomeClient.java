/*
 * Copyright (c) 2017 for Oskar Polak
 */

package observer;

import observer.interfaces.Observer;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class SomeClient implements Observer {

    private String name;


    public SomeClient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void update() {
        System.out.println("Hej " + name + "! Firma wrzuciła jakieś nowe newsy!");
    }
}
