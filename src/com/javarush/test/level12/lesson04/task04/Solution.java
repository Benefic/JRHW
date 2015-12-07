package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int min(int i0, int i1) {
        if (i0 < i1) return i0;
        return i1;
    }

    public static long min(long i0, long i1) {
        if (i0 < i1) return i0;
        return i1;
    }

    public static double min(double i0, double i1) {
        if (i0 < i1) return i0;
        return i1;
    }
}
