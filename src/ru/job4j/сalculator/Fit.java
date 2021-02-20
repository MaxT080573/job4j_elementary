package ru.job4j.сalculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height1) {
        double rsl = (height1 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 174;
        double man;
        short height1 = 172;
        double woman;
        man = Fit.manWeight(height);
        woman = Fit.womanWeight(height1);
        System.out.println("Man 174 is " + man);
        System.out.println("Woman 172 is " + woman);
    }

}
