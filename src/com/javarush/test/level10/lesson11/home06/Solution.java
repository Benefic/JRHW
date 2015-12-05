package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        public String name;
        public int age;
        public String surname;
        public String work;
        public String adress;
        public boolean relations;

        public Human(String name, int age, String surname, boolean relations) {
            this.name = name;
            this.age = age;
            this.surname = surname;
            this.relations = relations;
        }

        public Human(String name, String surname, boolean relations) {
            this.name = name;
            this.surname = surname;
            this.relations = relations;
        }

        public Human(String name, boolean relations) {

            this.name = name;
            this.relations = relations;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(String name, int age, String surname) {
            this.name = name;
            this.age = age;
            this.surname = surname;
        }

        public Human(String name, int age, String surname, String adress) {
            this.name = name;
            this.age = age;
            this.surname = surname;
            this.adress = adress;
        }

        public Human(String name, int age, String surname, String work, String adress, boolean relations) {
            this.name = name;
            this.age = age;
            this.surname = surname;
            this.work = work;
            this.adress = adress;
            this.relations = relations;
        }

        public Human(String name, boolean relations, String adress, String work, String surname) {
            this.name = name;
            this.relations = relations;
            this.adress = adress;
            this.work = work;
            this.surname = surname;
        }

        public Human(String name, boolean relations, int age) {
            this.name = name;
            this.relations = relations;
            this.age = age;
        }
    }
}
