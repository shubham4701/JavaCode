
import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;

class SamplePrograms {

    public static void main(String[] args) {
        System.out.println(zeros(10));
    }

    public static int zeros(int n) {
        // your beatiful code here
        int counter = 0;
        BigInteger factorial = factorial(n);
        while(factorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            counter++;
            factorial = factorial.divide(BigInteger.TEN);
        }
        return counter;
    }

    private static BigInteger factorial(int n) {

        BigInteger factorial = BigInteger.ONE;
        while(n > 0) {
            factorial = factorial.multiply(new BigInteger(""+n));
            n--;
        }
        return factorial;
    }
}

