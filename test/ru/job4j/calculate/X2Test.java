package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA10B0C0X1Then40() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */

        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then3() {

        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;

        int expected = 3;

        int rsl1 = X2.calc(a1, b1, c1, x1);

        Assert.assertEquals(expected, rsl1);
    }

    @Test
    public void whenA0B1C1X1Then2() {

        int a2 = 0;
        int b2 = 1;
        int c2 = 1;
        int x2 = 1;

        int expected = 2;

        int rsl2 = X2.calc(a2, b2, c2, x2);

        Assert.assertEquals(expected, rsl2);
    }

    @Test
    public void whenA1B1C0X1Then2() {

        int a3 = 0;
        int b3 = 1;
        int c3 = 1;
        int x3 = 1;

        int expected = 2;

        int rsl3 = X2.calc(a3, b3, c3, x3);

        Assert.assertEquals(expected, rsl3);
    }

    @Test
    public void whenA1B1C1X0Then1() {

        int a4 = 1;
        int b4 = 1;
        int c4 = 1;
        int x4 = 0;

        int expected = 1;

        int rsl4 = X2.calc(a4, b4, c4, x4);

        Assert.assertEquals(expected, rsl4);
    }
}