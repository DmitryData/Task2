package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите два числа: " + "\n");

        while(!in.hasNextLong()) {
            System.out.println("Ошибка ввода, надо вводить числа ");
            in.next();
        }

        long value1 = in.nextLong();

        while(!in.hasNextLong()) {
            System.out.println("Ошибка ввода, надо вводить числа ");
            in.next();
        }

        long value2 = in.nextLong();

        summ(value1, value2);
        diff(value1, value2);
        lcm(value1, value2);
    }

    private static void diff(long a, long b) {
        long difference = a - a;
        System.out.println("Разность чисел равна: " + difference);
    }

    private static void summ(long a, long b) {
        long summ = a + b;
        System.out.println("Сумма равна: " + summ);
    }

    private static void lcm(long a,long b){
        System.out.println("НОК: " + a / gcd(a,b) * b);
    }

    private static long gcd(long a,long b){

        if (b==0){
            System.out.println("НОД " + a);
            return a;
        } else {
            return gcd(b,a % b);
        }
    }


}
