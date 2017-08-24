package tk.iammohitsharma.challenges.Codewars;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DecodeResistance {
    private static String decodeResistance(String[] array) {
        Arrays.stream(array).forEach(System.out::println);
        double val = ((encode(array[0]) * 10) + encode(array[1])) * (int) Math.pow(10, encode(array[2]));
        int val2 = (array.length > 3)?array[3].equals("gold")?5:(array[3].equals("silver")?10:20):20;
        String val3 = (val >= 1000 && val < 1000000)?new DecimalFormat("##.##").format(val/1000) + "k ohms,":(val >= 1000000)?new DecimalFormat("##.##").format(val/1000000) + "M ohms,":new DecimalFormat("##.##").format(val) + " ohms,";
        return (val3 + " " + val2 + "%");
    }

    private static int encode(String value) {
        switch (value) {
            case "black": return 0;
            case "brown": return 1;
            case "red": return 2;
            case "orange":return 3;
            case "yellow": return 4;
            case "green": return 5;
            case "blue": return 6;
            case "violet": return 7;
            case "gray": return 8;
            case "white":return 9;
        }
        return -1;
    }

    public static void main(String[] args) {
        String text;
        String[] data= new String[4];
        System.out.println("********** Encode a Resistance **********");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nType exit to close program, enter the String to continue");
                System.out.print("\nPlease Enter Resistance Value : ");
                text = scanner.next();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.print("\nBye..");
                    break;
                } else {
                    data[0] = text;
                    for (int i = 1; i <= 3; i++) {
                        data[i] = scanner.next();
                    }
                }
                System.out.println("\nResistor Value : " + decodeResistance(data));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error : Invalid value entered!!");
        }
    }
}
