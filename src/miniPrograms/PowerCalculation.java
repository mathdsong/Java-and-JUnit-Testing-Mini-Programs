package miniPrograms;

import java.math.BigInteger;

public class PowerCalculation {
    public static BigInteger powerOfAnInteger(int base, int exponent) {
        BigInteger bigint_base = BigInteger.valueOf(base);
        return bigint_base.pow(exponent);
    }

}
