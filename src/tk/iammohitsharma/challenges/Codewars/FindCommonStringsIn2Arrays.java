package tk.iammohitsharma.challenges.Codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonStringsIn2Arrays {
    private static String[] stringCommon() {
        String array1[] = new String[]{ "arp", "live", "strong" };
        String array2[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        ArrayList<String> list = new ArrayList<>();
        for (String anArray1 : array1) {
            for (String b : array2) {
                if (b.contains(anArray1)) {
                    list.add(anArray1);
                    break;
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        System.out.println("********** Finding Common Strings in 2 Arrays **********");
        Arrays.stream(stringCommon()).forEach(a-> System.out.print(a + ", "));
    }
}
