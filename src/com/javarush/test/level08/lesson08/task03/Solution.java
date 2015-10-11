package com.javarush.test.level08.lesson08.task03;

import com.javarush.test.level06.lesson08.task05.StringHelper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Jackson","Mark");
        map.put("Jackson1","Ben");
        map.put("Jackson2","John");
        map.put("Jackson3","Bob");
        map.put("Whilson","Mark");
        map.put("Whilson1","Ben");
        map.put("Whilson2","John");
        map.put("Whilson3","Bob");
        map.put("Statcham","John");
        map.put("Statcham1","Mark");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        int count = 0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals(familiya)) {
                count++;
            }
        }
        return count;

    }
}
