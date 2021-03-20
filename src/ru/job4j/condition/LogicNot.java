package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;

    }

    public static boolean isPositive(int num) {

        return num > 0;
    }

    public static boolean notEven(int num) {

        return !isEven(num);
    }

    public static boolean notPositive(int num) {

        return  num < 0;
    }

    public static boolean notEvenAndPositive(int num) {

        return num % 2 == 0 && num > 0;
    }

    public static boolean evenOrNotPositive(int num) {

        return num % 2 == 0 && num < 0;
    }

    public static void main(String[] args) {
        int num = -5;
        boolean result  = LogicNot.isEven(num);
        boolean result1  = LogicNot.isPositive(num);
        boolean result2  = LogicNot.notEven(num);
        boolean result3  = LogicNot.notPositive(num);
        boolean result4  = LogicNot.notEvenAndPositive(num);
        boolean result5  = LogicNot.evenOrNotPositive(num);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }

}
