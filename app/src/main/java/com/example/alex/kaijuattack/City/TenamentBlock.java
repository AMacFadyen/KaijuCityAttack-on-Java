package com.example.alex.kaijuattack.City;

/**
 * Created by Alex on 26/10/2017.
 */

public class TenamentBlock extends Building {

    private int headCount;

    public TenamentBlock(String name, int structureHealth, int headCount) {
        super(name, structureHealth);
        this.headCount = headCount;
    }

    public int getHeadCount() {
        return headCount;
    }
}
