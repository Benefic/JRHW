package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        HashSet<String> HashSet = new HashSet<String>();
        HashSet.add("арбуз");
        HashSet.add("банан");
        HashSet.add("вишня");
        HashSet.add("груша");
        HashSet.add("дыня");
        HashSet.add("ежевика");
        HashSet.add("жень-шень");
        HashSet.add("земляника");
        HashSet.add("ирис");
        HashSet.add("картофель");
        for (String s : HashSet) {
            System.out.println(s);
        }
    }
}
