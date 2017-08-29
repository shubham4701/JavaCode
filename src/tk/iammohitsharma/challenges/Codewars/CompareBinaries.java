package tk.iammohitsharma.challenges.Codewars;

import java.util.Scanner;

public class CompareBinaries {
    //Problem Statement
    //https://www.codewars.com/kata/538948d4daea7dc4d200023f
    private static int compareBits(int num1, int num2) {
        int counter = 0;
        String n1 = String.format("%32s", Integer.toBinaryString(num1)).replace(" ", "0");
        String n2 = String.format("%32s", Integer.toBinaryString(num2)).replace(" ", "0");
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) != n2.charAt(i)) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        String text;
        int num2 = 0;
        System.out.println("********** Difference in Binary Counter **********");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nType exit to close program, enter the Number to continue");
                System.out.print("\nPlease Enter Number : ");
                text = scanner.next();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.print("\nBye..");
                    break;
                }
                System.out.println("Enter Second Number : ");
                num2 = Integer.parseInt(scanner.next());
                System.out.println("\nBinary Differenece : " + compareBits(Integer.parseInt(text), num2));
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
