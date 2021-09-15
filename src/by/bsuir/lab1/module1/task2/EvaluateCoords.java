package by.bsuir.lab1.module1.task2;

import java.util.Scanner;

public class EvaluateCoords {
    public static boolean axisX(int x, int y) {
        if (y <= 0 && x <= 6 && x >= -6) {
            return true;
        }
        else if (y > 0 && x <= 4 && x >= -4) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean axisY(int y) {
        if (y <= 5 && y >= -3) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        System.out.println(axisX(x, y) && axisY(y));
    }
}
