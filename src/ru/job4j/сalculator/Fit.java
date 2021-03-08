package ru.job4j.сalculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height1) {
        return (height1 - 110) * 1.15;

    }

    public static void main(String[] args) {
        short height = 187;
        double man;
        short height1 = 177;
        double woman;
        man = Fit.manWeight(height);
        woman = Fit.womanWeight(height1);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 177 is " + woman);
    }

}
