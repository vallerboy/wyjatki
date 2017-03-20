package classicBuilder;

import classicBuilder.data.Paper;
import classicBuilder.data.Printer;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class HPDeskJetBuilder implements PrinterBuilder {

    private Printer printer;

    public HPDeskJetBuilder() {
       printer = new Printer();
    }

    @Override
    public void buildPaper() {
         Paper paper = new Paper();
         paper.setColor("white");
         paper.setCount(200);
         paper.setFormat("A4");

         printer.setPaper(paper);
    }

    @Override
    public void buildPrinter() {
         printer.setModel("HP");
         printer.setPagesPerMinute(5);

    }

    @Override
    public Printer getPrinter() {
        return printer;
    }
}
