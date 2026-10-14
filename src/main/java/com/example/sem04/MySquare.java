package com.example.sem04;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MySquare extends GeometricShape {
    private static final double SIZE = 18;
    private double dy = 3;

    public MySquare(double x, double y, Color color) {
        super(new Rectangle(SIZE, SIZE), x, y, color);
    }

    @Override
    public void move(double width, double height) {
        double newY = shape.getLayoutY() + dy;
        if (newY < 0 || newY + SIZE > height) {
            dy = -dy;
            newY = shape.getLayoutY() + dy;
        }
        shape.setLayoutY(newY);
    }
}