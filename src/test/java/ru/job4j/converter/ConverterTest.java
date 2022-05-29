package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert240RblThen4Dollar() {
        float rb = 240;
        float expectation = 4;
        float out2 = Converter.rubleToDollar(rb);
        float eps = 0.0001f;
        Assert.assertEquals(expectation, out2, eps);
    }
}