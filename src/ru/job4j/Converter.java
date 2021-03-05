package ru.job4j;

public class Converter {

    public static int rubleToPound(int value) {
        return value / 100;
    }

    public static int rubleToEuro(int value) {
        return value / 90;

    }

    public static int rubleToDollar(int value) {
        return value / 75;

    }

    public static void main(String[] args) {
        int pound = Converter.rubleToPound(500);
        int euro = Converter.rubleToEuro(270);
        int dollar = Converter.rubleToDollar(150);
        int in = 500;
        int expected = 5;
        int out = Converter.rubleToPound(in);
        boolean passed = expected == out;
        int in1 = 270;
        int expected1 = 3;
        int out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected == out;
        int in2 = 150;
        int expected2 = 2;
        int out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected == out;
        System.out.println("500 rubles are " + pound + " pound.");
        System.out.println("270 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");

        System.out.println("500 rubles are 5 pound. Test result : " + passed);
        System.out.println("270 rubles are 3 euro. Test result : " + passed1);
        System.out.println("150 rubles are 2 dollar. Test result : " + passed2);

    }
}
