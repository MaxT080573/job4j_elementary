package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 90;
           }

    public static int rubleToDollar(int value) {
        return value / 75;
            }

    public static int rubleToPound(int value) {
        return value / 100;
            }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(270);
        int dollar = Converter.rubleToDollar(150);
        int pound = Converter.rubleToPound(500);
        System.out.println("500 rubles are " + pound + " pound.");
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
    }
}
