package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human gf1 = new Human("Grand 1",true,55);
        Human gf2 = new Human("Grand 2",true,65);
        Human gm1 = new Human("Grany 1",false,50);
        Human gm2 = new Human("Grany 2",false,60);
        Human father = new Human("Father",true,30);
        Human mother = new Human("Mother",false,28);
        Human child1 = new Human("First",true,8);
        Human child2 = new Human("Second",false,6);
        Human child3 = new Human("Third",false,5);
        ArrayList<Human> family = new ArrayList<Human>();

        family.add(gf1);
        family.add(gf2);
        family.add(gm1);
        family.add(gm2);
        family.add(father);
        family.add(mother);
        family.add(child1);
        family.add(child2);
        family.add(child3);

        for (Human human : family)
        {
            System.out.println(human);
        }
    }

    public static class Human
    {
        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father, mother;
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
