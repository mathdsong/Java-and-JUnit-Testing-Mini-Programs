package test;

import miniPrograms.PowerCalculation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculationTest {
    @ParameterizedTest(name = "{0} ^ {1} = {2}")
    @CsvSource({
            "2, 31, 2147483648",
            "2, 30, 1073741824",
            "2, 10, 1024"
    })

    void power(int base, int exponent, int expected) {
        PowerCalculation pC = new PowerCalculation();
        assertEquals(expected, pC.powerOfAnInteger(base, exponent));
    }
}