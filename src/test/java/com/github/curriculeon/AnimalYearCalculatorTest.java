package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class AnimalYearCalculatorTest {
    // given
    private void test(Integer humanYears, Integer[] expected) {
        AnimalYearCalculator animalYearCalculator = new AnimalYearCalculator();

        // when
        Integer[] actual = animalYearCalculator.calculate(humanYears);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void one() {
        test(1, new Integer[]{1, 15, 15});
    }

    @Test
    public void two() {
        test(2, new Integer[]{2, 24, 24});
    }

    @Test
    public void ten() {
        test(10, new Integer[]{10, 56, 64});
    }
}
