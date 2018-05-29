package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");

        while(!in.hasNextFloat()) {
            System.out.println("Ошибка ввода, надо вводить числа ");
            in.next();
        }
        float value1 = in.nextFloat();

        while(!in.hasNextFloat()) {
            System.out.println("Ошибка ввода, надо вводить числа ");
            in.next();
        }
        float value2 = in.nextFloat();

        summ(value1, value2);
        diff(value1, value2);
        lcm(value1, value2);
    }

    private static void diff(float a, float b) {
        float difference;
        if (a>b){
            difference = a - b;
        } else {
            difference = b - a;
        }
        System.out.println("Разность чисел равна: " + difference);
    }

    private static void summ(float a, float b) {
        float summ = a + b;
        System.out.println("Сумма равна: " + summ);
    }

    private static void lcm(float a,float b){
        System.out.println("НОК: " + a / gcd(a,b) * b);
    }

    private static float gcd(float a,float b){

        if (b==0){
            System.out.println("НОД " + a);
            return a;
        } else {
            return gcd(b,a % b);
        }
    }
}
