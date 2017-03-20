/*
 * Copyright (c) 2017 for Oskar Polak
 */

package classicBuilder;

import classicBuilder.data.Paper;
import classicBuilder.data.Printer;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class Brother implements PrinterBuilder {

    private Printer printer;

    public Brother() {
        printer = new Printer();
    }

    @Override
    public void buildPaper() {
        Paper paper = new Paper();
        paper.setColor("green");
        paper.setCount(250);
        paper.setFormat("A5");
        printer.setPaper(paper);
    }

    @Override
    public void buildPrinter() {
         printer.setModel("Brother g4");
         printer.setPagesPerMinute(15);
    }

    @Override
    public Printer getPrinter() {
        return printer;
    }
}
