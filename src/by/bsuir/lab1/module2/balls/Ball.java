package by.bsuir.lab1.module2.balls;

import java.awt.*;

public class Ball {
    private Color color;
    private int weight;

    public Ball(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getBallColor() {
        return color;
    }

    public int getBallWeight() {
        return weight;
    }


}
