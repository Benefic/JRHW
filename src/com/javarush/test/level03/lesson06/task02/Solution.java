package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
    int a=1,b=2,c=3,d=4,e=5,f=6,g=7,x=8,y=9,z=10;
    String s = " ";
        System.out.println(a+s+b+s+c+s+d+s+e+s+f+s+g+s+x+s+y+s+z);
        System.out.println(b+s+b*b+s+b*c+s+b*d+s+b*e+s+b*f+s+b*g+s+b*x+s+b*y+s+b*z);
        System.out.println(c+s+c*b+s+c*c+s+c*d+s+c*e+s+c*f+s+c*g+s+c*x+s+c*y+s+c*z);
        System.out.println(d+s+d*b+s+d*c+s+d*d+s+d*e+s+d*f+s+d*g+s+d*x+s+d*y+s+d*z);
        System.out.println(e+s+e*b+s+e*c+s+e*d+s+e*e+s+e*f+s+e*g+s+e*x+s+e*y+s+e*z);
        System.out.println(f+s+f*b+s+f*c+s+f*d+s+f*e+s+f*f+s+f*g+s+f*x+s+f*y+s+f*z);
        System.out.println(g+s+g*b+s+g*c+s+g*d+s+g*e+s+g*f+s+g*g+s+g*x+s+g*y+s+g*z);
        System.out.println(x+s+x*b+s+x*c+s+x*d+s+x*e+s+x*f+s+x*g+s+x*x+s+x*y+s+x*z);
        System.out.println(y+s+y*b+s+y*c+s+y*d+s+y*e+s+y*f+s+y*g+s+y*x+s+y*y+s+y*z);
        System.out.println(z+s+z*b+s+z*c+s+z*d+s+z*e+s+z*f+s+z*g+s+z*x+s+z*y+s+z*z);
    }
}