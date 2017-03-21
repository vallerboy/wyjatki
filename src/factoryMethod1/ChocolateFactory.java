/*
 * Copyright (c) 2017 for Oskar Polak
 */

package factoryMethod1;

/**
 * Created by OskarPraca on 2017-03-21.
 */
public class ChocolateFactory implements IChocolateFactory {
    @Override
    public Chocolate produceChocolate(ChocolateType type) {

        switch (type) {
            case DARK: return new DarkChocolate();
            case MILK: return new MilkChocolate();
            case SOUR: return new SourChocolate();
            case WHITE: return new WhiteChocolate();
        }

        return null;
    }
}
