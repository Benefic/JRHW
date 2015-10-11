package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    private String name;
    private int weigt;
    private int age;
    private String color;
    private String adress;

    public void initialize(int weigt, String color, String adress)
    {
        this.weigt = weigt;
        this.color = color;
        this.adress = adress;
        this.name = null;
        this.age = 5;
    }

    public void initialize(int weigt, String color)
    {
        this.weigt = weigt;
        this.color = color;
        this.age = 5;
        this.adress = null;
        this.name = null;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.adress = null;
        this.weigt = 10;
        this.color = "Default";
    }

    public void initialize(String name, int weigt, int age)
    {
        this.name = name;
        this.weigt = weigt;
        this.age = age;
        this.adress = null;
        this.color = "Default";
    }

    public void initialize(String name)
    {
        this.name = name;
        this.weigt = 10;
        this.age = 5;
        this.adress = null;
        this.color = "Default";
    }
}
