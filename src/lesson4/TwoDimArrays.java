package lesson4;

public class TwoDimArrays {
    public static void main(String[] args) {
        //2
        int[][] table = {{1, 8, 6, 8},
                {65, 55, 677, 22},
                {0, 3, 55, 1}};

        //2a
        System.out.println(table[0][0]);
        System.out.println(table[0][1]);
        System.out.println(table[0][2]);
        System.out.println(table[0][3]);

        //2b
        System.out.println(table[0][0]);
        System.out.println(table[1][0]);
        System.out.println(table[2][0]);

        //2c
        for (int i = 0; i < table[0].length; i++) {
            System.out.println(table[0][i]);
        }

        //2d
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0]);
        }

        //2e
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }

        //2f
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sum += table[i][j];
            }
        }

        //2g
        int min = table[0][0];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] < min) {
                    min = table[i][j];
                }
            }
        }

        int max = table[0][0];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] > max) {
                    max = table[i][j];
                }
            }
        }

        int totalCells = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                totalCells++;
            }
        }
        double average = (double) sum / totalCells;

        printMultiplicationTable();

    }

    //1
    static void square(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    //3
    static void printTwoDimArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    //4
    static int[] getRow(int[][] table, int rowNum) {
        return table[rowNum];
    }

    //5
    static boolean hasOddNumber(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    static void printMultiplicationTable() {
        int[][] table = new int[9][9];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("%3d", table[i][j]);
            }
            System.out.println();
        }

    }
}
