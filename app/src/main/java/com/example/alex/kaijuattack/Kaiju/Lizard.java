package com.example.alex.kaijuattack.Kaiju;

import com.example.alex.kaijuattack.Behaviour.Movers;
import com.example.alex.kaijuattack.Kaiju.Kaiju;

/**
 * Created by Alex on 25/10/2017.
 */

public class Lizard extends Kaiju implements Movers {

    public Lizard(String name, Integer healthValue, Integer attackValue){
        super(name, healthValue, attackValue);
    }

    public String move(){
        return "Thump Thump Thump!";
    }
}
