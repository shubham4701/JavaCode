package tk.iammohitsharma.challenges.Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindCommonStringsIn2Arrays {
    //Problem Statement
    //https://www.codewars.com/kata/550554fd08b86f84fe000a58
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
        Collections.sort(list);
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        System.out.println("********** Finding Common Strings in 2 Arrays **********");
        Arrays.stream(stringCommon()).forEach(a-> System.out.print(a + ", "));
    }
}
