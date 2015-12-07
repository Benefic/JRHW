package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int max(int i0, int i1) {
        if (i0 > i1) return i0;
        return i1;
    }

    public static long max(long i0, long i1) {
        if (i0 > i1) return i0;
        return i1;
    }

    public static double max(double i0, double i1) {
        if (i0 > i1) return i0;
        return i1;
    }
}
