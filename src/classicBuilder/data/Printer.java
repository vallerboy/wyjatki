/*
 * Copyright (c) 2017 for Oskar Polak
 */

package classicBuilder.data;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class Printer {
    private  String model;
    private  int pagesPerMinute;
    private Paper paper;


    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPagesPerMinute() {
        return pagesPerMinute;
    }

    public void setPagesPerMinute(int pagesPerMinute) {
        this.pagesPerMinute = pagesPerMinute;
    }


}
