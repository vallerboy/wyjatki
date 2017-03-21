/*
 * Copyright (c) 2017 for Oskar Polak
 */

package factoryMethod1;

/**
 * Created by OskarPraca on 2017-03-21.
 */
public abstract class Chocolate {
    protected boolean isSweety;
    protected String teasty;
    protected String color;


    public boolean isSweety() {
        return isSweety;
    }

    public String getTeasty() {
        return teasty;
    }

    public String getColor() {
        return color;
    }
}
