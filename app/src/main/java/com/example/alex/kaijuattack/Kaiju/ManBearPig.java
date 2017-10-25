package com.example.alex.kaijuattack.Kaiju;

import com.example.alex.kaijuattack.Behaviour.Movers;

/**
 * Created by Alex on 25/10/2017.
 */

public class ManBearPig extends Kaiju implements Movers {

    public ManBearPig(String name, Integer healthValue, Integer attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move(){
        return "Trot Trot Trot!";
    }
}
