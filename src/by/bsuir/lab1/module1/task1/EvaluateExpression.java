package by.bsuir.lab1.module1.task1;

import java.util.Scanner;

public class EvaluateExpression {
    public static double numerator(double x, double y) {
        double result = 1 + Math.pow(Math.sin(x + y), 2);
        return result;
    }
    public static double denominator(double x, double y) {
        double result = 2 + Math.abs(x - (2 * x)/(1 + Math.pow(x, 2) * Math.pow(y, 2)));
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = sc.nextInt();
        System.out.println("Enter y: ");
        double y = sc.nextInt();
        double finalResult = numerator(x, y)/denominator(x, y) + x;
        System.out.println(finalResult);
    }
}
