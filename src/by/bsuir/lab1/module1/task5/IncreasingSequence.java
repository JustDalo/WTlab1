package by.bsuir.lab1.module1.task5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class IncreasingSequence {
    public static int countNumbers(int[] numbers) {
        int resultCount = 0, currMaxNumber = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] <= currMaxNumber) {
                resultCount++;
            }
            else {
                currMaxNumber = numbers[i + 1];
            }
        }
        return resultCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 1; i < n; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 1000);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(countNumbers(array));
    }
}
