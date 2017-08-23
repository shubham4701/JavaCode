package tk.iammohitsharma.challenges.Codewars;

import javax.swing.text.html.StyleSheet;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class XibonacciSeries {

    static private double[] startSeries;
    static private int n;

    private static double[] xibonacci(double[] signature, int n) {
        // hackonacci me
        double[] solution = Arrays.copyOf(signature, n);
        BigDecimal[] term = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            term[i] = new BigDecimal(solution[i]);
        }
        for (int i = signature.length; i < n; i++) {
            for (int j = i - signature.length; j < i; j++) {
                term[i] = term[i].add(term[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            solution[i] = term[i].doubleValue();
        }
        return solution;
    }

    public static void main(String[] args) {
        System.out.println("********** Xibonacci Series **********");
        System.out.println("\nA Xibonacci Series is that in which the next term is the sum of previous x elements!");
        try (Scanner scanner = new Scanner(System.in)) {
            while (printInstrutions(scanner)) {
                //
            }
        } catch (NumberFormatException e) {
            System.out.print("Please enter a valid number!");
        }
    }

    private static boolean printInstrutions(Scanner scanner) {
        System.out.println("Instructions : How to run the program?");
        System.out.println("1. The program takes 2 parameters, one the starting array " +
                "and the second the number of terms you want to show");
        System.out.println("2. The pervious x terms will be equal to length of array");
        System.out.println("3. First you will enter How many elements are there in the array, means the length of" +
                " array and value of x terms which will be summed up to get next term");
        System.out.print("\nEnter the length of array (x) : ");
        int length = scanner.nextInt();
        startSeries = new double[length];
        System.out.println("Please enter the elements of array, press enter to declare next value.");
        for (int i = 0; i < length; i++) {
            startSeries[i] = scanner.nextDouble();
        }
        System.out.print("Enter how many terms you want ? : ");
        n = scanner.nextInt();
        System.out.print("\nThe desired series is : ");
        Arrays.stream(xibonacci(startSeries, n)).forEach(a -> System.out.print(a + ", "));
        System.out.print("\nContinue? (Y/N) : ");
        return !scanner.next().equalsIgnoreCase("N");
    }
}
