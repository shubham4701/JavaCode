package tk.iammohitsharma.challenges.Codewars;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.math.BigInteger;

public class SquareParameterWithFibonacciSides {
    private static BigInteger calculateSideSum(BigInteger sides) {
        BigInteger i = BigInteger.ZERO, j = BigInteger.ONE, sum = BigInteger.ONE, temp;
        for (int k = 1; k <= sides.intValue(); k++) {
            temp = j;
            j = j.add(i);
            i = temp;
            sum = sum.add(j);
        }
        return sum.multiply(new BigInteger("4"));
    }

    public static void main(String[] args) {
        System.out.println("********** Sum of Squares with Fibonacci sides ************\n");
        System.out.println("Sum : " +calculateSideSum(new BigInteger("6")));
    }
}
