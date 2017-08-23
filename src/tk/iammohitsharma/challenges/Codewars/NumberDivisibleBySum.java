package tk.iammohitsharma.challenges.Codewars;

import java.util.Scanner;

public class NumberDivisibleBySum {
    private static boolean checkNumberDivisbleBySum(int a) {
        int sum = sumOfDigits(a);
        return (a % sum == 0);
    }

    private static int sumOfDigits(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        String text;
        System.out.println("********** Number divisible by Sum **********");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nType exit to close program, enter the String to continue");
                System.out.print("\nPlease Enter Number : ");
                text = scanner.next();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.print("\nBye..");
                    break;
                }
                System.out.println("\nIs Divisible? : " + checkNumberDivisbleBySum(Integer.parseInt(text)));
            }
        }
    }
}
