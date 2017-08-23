package tk.iammohitsharma.challenges.Codewars;

import java.util.Scanner;

public class PrintDiamond {
    public static void main(String[] args) {
        String text;
        System.out.println("********** Print Diamonds **********");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nType exit to close program, enter the String to continue");
                System.out.print("\nPlease Enter Number : ");
                text = scanner.next();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.print("\nBye..");
                    break;
                } else if (Integer.parseInt(text) <= 0 || Integer.parseInt(text) % 2 == 0) {
                    System.out.println("Number should be odd and greater than 0.");
                } else{
                    System.out.println("\nDiamond Pattern : \n" + printDiamond(Integer.parseInt(text)));
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error : Invalid number entered!!");
        }
    }
    private static String printDiamond(int n) {
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < n; i += 2) {
            for(int j = 0; j < (n-i)/2; j++) {
                string.append(" ");
            }
            for(int j = 0; j <= i; j++) {
                string.append("*");
            }
            string.append("\n");
        }
        for (int i = n-2; i >= 0; i -= 2) {
            for(int j = 0; j < (n-i+1)/2; j++) {
                string.append(" ");
            }
            for (int j = i; j > 0; j--) {
                string.append("*");
            }
            string.append("\n");
        }
        return string.toString();
    }
}
