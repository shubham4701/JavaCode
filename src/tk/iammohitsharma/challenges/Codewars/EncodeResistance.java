package tk.iammohitsharma.challenges.Codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EncodeResistance {
    private static String decode(int v) {
        switch (v) {
            case 0:
                return "black";
            case 1:
                return "brown";
            case 2:
                return "red";
            case 3:
                return "orange";
            case 4:
                return "yellow";
            case 5:
                return "green";
            case 6:
                return "blue";
            case 7:
                return "violet";
            case 8:
                return "gray";
            case 9:
                return "white";
        }
        return "";
    }

    public static void main(String[] args) {
        String text;
        System.out.println("********** Encode a Resistance **********");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nType exit to close program, enter the String to continue");
                System.out.print("\nPlease Enter Resistance Value : ");
                text = scanner.next();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.print("\nBye..");
                    break;
                }
                System.out.println("\nResistor Bands : " + calculateResistanceBands(text));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error : Invalid value entered!!");
        }
    }

    private static String calculateResistanceBands(String s) {
        String resistance = "50 ohms";
        List<String> solution = new ArrayList<>();
        StringBuilder final_string = new StringBuilder();
        int counter = 0;
        resistance = resistance.contains("k") ? resistance.replace("k", (resistance.contains(".") ? "00" : "000"))
                .replace(".", "").replace(" ohms", "")
                : (resistance.contains("M") ? resistance.replace("M", (resistance.contains(".") ? "00000" : "000000"))
                .replace(".", "").replace(" ohms", "")
                : resistance.replace(" ohms", ""));
        long value = Long.parseLong(resistance);
        while(value%10 == 0 && value > 99) {
            counter++;
            value /= 10;
        }
        solution.add("gold");
        solution.add(decode(counter));
        while (value > 0) {
            solution.add(decode((int) value%10));
            value /= 10;
        }
        Collections.reverse(solution);
        for (int i = 0; i < solution.size(); i++) {
            final_string.append(solution.get(i) + ((i<solution.size()-1)?" ":""));
        }
        return (final_string.toString());
    }

}
