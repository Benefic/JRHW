package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner fileInputStream = new Scanner(new FileInputStream(reader.readLine()));
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        while (fileInputStream.hasNext()) {
            int tmp = fileInputStream.nextInt();
            if (tmp % 2 == 0) {
                integerArrayList.add(tmp);
            }
        }
        fileInputStream.close();

        Collections.sort(integerArrayList);
        for (Integer integer : integerArrayList) {
            System.out.println(integer);
        }
    }
}
