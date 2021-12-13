package lesson3HW3Part1;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int n = 4;
        int value = 8;

        int[][] matrix = WorkWithMassive.createMatrix(n, value);
        WorkWithMassive.printMatrix(matrix);
        System.out.println("Task 2");
        int[][] leftDiagonal = WorkWithMassive.fillingOfLeftDiagonal(matrix, 5);
        WorkWithMassive.printMatrix(leftDiagonal);

        System.out.println("Not squared");
        int[][] notSquared = new int[][]{
                {1, 3},
                {1, 2},
                {1}
        };
        int[][] notSquaredMatrix = WorkWithMassive.fillingOfLeftDiagonal(notSquared, 10);
        WorkWithMassive.printMatrix(notSquaredMatrix);
        System.out.println("Right diagonal");
        int[][] matrixForRightDiagonal = WorkWithMassive.createMatrix(3, 4);
        WorkWithMassive.printMatrix(matrixForRightDiagonal);
        System.out.println("Filled right diagonal");
        WorkWithMassive.fillingOfRightDiagonal(matrixForRightDiagonal, 9);
        WorkWithMassive.printMatrix(matrixForRightDiagonal);

        System.out.println("Both diagonals");
        int[][] matrixForBothDiagonals = WorkWithMassive.createMatrix(3, 5);
        WorkWithMassive.printMatrix(matrixForBothDiagonals);
        System.out.println("Filled both diagonals");
        WorkWithMassive.fillingOfBothDiagonals(matrixForBothDiagonals, 9);
        WorkWithMassive.printMatrix(matrixForBothDiagonals);
    }

}
