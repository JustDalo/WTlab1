package by.bsuir.lab1.module1.task1;

import java.util.Scanner;

public class EvaluateExpression {
    public static double numerator(int x, int y) {
        double result = 1 + Math.pow(Math.sin(x + y), 2);
        return result;
    }
    public static double denominator(int x, int y) {
        double result = 2 + Math.abs(x - (2 * x)/(1 + Math.pow(x, 2) * Math.pow(y, 2)));
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        double finalResult = numerator(x, y)/denominator(x, y) + x;
        System.out.println(finalResult);
    }
}
