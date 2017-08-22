import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FactorsOfNumbers {

    public static void main(String[] args) {
        String text = "";
        System.out.println("********** Count Factors Of A Number **********");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nType exit to close program, enter the String to continue");
                System.out.print("\nPlease Enter Number : ");
                text = scanner.next();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.print("\nBye..");
                    break;
                }
                System.out.println("\nNumber of Duplicates : " + primesInNumbers(Integer.parseInt(text)));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error : Invalid number entered!!");
        }
    }

    private static String primesInNumbers(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder final_string = new StringBuilder();
        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    n /= i;
                    list.add(i);
                    break;
                }
            }
        }
        HashMap<Integer, Integer> hash_list = new HashMap<>();
        list.stream().sorted().forEach(a -> {
            if (hash_list.containsKey(a)) {
                hash_list.put(a, hash_list.get(a) + 1);
            } else {
                hash_list.put(a, 1);
            }
        });
        hash_list.keySet().stream().sorted().forEach(a -> {
            final_string.append("(" + a + ((hash_list.get(a) == 1) ? "" : "**" + hash_list.get(a)) + ")");
        });
        return (final_string.toString());
    }
}
