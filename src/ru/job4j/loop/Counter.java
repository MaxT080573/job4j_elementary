package ru.job4j.loop;

public class Counter {

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int index = 0; index <= 10; index++) {
            if (index % 2 == 0) {
                sum = sum + index;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumByEven(0, 10));

    }

}
