package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int min,mid,max;
        if (a>b&&a>c)
            max = a;
        else if (c>b&&c>a)
            max = c;
        else
            max = b;

        if (a<b&&a<c)
            min = a;
        else if (c<b&&c<a)
            min = c;
        else
            min = b;

        if ((a==min&&b==max)||(b==min&&a==max))
            mid = c;
        else if ((c==min&&b==max)||(b==min&&c==max))
            mid = a;
        else
            mid = b;


        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }
}
