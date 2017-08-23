package tk.iammohitsharma.challenges.Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListToBinaryInt {
    private static int listTOBinaryInt(Integer[] array) {
        String listString = new ArrayList<>(Arrays.asList(array))
                            .stream().map(Object::toString)
                            .collect(Collectors.joining(", ")).replace(", ", "");
        System.out.println(listString);
        return Integer.parseInt(listString, 2);
    }

    public static void main(String[] args) {
        Integer[] array = {0, 0, 0, 0};
        String text;
        System.out.println("********** Binary To Integer **********");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nType exit to close program, enter to continue : ");
                text = scanner.nextLine();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.print("\nBye..");
                    break;
                }else{
                    System.out.print("\nPlease Enter Number(s) : \n");
                    for (int i = 0; i < 4; i++) {
                        array[i] = Integer.parseInt(scanner.next());
                    }
                }
                System.out.println("\nInteger Value : " + listTOBinaryInt(array));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error : Invalid number entered!!" + e.getMessage());
            e.printStackTrace();
        }

    }
}
