package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader resder = new BufferedReader(new InputStreamReader(System.in));
        String name = resder.readLine();
        int age = Integer.parseInt(resder.readLine());
        if (age<18)
            System.out.println("Подрасти еще");
    }
}
