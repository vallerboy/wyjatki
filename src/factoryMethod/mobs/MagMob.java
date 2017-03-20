/*
 * Copyright (c) 2017 for Oskar Polak
 */

package factoryMethod.mobs;

import factoryMethod.Mob;
import factoryMethod.MobType;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class MagMob extends Mob {


    public MagMob() {
        this.attack = 30;
        this.mobType = MobType.MAG;
        this.modelName = "MagMob";
        this.speed = 25;
    }


    @Override
    protected Mob getMob() {
        return this;
    }
}
