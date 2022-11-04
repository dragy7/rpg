package com.company.entities;

import com.company.items.Food;
import com.company.items.Potion;
import com.company.map.GameLocaliton;

public interface Entity {
    void fight();
    void defend();
    void heal(Potion potion);
    void eat(Food food);
    void dodge();
    void escape();
    void moveTo(GameLocaliton gameLocaliton);
    void talkTo(Entity entity);
    void sleep();
}
