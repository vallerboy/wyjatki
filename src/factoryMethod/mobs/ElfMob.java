/*
 * Copyright (c) 2017 for Oskar Polak
 */

package factoryMethod.mobs;

import factoryMethod.Mob;
import factoryMethod.MobType;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class ElfMob extends Mob {

    public ElfMob() {
            this.attack = 2;
            this.mobType = MobType.ELF;
            this.modelName = "ElfModel";
            this.speed = 10;
    }


    @Override
    public void attack() {
        System.out.println("ATAKUJE!");
    }

    @Override
    protected Mob getMob() {
        return this;
    }
}
