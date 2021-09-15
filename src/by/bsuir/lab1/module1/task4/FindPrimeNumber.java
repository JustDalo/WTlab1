package by.bsuir.lab1.module1.task4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class FindPrimeNumber {
    public static boolean primeNumber(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 1; i < n; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 1000);
            if (primeNumber(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
