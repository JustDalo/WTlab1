package by.bsuir.lab1.module2.balls;

import java.awt.*;


//javac -d bin ./src/by/bsuir/lab1/module2/balls/*
//java -cp ./bin by.bsuir.lab1.module2.balls.Main

//cd bin
//jar cfe Main.jar by.bsuir.lab1.module2.balls.Main by/bsuir/lab1/module2/balls
//java -jar Main.jar


public class Main {
    public static void main(String[] args) {
        var bin = new Bin();
        int weight = 320;
        for (int i = 0; i < 3; i++) {
            var ball = new Ball(Color.BLUE, weight);
            bin.addBall(ball);
            weight += 100;
        }

        bin.addBall(new Ball(Color.BLACK, 200));
        System.out.println("There are " + bin.getBlueBalls() + " blue balls in bin");
        System.out.println("Result weight is " + bin.getBallsWeight() + " gramm");
    }
}
