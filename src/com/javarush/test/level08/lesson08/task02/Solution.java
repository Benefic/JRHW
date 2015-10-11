package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    //    public static void main(String[] args) {
//        HashSet set = createSet();
//        set = removeAllNumbersMoreThan10(set);
//    }
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        Set<Integer> integers = new HashSet<Integer>();

        for (Integer i = 0; i < 20; i++) {
            integers.add(i);
        }
        return (HashSet) integers;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10)
                iterator.remove();
        }
        return set;
    }

}
