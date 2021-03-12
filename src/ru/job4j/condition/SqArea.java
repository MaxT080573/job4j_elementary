package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));
        int l = h * k;
        return l * h;

    }

        public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        double result2 = SqArea.square(12, 2);
        double result3 = SqArea.square(18, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        System.out.println(" p = 12, k = 2, s = 8, real = " + result2);
        System.out.println(" p = 18, k = 2, s = 18, real = " + result3);
    }
}
