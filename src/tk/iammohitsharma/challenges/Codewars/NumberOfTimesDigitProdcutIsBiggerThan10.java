package tk.iammohitsharma.challenges.Codewars;

import java.util.Scanner;

public class NumberOfTimesDigitProdcutIsBiggerThan10 {

    static private int counter = 0;
    static private int prev_counter = 0;

    private static int persistence(long n) {
        // your code
        if(n >= 10) {
            n = multiplyDigits(n);
            counter++;
            persistence(n);

        } else {
            prev_counter = counter;
            counter = 0;
        }
        return prev_counter;
    }

    private static long multiplyDigits(long n) {
        long product = 1;
        while(n > 0) {
            product *= n%10;
            n /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        String text;
        System.out.println("********** Count Number of times Product of digits is more than 10 recursively **********");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nType exit to close program, enter the String to continue");
                System.out.print("\nPlease Enter Number : ");
                text = scanner.next();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.print("\nBye..");
                    break;
                }
                System.out.println("\nNumber of Duplicates : " + persistence(Long.parseLong(text)));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error : Invalid format!!");
        }
    }
}
