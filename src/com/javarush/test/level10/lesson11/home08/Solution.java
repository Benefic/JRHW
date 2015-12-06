package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] all = new ArrayList[2];
        ArrayList<String> arrayList0 = new ArrayList<String>();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("String1");
        arrayList.add("String2");
        arrayList0.add("String3");
        arrayList0.add("String4");
        all[0] = arrayList;
        all[1] = arrayList0;
        return all;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}