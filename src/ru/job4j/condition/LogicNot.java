package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(int num) {
        return num % 2 == 0;

    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return  num < 0;
    }

    public boolean notEvenAndPositive(int num) {
        return num % 2 == 0 && num > 0;
    }

    public boolean evenOrNotPositive(int num) {
        return num % 2 == 0 && num < 0;
    }
    public static void main(String[] args) {
        int num = -5;
        boolean result = LogicNot.isEven();
        System.out.println(result);


    }
}
