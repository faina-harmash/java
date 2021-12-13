package lesson3HW3Part1;

public class WorkWithMassive {

//    - В  классе WorkWithMassive создать метод который
//    будет создавать матрицу (тип int) и заполнять ее
//    заданным значением(размерность матрицы и значение
//    передаем с основной программы , например по размеру NхN
//    (на пример 3х3) и заполнять ее заданным значением,
//    к примеру 8.). После заполнения возвращать ее .

    static int[][] createMatrix(int size, int value) {
        int[][] m = new int[size][size];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = value;
            }

        }
        return m;
    }

    static int[][] fillingOfLeftDiagonal(int[][] matrix, int value) {
//        int[][] m2 = new int[][];
        boolean isSquared = true;
        for (int i = 0; i < matrix.length - 1; i++) {

            if (matrix[i].length != matrix[i + 1].length) {
                isSquared = false;
            }

        }

        if (isSquared) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j) {
                        matrix[i][j] = value;
                    }
                }
            }
        }

        return matrix;
    }

    static int[][] fillingOfRightDiagonal(int[][] matrix, int value) {
//        int[][] m2 = new int[][];
        boolean isSquared = true;
        for (int i = 0; i < matrix.length - 1; i++) {

            if (matrix[i].length != matrix[i + 1].length) {
                isSquared = false;
            }

        }

        if (isSquared) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
//                    if (i == matrix[i].length - 1 - j) {
                    if (i + j == matrix[i].length - 1) {
                        matrix[i][j] = value;
                    }
                }
            }
        }

        return matrix;
    }

    static int[][] fillingOfBothDiagonals(int[][] matrix, int value) {
        int[][] result = fillingOfLeftDiagonal(matrix, value);
        result = fillingOfRightDiagonal(result, value);
        return result;
    }


    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
