import java.util.Arrays;
import java.util.Scanner;

public class TribonacciSeries {

    static double[] startSeries;
    static int n;

    public static void main(String[] args) {
        System.out.println("********** Tribonacci Series **********");
        System.out.println("\nA Tribonacci Series is that in which the next term is the sum of previous 3 elements!");
        try(Scanner scanner = new Scanner(System.in)) {
            while(printInstrutions(scanner)){}
        }  catch (NumberFormatException e) {
            System.out.print("Please enter a valid number!");
        }
    }

    private static boolean printInstrutions(Scanner scanner) {
        System.out.println("Instructions : How to run the program?");
        System.out.println("1. The program takes 2 parameters, one the starting array " +
                "and the second the number of terms you want to show");
        System.out.println("2. First you will enter How many elements are there in the array, then number of terms");
        startSeries = new double[3];
        System.out.println("Please enter the elements of array, press enter to declare next value.");
        for (int i = 0; i < 3; i++) {
            startSeries[i] = scanner.nextDouble();
        }
        System.out.print("Enter how many terms you want ? : ");
        n = scanner.nextInt();
        System.out.print("\nThe desired series is : ");
        Arrays.stream(tribonacci(startSeries, n)).forEach(a->{
            System.out.print(a + ", ");
        });
        System.out.print("\nContinue? (Y/N) : ");
        if(scanner.next().equalsIgnoreCase("N")) return false;

        return true;
    }
    public static double[] tribonacci(double[] s, int n) {
        // hackonacci me
        double[] solution;
        solution = new double[n];
        if (n == 0) {
            return new double[]{};
        } else if (n > 0 && n < 3) {
            solution = new double[n];
            for (int i = 0; i < n; i++) {
                solution[i] = s[i];
            }
            return solution;
        } else {
            for (int i = 0; i < s.length; i++) {
                solution[i] = s[i];
            }
            if (n < s.length) {
                return solution;
            } else {
                for (int i = s.length; i < n; i++) {
                    solution[i] = solution[i - 3] + solution[i - 1] + solution[i - 2];
                }
            }
            return solution;
        }
    }
}
