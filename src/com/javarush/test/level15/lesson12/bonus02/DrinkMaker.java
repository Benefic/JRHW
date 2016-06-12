package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Benefuc on 12.06.2016.
 */
public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
