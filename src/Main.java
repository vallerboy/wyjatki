import fluentBuilder.NewCat;

/**
 * Created by OskarPraca on 2017-03-18.
 */
public class Main {
    public static void main(String[] args) {

        // Implementacja FluentBuilder

        NewCat newCat = new NewCat.Builder("Filek")
                .setAge(5)
                .setColor("pink")
                .build();


       System.out.println(newCat.getName());

       // Implementacja ClassicBuilder

//        PrinterBuilder hp = new HPDeskJetBuilder();
//        PrinterDirector director = new PrinterDirector(hp);
//
//        director.makePrinter();
//        Printer deskJet = director.getPrinter();

        // Implementacja Observera

//        SomeClient someClient1  = new SomeClient("Oskar");
//        SomeClient someClient2  = new SomeClient("Wojtek");
//
//        Company company = new Company();
//        company.register(someClient1);
//        company.register(someClient2);
//
//        company.addSomeNews();


        // Implementacja metody wytwórczej

//        IMobFactory factory = new MobFactory();
//        Mob mob =  factory.produceMob(MobType.ORK);
//        mob.attack();
//
        // Implementacja adaptera


        // tutaj zamieniamy z starego Note na uniwerslany NoteAdapter;
//        NoteAdapter note = new NoteAdapter();
//        note.addNote("Dziś jest piękny dzień, zajmujemy się wzorcami :)");
//        note.addNote("Odebrać dzieciaka z przedszkola!");
//
//        // wydrukuj wszystiie notatki
//
//        for(String s : note.getAllNotes()){
//            System.out.println(s);
//        }






    }
}
