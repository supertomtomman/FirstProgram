package Day4;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {

    public static void main(String[] args) {

/*

        // test
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 1; i <10; i++) {
            s.add(i);
        }
        s.add(2);
        s.add(2);

        System.out.println(s);
        System.out.println(s.size());

        // ----
        int[] tempColumn1 = new int[9];
        for (int i = 0; i <tempColumn1.length; i++) {
            tempColumn1[i]=i+1;

        }
        System.out.println(Arrays.toString(tempColumn1));
        System.out.println(tempColumn1.length);
*/

        int[][] test1 = new int[][]{
                {
                        5, 3, 4, 6, 7, 8, 9, 1, 2
                },
                {
                        6, 7, 2, 1, 9, 5, 3, 4, 8
                },
                {
                        1, 9, 8, 3, 4, 2, 5, 6, 7
                },
                {
                        8, 5, 9, 7, 6, 1, 4, 2, 3
                },
                {
                        4, 2, 6, 8, 5, 3, 7, 9, 1
                },
                {
                        7, 1, 3, 9, 2, 4, 8, 5, 6
                },
                {
                        9, 6, 1, 5, 3, 7, 2, 8, 4
                },
                {
                        2, 8, 7, 4, 1, 9, 6, 3, 5
                },
                {
                        3, 4, 5, 2, 8, 6, 1, 7, 9
                }
        };

        System.out.println("Result : " + validSolution(test1));

    }

    public static boolean validSolution(int[][] sudoku) {

        boolean result = false;
        boolean rowsCheck = true;
        boolean columnCheck = true;
        boolean grid3x3Check = true;

        // checking the rows
        for (int i = 0; i < sudoku.length; i++) {


            if (!isLineValid(sudoku[i])) {
                rowsCheck = false;
            }
        }

        // checking the columns

        int[] tempColumn = new int[9];
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                tempColumn[j] = sudoku[j][i];

            }
            if (!isLineValid(tempColumn)) {
                columnCheck = false;
            }

        }

        // checking the grid 3x3


        int[] tempGrid = new int[9];
        int tempGridCounter = 0;
        for (int i = 0; i < sudoku.length - 2; i = i + 3) {
            for (int j = 0; j < sudoku[i].length - 2; j = j + 3) {

                if (!isGridValid(i, j, sudoku)) {

                    grid3x3Check = false;
                }
            }
        }


        if (rowsCheck && columnCheck && grid3x3Check) {
            result = true;
        }

        return result;
    }

    private static boolean isGridValid(int i, int j, int[][] sudoku) {

        int[] tempGrid = new int[9];
        int counter = 0;
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                tempGrid[counter] = sudoku[i + k][j + l];
                counter++;
            }
        }
        // print of the sub grids
        //System.out.println(Arrays.toString(tempGrid));

        return isLineValid(tempGrid);
    }

    private static boolean isLineValid(int[] ints) {


        Set<Integer> tempSet = new HashSet<>();

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                return false;
            } else {

                tempSet.add(ints[i]);
            }

        }


        return
                tempSet.contains(1) &&
                        tempSet.contains(2) &&
                        tempSet.contains(3) &&
                        tempSet.contains(4) &&
                        tempSet.contains(5) &&
                        tempSet.contains(6) &&
                        tempSet.contains(7) &&
                        tempSet.contains(8) &&
                        tempSet.contains(9) &&
                        tempSet.size() == 9
                ;
    }
}
