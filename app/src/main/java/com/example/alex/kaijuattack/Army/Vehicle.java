package com.example.alex.kaijuattack.Army;

import com.example.alex.kaijuattack.Behaviour.VehicleAttacks;
import com.example.alex.kaijuattack.Kaiju.Kaiju;

/**
 * Created by Alex on 25/10/2017.
 */

public abstract class Vehicle implements VehicleAttacks {

    private String type;
    public Integer healthValue;
    private Integer attackValue;

    public Vehicle(String type, int healthValue, int attackValue){
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setHealthValue(Integer healthValue) {
        this.healthValue = healthValue;
    }

    public void attackArtillary(Kaiju kaiju){
        kaiju.healthValue -= this.attackValue;
    }

    public void attackKamikaze(Kaiju kaiju){
        kaiju.healthValue -= this.healthValue;
    }
}
