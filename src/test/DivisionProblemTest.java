package JUnitTests;

import programs.DivisionProblem;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DivisionProblemTest {
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "Infinity, 3.6, NaN",
            "-Infinity, -1.2, NaN",
            "2, 0, NaN",
            "-10, 2, -5.0",
            "-2, -8, 0.25",
            "NaN, 2, NaN"
    })

    void divisionValidation(String dividend, String divisor, Double expectedResult) {
        DivisionProblem divp = new DivisionProblem();
        Double actualResult = divp.divisionProblem(dividend, divisor);
        assertEquals(expectedResult, actualResult);
    }

}