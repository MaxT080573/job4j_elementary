package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

        public class PointTest {
            @Test
            public void when73to20then5() {
                int expected = 6;
                int x1 = 7;
                int y1 = 0;
                int x2 = 2;
                int y2 = 3;
                double out = Point.distance(x1, y1, x2, y2);
                Assert.assertEquals(expected, out, 0.2);
            }

            @Test
            public void when22to43then5() {
                int expected = 2;
                int x1 = 2;
                int y1 = 2;
                int x2 = 4;
                int y2 = 3;
                double out = Point.distance(x1, y1, x2, y2);
                Assert.assertEquals(expected, out, 0.3);
            }

            @Test
            public void when21to19then5() {
                int expected = 8;
                int x1 = 2;
                int y1 = 1;
                int x2 = 1;
                int y2 = 9;
                double out = Point.distance(x1, y1, x2, y2);
                Assert.assertEquals(expected, out, 0.07);
            }
}
