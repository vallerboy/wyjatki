/*
 * Copyright (c) 2017 for Oskar Polak
 */

package factoryMethod;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public interface IMobFactory {
    Mob produceMob(MobType mobType);
    Mob produceMob(MobType mobType, int strenght);
    Mob produceMob(MobType mobType, int strenght, int multiplySpeed);
}
