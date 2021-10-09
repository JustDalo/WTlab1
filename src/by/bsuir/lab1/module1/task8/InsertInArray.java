package by.bsuir.lab1.module1.task8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static by.bsuir.lab1.module1.task7.ShallSort.ShellSort;

public class InsertInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] aSequence = new float[n];
        for (int i = 0; i < n; i++) {
            aSequence[i] = ThreadLocalRandom.current().nextFloat();
        }
        ShellSort(aSequence);
        sc = new Scanner(System.in);
        int m = sc.nextInt();
        float[] bSequence = new float[m];
        for (int i = 0; i < m; i++) {
            bSequence[i] = ThreadLocalRandom.current().nextFloat();
        }
        ShellSort(bSequence);

        for (int i = 0; i < n; i++) {
            System.out.print(aSequence[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print(bSequence[i] + " ");
        }
        System.out.println();
        float[] resultSequence = Insert(aSequence, bSequence);
        for (int i = 0; i < n + m; i++) {
            System.out.print(resultSequence[i] + " ");
        }
    }

    private static float[] Insert(float[] aSequence, float[] bSequence) {
        float[] result = new float[aSequence.length + bSequence.length];
        ArrayList<Float> listResult = new ArrayList<Float>();
        int i = 0;
        int j = 0;
        while(i < aSequence.length) {
            while (j < bSequence.length && bSequence[j] < aSequence[i]) {
                listResult.add(bSequence[j]);
                j++;
            }
            listResult.add(aSequence[i]);
            i++;
        }
        while(j < bSequence.length) {
            listResult.add(bSequence[j]);
            j++;
        }
        i = 0;
        for (Float f : listResult) {
            result[i++] = (f != null ? f : Float.NaN);
        }
        return result;
    }
}
