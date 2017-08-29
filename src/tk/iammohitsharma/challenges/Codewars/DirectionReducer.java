package tk.iammohitsharma.challenges.Codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class DirectionReducer {
    //Problem Statement
    //https://www.codewars.com/kata/550f22f4d758534c1100025a
    public static void main(String[] args) {
        String[] directions = {"NORTH", "EAST", "WEST", "SOUTH", "WEST"};
        System.out.println("********** Reduce the Given Directions for effective shortest path **********");
        System.out.print("\nGiven Directions Array : ");
        for (String d : directions){
            System.out.print(d + ", ");
        }
        System.out.print("\nReduced Directions array : " );
        directions = dirReduc(directions);
        for (String d : directions){
            System.out.print(d + ", ");
        }
    }
    private static String[] dirReduc(String[] arr) {
        // Your code here.
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        boolean flag = false;
        for (String anArr : arr) {
            for (int j = 0; j < list.size(); j++) {
                if (flag) {
                    flag = false;
                    j = 0;
                }
                if ((j + 1) < list.size() && (decode(list.get(j)) + decode(list.get(j + 1))) == 0) {
                    list.remove(j);
                    list.remove(j);
                    flag = true;
                }
            }
        }
        return list.toArray(new String[0]);
    }
    private static int decode(String direction) {
        switch (direction) {
            case "NORTH":
                return 2;
            case "SOUTH":
                return -2;
            case "EAST":
                return 1;
            case "WEST":
                return -1;
            default:
                return 0;
        }
    }
}
