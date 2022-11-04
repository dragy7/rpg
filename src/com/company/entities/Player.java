package com.company.entities;

import com.company.items.Food;
import com.company.items.Potion;
import com.company.map.GameLocaliton;

public class Player implements Entity {

    private final  String name = "Tomas Duran";
    private Race race;



    @Override
    public void fight() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void heal(Potion potion) {

    }

    @Override
    public void eat(Food food) {

    }

    @Override
    public void dodge() {

    }

    @Override
    public void escape() {

    }

    @Override
    public void moveTo(GameLocaliton gameLocaliton) {

    }

    @Override
    public void talkTo(Entity entity) {

    }

    @Override
    public void sleep() {

    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}
