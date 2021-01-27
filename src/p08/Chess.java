package p08;

import java.math.BigInteger;

public class Chess {
    public static void main(String[] args) {

        int s = 1;
        BigInteger big = BigInteger.ONE;
        for (int i = 1; i <= 64; i++) {
            System.out.println(i + " = " + s + ", " + big);
            s *= 2;
            big = big.multiply(BigInteger.TWO);
        }
        // 00..00001 = 1
        // 00..00010 = 2
        // 00..00011 = 3
        // 00..00100 = 4
        // 00..01000 = 8
        // 00..10000 = 16
        // 010..0000 = 1073741824 (2^30)
        // 100..0000 = -2147483648
        // 000..0000 = 0
    }
}
