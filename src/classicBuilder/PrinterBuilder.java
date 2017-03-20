package classicBuilder;

import classicBuilder.data.Printer;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public interface PrinterBuilder {
    public void buildPaper();
    public void buildPrinter();
    public Printer getPrinter();
}
