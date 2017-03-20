/*
 * Copyright (c) 2017 for Oskar Polak
 */

package factoryMethod.mobs;

import factoryMethod.Mob;
import factoryMethod.MobType;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class OrkMob extends Mob {

    public OrkMob(){
        this.attack = 5;
        this.mobType = MobType.ORK;
        this.modelName = "OrkModel";
        this.speed = 24;
    }



    @Override
    protected Mob getMob() {
        return this;
    }
}
