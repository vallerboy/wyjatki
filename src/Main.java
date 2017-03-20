import observer.Subscriber;
import observer.YTCanal;

/**
 * Created by OskarPraca on 2017-03-18.
 */
public class Main {
    public static void main(String[] args) {

        // Implementacja FluentBuilder

//        NewCat newCat = new NewCat.Builder("Filek")
//                .setAge(5)
//                .setColor("pink")
//                .build();
//
//        newCat.setOwner("Oskar");
//
//
//       System.out.println(newCat.getName());

       // Implementacja ClassicBuilder

//        PrinterBuilder hp = new HPDeskJetBuilder();
//        PrinterDirector director = new PrinterDirector(hp);
//        director.makePrinter();
//        Printer deskJet = director.getPrinter();
//
//
//        PrinterBuilder brother = new Brother();
//        PrinterDirector director1 = new PrinterDirector(brother);
//        director1.makePrinter();
//        Printer brotherPrinter = director1.getPrinter();
//        System.out.println(brotherPrinter.getPaper().getColor());

        // Implementacja Observera

        Subscriber subscriber1 = new Subscriber("Oskar");
        YTCanal ytCanal = new YTCanal();
        ytCanal.register(subscriber1);
        ytCanal.publishFilm();
        Subscriber subscriber2 = new Subscriber("Wojtek");
        ytCanal.register(subscriber2);
        Subscriber subscriber3 = new Subscriber("Krystian");
        ytCanal.register(subscriber3);
        ytCanal.publishFilm();

        System.out.println("Ilość filmów do obejrzenia: " + subscriber1.getNewFilms());
        System.out.println("Ilość filmów do obejrzenia: " + subscriber3.getNewFilms());



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
