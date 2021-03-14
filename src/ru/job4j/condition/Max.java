package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;

    }

    public static void main(String[] args) {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);

        System.out.println(result);
    }
}
