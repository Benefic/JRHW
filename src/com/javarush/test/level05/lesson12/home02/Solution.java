package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man1 = new Man("Alex","Moscow",25);
        Man man2 = new Man("Bob","N.Y.C",22);
        Woman woman1 = new Woman("Xela","L.A.",20);
        Woman woman2 = new Woman("Bob","Sochi",19);
        //выведи их на экран тут
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
    }

    public static class Man{
        private String name, address;
        private int age;

        public Man(String name, String address, int age)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman{
        private String name, address;
        private int age;

        public Woman(String name, String address, int age)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString()
        {
            return name + " " + age + " " + address;
        }

    }


    //добавьте тут ваши классы
}
