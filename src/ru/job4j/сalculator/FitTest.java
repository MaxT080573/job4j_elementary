package ru.job4j.сalculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

        @Test
        public void whenMan187Then92() {
            short in = 187;
            double expected = 100.05;
            double out = Fit.manWeight(in);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void woman177Weight77() {
            short in = 177;
            double expected = 77.05;
            double out = Fit.womanWeight(in);
            Assert.assertEquals(expected, out, 0.01);
        }
}

