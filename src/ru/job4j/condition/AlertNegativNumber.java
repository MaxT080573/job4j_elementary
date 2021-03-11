package ru.job4j.condition;

public class AlertNegativNumber {
    public static void main(String[] args) {
        possibleDiv(-4);
        possibleDiv(0);
    }

    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
