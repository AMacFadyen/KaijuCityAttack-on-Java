package com.example.alex.kaijuattack.City;

import com.example.alex.kaijuattack.Behaviour.BuildingBehaviours;

/**
 * Created by Alex on 25/10/2017.
 */

public abstract class Building implements BuildingBehaviours {

    private String name;
    public int structureHealth;


    public Building(String name, int structureHealth){
        this.name = name;
        this.structureHealth = structureHealth;
    }

    public String getName() {
        return name;
    }

    public int getStructureHealth() {
        return structureHealth;
    }

    public void setStructureHealth(int structureHealth) {
        this.structureHealth = structureHealth;
    }

    public String onFireCheck(){
        if(this.structureHealth<((this.structureHealth)/2)){
            return "THIS STUCTURE IS AFLAME!";
        }
        return "nope, no fire here....yet";
    }
}
