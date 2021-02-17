package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value/70;
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value/60;
        return rsl;
    }
    public static int rubleToPound(int value) {
        int rsl = value/100;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        int pound = Converter.rubleToPound(500);
        System.out.println("500 rubles are " + pound + " pound.");
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
    }
}
