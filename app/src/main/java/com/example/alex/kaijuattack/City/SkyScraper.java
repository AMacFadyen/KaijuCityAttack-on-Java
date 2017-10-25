package com.example.alex.kaijuattack.City;

import com.example.alex.kaijuattack.Behaviour.BuildingBehaviours;

/**
 * Created by Alex on 25/10/2017.
 */

public class SkyScraper extends Building{

    int height;

    public SkyScraper(String name, int structureHealth, int height){
        super(name, structureHealth);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }


}
