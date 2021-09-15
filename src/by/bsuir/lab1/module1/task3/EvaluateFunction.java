package by.bsuir.lab1.module1.task3;

import java.util.Scanner;

public class EvaluateFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Entar h: ");
        int h = sc.nextInt();
        for (int i = a; i <= b; i += h) {
            System.out.print(i + " " + Math.tan(i));
            System.out.println();
        }
    }
}
