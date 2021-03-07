package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.Converter;

public class ConverterTest {

    @Test
    public void whenConvert500RblThen5Pound() {
        int in = 500;
        int expected = 5;
        int out = Converter.rubleToPound(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert270RblThen3Euro() {
        int in = 270;
        int expected = 3;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert150RblThen2Dollar() {
        int in = 150;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}
