package test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import miniPrograms.TwoSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {
    @Test
    public void test1() {
        int a = 3;
        int b = 6;
        int expected = 9;
        assertEquals(expected, TwoSum.sumTwo(a, b));
    }
}

class TwoSumParameterizedTest {
    @ParameterizedTest(name = "[{index}] {0} + {1} = {2}")
    @DisplayName("Add two integers together")
    @CsvSource({
         "0, 1, 1",
         "2, 6, 8",
         "3, 5, 8"
    })

    public void test2(int x, int y, int expected) {
        assertEquals(TwoSum.sumTwo(x, y), expected);
    }

}