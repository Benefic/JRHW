package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Child1", true, 5);
        Human child2 = new Human("Child2", false, 4);
        Human child3 = new Human("Child3", true, 3);
        Human mother = new Human("mother", false, 30);
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);
        Human father = new Human("father", true, 35);
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        Human gMother1 = new Human("gMother1", false, 60);
        Human gMother2 = new Human("gMother2", false, 65);
        Human gFather1 = new Human("gFather1", true, 65);
        Human gFather2 = new Human("gFather2", true, 70);

        gMother1.children.add(mother);
        gMother2.children.add(father);
        gFather1.children.add(mother);
        gFather2.children.add(father);

        System.out.println(gFather1);
        System.out.println(gFather2);
        System.out.println(gMother1);
        System.out.println(gMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }


}
