package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    private String name;
    private int height;
    private String color;


    public Dog(String name, int height, String color)
    {
        this.height = height;
        this.color = color;
        this.name = name;
    }


    public Dog(String name)
    {
        this.name = name;
        this.height = 10;
        this.color = "Default";
    }

    public Dog(String name, int height)
    {
        this.height = height;
        this.color = "Default";
        this.name = name;
    }
}
