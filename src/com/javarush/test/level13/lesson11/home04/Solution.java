package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        String file = reader.readLine();
        String string;
        //strings.add(file);
        while (true) {
            string = reader.readLine();
            if (string.equals("exit")) {
                strings.add(string);
                break;
            }
            strings.add(string);
        }
        FileWriter writer = new FileWriter(file);

        for (String s : strings) {
            writer.write(s + System.lineSeparator());
        }

        reader.close();
        writer.close();
    }
}
