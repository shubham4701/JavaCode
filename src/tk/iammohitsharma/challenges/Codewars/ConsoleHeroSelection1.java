package tk.iammohitsharma.challenges.Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleHeroSelection1 {
    private static String[][] fighters = new String[][]{{"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
                                                    {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"}};
    private static String[] moves = {"up", "left", "right", "left", "left"};

    private static int[] directions(String direction, int x, int y, int xmax, int ymax){
        switch (direction){
            case "up": return new int[]{x, ((y <= 0)?0:(y-1))};
            case "down": return new int[]{x, ((y >= ymax-1)?ymax-1:(y+1))};
            case "left": return new int[]{((x <= 0)?xmax-1:x-1), y};
            case "right": return new int[]{((x >= xmax-1)?0:x+1), y};
        }
        return new int[]{};
    }

    private static String[] moves(){
        int x = 0, y = 0, ymax = fighters.length, xmax = fighters[0].length;

        List<String> sol = new ArrayList<>();
        for(String action : moves) {
            int[] index = directions(action, x, y, xmax, ymax);
            sol.add(fighters[index[1]][index[0]]);
            x = index[0]; y = index[1];
        }
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
        Arrays.stream(moves()).forEach((String a) -> System.out.print(a + " "));
    }
}
