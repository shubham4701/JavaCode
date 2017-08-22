import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CountDuplicatesInString {

    public static int duplicateCount(String text) {
        // Write your code here
        int count = 0;
        HashMap<Character, Integer> data = new HashMap<Character, Integer>();
        for (char c : text.toLowerCase().toCharArray()) {
            if (data.containsKey(c)) {
                data.put(c, data.get(c) + 1);
            } else {
                data.put(c, 1);
            }
        }
        Iterator c = data.keySet().iterator();
        while (c.hasNext()) {
            if (data.get(c.next()) > 1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "";
        System.out.println("********** Count Duplicates In String **********");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nType exit to close program, enter the String to continue");
                System.out.print("\nPlease Enter String : ");
                text = scanner.next();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.print("\nBye..");
                    break;
                }
                System.out.println("\nNumber of Duplicates : " + duplicateCount(text));
            }
        }
    }
}
