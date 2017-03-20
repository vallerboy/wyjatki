/*
 * Copyright (c) 2017 for Oskar Polak
 */

package classicBuilder;

import classicBuilder.data.Printer;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class PrinterDirector {
    private PrinterBuilder printerBuilder;

    public PrinterDirector(PrinterBuilder printerBuilder) {

        this.printerBuilder = printerBuilder;
    }

    public void makePrinter() {
        printerBuilder.buildPaper();
        printerBuilder.buildPrinter();
    }

    public Printer getPrinter() {
        return printerBuilder.getPrinter();
    }
}
