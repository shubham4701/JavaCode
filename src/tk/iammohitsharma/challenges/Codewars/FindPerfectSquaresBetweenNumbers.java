package tk.iammohitsharma.challenges.Codewars;

import java.util.Scanner;

public class FindPerfectSquaresBetweenNumbers {
    //Problem Statement
    //https://www.codewars.com/kata/55aa075506463dac6600010d
    private static String list_squared (long m, long n) {
        StringBuilder solution = new StringBuilder();
        solution.append("[");
        for (long i = m; i <= n; i++) {
            long sumOfFactors = 0;
            for (long j = 1; j <= i; j++) {
                if(i%j == 0) sumOfFactors += j*j;
            }
            if(!(Math.sqrt(sumOfFactors)%1 > 0)) {
                if(solution.indexOf("]") > 0) solution.append(", ");
                solution.append("[").append(i).append(", ").append(sumOfFactors).append("]");
            }
        }
        solution.append("]");
        return solution.toString();
    }

    public static void main(String[] args) {
        String text;
        long firstNum, secondNum;
        System.out.println("********** Perfect Squares in a Range **********");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nType exit to close program, enter the Number(s) to continue");
                System.out.print("\nPlease Enter Number : ");
                text = scanner.next();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.print("\nBye..");
                    break;
                } else {
                    firstNum = Long.parseLong(text);
                    System.out.print("Enter Second Number : ");
                    secondNum = Long.parseLong(scanner.next());
                }
                System.out.println("\nThe Squares are : " + list_squared(firstNum, secondNum));
            }
        }
    }
}
