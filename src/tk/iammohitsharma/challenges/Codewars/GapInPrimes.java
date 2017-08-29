package tk.iammohitsharma.challenges.Codewars;

import java.util.Scanner;

public class GapInPrimes {
    //Problem Statement
    //https://www.codewars.com/kata/561e9c843a2ef5a40c0000a4
    private static boolean isPrime(long number) {
        boolean flag = true;
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private static boolean checkPrimeInBetween(long start, long end) {
        boolean flag = true;
        for (long i = start + 1; i < end; i++) {
            flag = flag && !isPrime(i);
        }
        return flag;
    }

    private static long[] gapInPrimes(int gap, long start, long end) {
        boolean flag = true;
        for (long i = start; i < end; i++) {
            if (isPrime(i) && isPrime(i + gap) && checkPrimeInBetween(i, i + gap)) {
                return new long[]{i, i + gap};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String text;
        long start, end;
        int gap;
        System.out.println("********** Gaps In Primes **********");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nType exit to close program, enter the String to continue");
                System.out.print("\nPlease Enter Gap Value : ");
                text = scanner.next();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.print("\nBye..");
                    break;
                } else {
                    gap = Integer.parseInt(text);
                    System.out.print("Enter Start Point : ");
                    start = Long.parseLong(scanner.next());
                    System.out.print("Enter End Point : ");
                    end = Long.parseLong(scanner.next());
                }
                long[] solution = gapInPrimes(gap, start, end);
                solution = solution == null ? new long[]{0, 0} : solution;
                System.out.println("\nGap Value : [" + solution[0] + ", " + solution[1] + "]");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error : Invalid value entered!!");
        }
    }
}