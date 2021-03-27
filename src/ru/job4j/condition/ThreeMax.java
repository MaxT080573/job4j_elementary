package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second && third < second) {
            result = second;
        }
        if (third > first || third > second) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int first = 10;
        int second = 50;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        System.out.println(result);
    }

}
