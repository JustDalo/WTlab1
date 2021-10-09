package by.bsuir.lab1.module1.task7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ShallSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] array = new float[n];
        for (int i = 0; i < n; i++) {
            array[i] = ThreadLocalRandom.current().nextFloat();
            System.out.print(array[i] + " ");
        }
        System.out.println();
        ShellSort(array);
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void ShellSort(float[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                swap(array, i, i+1);
                i = i > 0 ? i - 1 : i;
            }
        }
    }

    private static void swap(float[] array, int a, int b) {
        float temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
