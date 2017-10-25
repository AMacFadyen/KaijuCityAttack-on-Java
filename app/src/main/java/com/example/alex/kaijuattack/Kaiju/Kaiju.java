package com.example.alex.kaijuattack.Kaiju;

import com.example.alex.kaijuattack.Army.Tank;
import com.example.alex.kaijuattack.Army.Vehicle;
import com.example.alex.kaijuattack.City.Building;

import static android.R.attr.type;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by Alex on 25/10/2017.
 */

public abstract class Kaiju {

    private String name;
    public int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String roar(){
        return "Raaaaarrr!!!";
    }

    public int getHealth() {
        return healthValue;
    }

    public void setHealth(Integer healthValue) {
        this.healthValue = healthValue;
    }

    public String getName() {
        return name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void attack(Vehicle vehicle){
        vehicle.healthValue -= this.attackValue;
    }

    public void attack(Building building){
        building.structureHealth -= this.attackValue;
    }


}
