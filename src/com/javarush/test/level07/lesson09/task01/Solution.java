package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<Integer> buffer = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++)
        {
            buffer.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> x3 = new ArrayList<Integer>();
        ArrayList<Integer> x2 = new ArrayList<Integer>();
        ArrayList<Integer> x0 = new ArrayList<Integer>();

        for (Integer i : buffer)
        {
            boolean sorted = false;
            if (i%3==0) {
                x3.add(i);
                sorted = true;
            }
            if (i%2==0) {
                x2.add(i);
                sorted = true;
            }

            if (!sorted){
                x0.add(i);
            }
        }

        printList(x3);
        printList(x2);
        printList(x0);
    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for (Integer integer : list)
        {
            System.out.println(integer);
        }
    }
}
