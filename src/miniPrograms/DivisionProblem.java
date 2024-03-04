package programs;
import static java.lang.Double.NaN;
public class DivisionProblem {

    public double divisionProblem(String dividend, String divisor) {
        double quotient = NaN;
        double dividend_double = 0;
        double divisor_double = 0;

        try {
            dividend_double = Double.valueOf(dividend);
            divisor_double = Double.valueOf(divisor);
        } catch (NumberFormatException e) {
            throw e;
        }

        if (divisor_double == 0 || Double.isInfinite(dividend_double) || Double.isNaN(dividend_double) || Double.isNaN((divisor_double))) {
            if (divisor_double == 0) {
                System.out.println("Error: Divisor can't be 0.");
            }

            if (Double.isInfinite(dividend_double)) {
                System.out.println("Error: You can't type \"Infinity\" or \"-Infinity\" here.");
            }

            if (Double.isNaN(dividend_double) || Double.isNaN((divisor_double))) {
                System.out.println("Error: You can't type NaN here.");
            }
        } else {
            quotient = dividend_double / divisor_double;
        }

        return quotient;

    }



}
