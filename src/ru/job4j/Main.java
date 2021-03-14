package ru.job4j;

public class Main {
    public static void main(String[] args) {
        int in = 500;
        int expected = 5;
        int out = Converter.rubleToPound(in);
        boolean passed = expected == out;
        System.out.println("500 rubles are 5 pound. Test result : " + passed);
        System.out.println("270 rubles are 3 euro. Test result : " + passed);
        System.out.println("150 rubles are 2 dollar. Test result : " + passed);
    }

}
