/*
 * Copyright (c) 2017 for Oskar Polak
 */

package factoryMethod;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public abstract class Mob {
    protected int attack;
    protected String modelName;
    protected int speed;
    protected  MobType mobType;

    protected abstract Mob getMob();
    public void attack(){ }
    public void defense() { }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public MobType getMobType() {
        return mobType;
    }

    public void setMobType(MobType mobType) {
        this.mobType = mobType;
    }
}
