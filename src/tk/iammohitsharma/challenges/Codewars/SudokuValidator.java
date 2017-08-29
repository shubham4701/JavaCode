package tk.iammohitsharma.challenges.Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SudokuValidator {
    //Problem Statement
    //https://www.codewars.com/kata/529bf0e9bdf7657179000008
    private static int[][] data = new int[][]{
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 0, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
    };


    private static int[][] data1 = new int[][]{
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
    };

    private static int[][] data2 = new int[][]{
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 0, 3, 4, 8},
            {1, 0, 0, 3, 4, 2, 5, 6, 0},
            {8, 5, 9, 7, 6, 1, 0, 2, 0},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 0, 1, 5, 3, 7, 2, 1, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 0, 0, 4, 8, 1, 1, 7, 9}
    };

    private static boolean rowValidate(List<Integer> row) {
        HashSet<Integer> list = new HashSet<>();
        row.stream().filter(a -> (a > 0 && a < 10)).forEach(list::add);
        return list.size() == 9;
    }

    public static void main(String[] args) {
        System.out.println("********** Sudoku Solution Validator **********\n");
        System.out.println("Solution for Set 1 : " + checkSudoku(data));
        System.out.println("Solution for Set 2 : " + checkSudoku(data1));
        System.out.println("Solution for Set 3 : " + checkSudoku(data2));
    }

    private static boolean checkSudoku(int[][] data) {
        //do your magic
        boolean flag = true;
        List<Integer> temp_block;
        int counter = 0;
        for (int i = 0; i < 9; i++) {
            flag = flag && rowValidate(IntStream.of(data[i]).boxed().collect(Collectors.toList()));
            temp_block = Arrays.asList(data[i][0], data[i][1], data[i][2], data[i][3], data[i][4], data[i][5],
                    data[i][6], data[i][7], data[i][8]);
            flag = flag && rowValidate(temp_block);
        }
        for (int i = 0; i < 9; i += 3) {
            temp_block = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                temp_block.add(data[j][i]);
                temp_block.add(data[j][i + 1]);
                temp_block.add(data[j][i + 2]);
                counter += 3;
            }
            if (counter % 9 == 0) {
                flag = flag && rowValidate(temp_block);
                temp_block.clear();
            }
        }
        return flag;
    }
}
