package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax5To3Then3() {
        int left = 5;
        int right = 3;
        int expected = 5;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax7To10Then10() {
        int left = 7;
        int right = 10;
        int expected = 10;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax15To15Then15() {
        int left = 15;
        int right = 15;
        int expected = 15;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }
}