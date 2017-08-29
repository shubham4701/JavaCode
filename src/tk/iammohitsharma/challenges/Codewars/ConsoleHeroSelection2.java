package tk.iammohitsharma.challenges.Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleHeroSelection2 {
    //Problem Statement
    //https://www.codewars.com/kata/58583922c1d5b415b00000ff
    static private String[][] fighters = new String[][]{{"","Ryu","E.Honda","Blanka","Guile",""},
            {"Balrog","Ken","ChunLi","Zangief","Dhalsim","Sagat"},
            {"Vega","T.Hawk","FeiLong","Deejay","Cammy","M.Bison"}};
    static private String[] moves = {"up", "left", "right", "left", "left"};

    private static int[] directions(String direction, int x, int y, int xmax, int ymax){
        switch (direction){
            case "up": return new int[]{x, ((y <= 0)?0:(y-1))};
            case "down": return new int[]{x, ((y >= ymax-1)?ymax-1:(y+1))};
            case "left": return new int[]{((x <= 0)?xmax-1:x-1), y};
            case "right": return new int[]{((x >= xmax-1)?0:x+1), y};
        }
        return new int[]{};
    }

    private static String[] process() {
        int x = 0, y = 1, xmax = fighters[0].length, ymax = fighters.length;
        List<String> sol = new ArrayList<>();
        for (String move : moves) {
            int[] newIndex = directions(move, x, y, xmax, ymax);
            while (fighters[newIndex[1]][newIndex[0]].equals("")){
                if(move.equals("up") || move.equals("down")) {
                    newIndex[0] = x;
                    newIndex[1] = y;
                } else{
                    newIndex = directions(move, newIndex[0], newIndex[1], xmax, ymax);
                }
            }
//            System.out.println("X : " + x + " Y : " + y + " NewIndex[0] : " +
//                    newIndex[0] + " NewIndex[1] : " + newIndex[1]+ " Fighter : " + fighters[newIndex[1]][newIndex[0]]);
//
            x = newIndex[0]; y = newIndex[1];
            sol.add(fighters[newIndex[1]][newIndex[0]]);
        }
//        sol.stream().forEach(System.out::println);
        return sol.toArray(new String[0]);
    }
    public static void main(String[] args) {
        System.out.println("********** Character Selection In Video Game **********");
        System.out.println("\nFighters List");
        for (String[] data : fighters) {
            for (String a : data) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        System.out.println("\nMoves List");
        for (String a : moves) {
            System.out.print(a + " ");
        }
        System.out.println("\n\nCharcters selected : ");
        Arrays.stream(process()).forEach((String a) -> System.out.print(a + " "));
    }
}
