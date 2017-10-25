package com.example.alex.kaijuattack;

import com.example.alex.kaijuattack.Army.Jet;
import com.example.alex.kaijuattack.Army.Tank;
import com.example.alex.kaijuattack.City.Building;
import com.example.alex.kaijuattack.City.SkyScraper;
import com.example.alex.kaijuattack.Kaiju.Lizard;
import com.example.alex.kaijuattack.Kaiju.ManBearPig;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 25/10/2017.
 */

public class KaijuAttackTest {

    Lizard lizard1;
    Lizard lizard2;
    ManBearPig bearPig1;
    ManBearPig bearPig2;
    Tank tank1;
    Tank tank2;
    Tank tank3;
    Jet jet1;
    Jet jet2;
    Jet jet3;
    SkyScraper skyscraper1;
    SkyScraper skyscraper2;



    @Before
    public void before(){
        lizard1 = new Lizard("Tokage", 350, 50);
        lizard2 = new Lizard("Marvin", 450, 85);
        bearPig1 = new ManBearPig("Gerry", 250, 45);
        bearPig2 = new ManBearPig("Al'fonz", 250, 30);
        tank1 = new Tank("IronGiant", 250, 80);
        tank2 = new Tank("Tiger", 250, 80);
        tank3 = new Tank("Bunkerbuster", 250, 80);
        jet1 = new Jet("Falcon", 100, 50);
        jet2 = new Jet("Tornado", 100, 75);
        jet3 = new Jet("Spitfire", 100, 50);
        skyscraper1 = new SkyScraper("Livingston Tower", 100, 200);
        skyscraper2 = new SkyScraper("Malstrom Peak", 100, 350);


    }

    @Test
    public void testMonsterName(){
        assertEquals("Tokage", lizard1.getName());
        assertEquals("Gerry", bearPig1.getName());
    }

    @Test
    public void testVehicleName(){
        assertEquals("IronGiant", tank1.getType());
        assertEquals("Falcon", jet1.getType());
    }

    @Test
    public void testMonsterHealthVal(){
        assertEquals(450, lizard2.getHealth());
    }

    @Test
    public void testMonsterAttackVal(){
        assertEquals(45, bearPig1.getAttackValue());
    }

    @Test
    public void testMonsterAttackTank(){
        lizard1.attack(tank1);
        assertEquals(200, tank1.getHealthValue());
    }

    @Test
    public void testMonsterMove(){
        assertEquals("Thump Thump Thump!", lizard1.move());
        assertEquals("Trot Trot Trot!", bearPig1.move());
    }

    @Test
    public void testVehicleAttackArtill(){
        tank1.attackArtillary(lizard1);
        assertEquals(270, lizard1.getHealth());
        jet3.attackArtillary(bearPig2);
        assertEquals(200, bearPig2.getHealth());
    }

    @Test
    public void testVehicleAttackKamak(){
        tank1.attackKamikaze(lizard1);
        assertEquals(100, lizard1.getHealth());
    }

    @Test
    public void testBuildingHealth(){
        assertEquals(100, skyscraper1.getStructureHealth());
    }

//    @Test
//    public void testBuildingOnFire(){
//        skyscraper1.setStructureHealth(25);
//        assertEquals("THIS STUCTURE IS AFLAME!", skyscraper1.onFireCheck());
//    }

    @Test
    public void testMonsterAttackBuilding(){
        bearPig1.attack(skyscraper1);
        assertEquals(55, skyscraper1.getStructureHealth());
    }
}
