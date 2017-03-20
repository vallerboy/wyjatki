/*
 * Copyright (c) 2017 for Oskar Polak
 */

package observer;

import observer.interfaces.Observer;
import observer.interfaces.Publisher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class YTCanal implements Publisher {

    private List<Observer> observers;

    public YTCanal() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregiser(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
       for(Observer o : observers){
           o.update();
       }
    }

    public void publishFilm(){
        System.out.println("Dodałeś nowy film!");
        notifyObservers();
    }
}
