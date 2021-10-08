package by.bsuir.lab1.module1.task6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MatrixGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 1000);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();

        int matrix[][];
        matrix = createMatrix(array, n);

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++)
                System.out.print(matrix[j][i] + " ");
            System.out.println();
        }
    }

    private static int[][] createMatrix(int[] array, int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int j = 0;
            for (int k = i; k < n; k++) {
                matrix[i][j] = array[k];
                j++;
            }
            for (int k = 0; j < n; k++) {
                matrix[i][j] = array[k];
                j++;
            }
        }
        return matrix;
    }
}
