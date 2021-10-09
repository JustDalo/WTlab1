package by.bsuir.lab1.module2.balls;

import java.awt.*;
import java.util.ArrayList;

public class Bin {
    public ArrayList<Ball> balls;
    public Bin() {
        balls = new ArrayList<Ball>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }
    public int getBlueBalls() {
        int numberOfBalls = 0;
        for (var ball : balls) {
            if (ball.getBallColor() == Color.BLUE) {
                numberOfBalls = numberOfBalls + 1;
            }
        }
        return numberOfBalls;
    }

    public int getBallsWeight() {
        int ballsWeight = 0;
        for (var ball: balls) {
            ballsWeight = ballsWeight + ball.getBallWeight();
        }
        return ballsWeight;
    }


}
