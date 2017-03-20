/*
 * Copyright (c) 2017 for Oskar Polak
 */

package factoryMethod;

import factoryMethod.mobs.ElfMob;
import factoryMethod.mobs.MagMob;
import factoryMethod.mobs.OrkMob;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class MobFactory implements IMobFactory{

    @Override
    public Mob produceMob(MobType mobType) {
        switch(mobType) {
            case ORK:
                return new OrkMob();
            case ELF:
                return new ElfMob();
            case MAG:
                return new MagMob();
        }
        return  null;
    }
}
