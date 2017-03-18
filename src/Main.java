import java.io.IOException;

/**
 * Created by OskarPraca on 2017-03-18.
 */
public class Main {
    public static void main(String[] args) {


        // Exception - musimy przechwytywać! NP. IOException
        // RuntimeException - nie musimy przechwytywać! NP. ArrayIndexOutOfBoundsException, NullPointerException


      divide(5,0);

    }

    public static void divide(int a, int b){
        if(b == 0) {
          throw new DivideByZeroException("Nie moge dzielic przez 0");
        }
    }
}
