package com.example.sem04;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MyRectangle extends GeometricShape {
    private static final double WIDTH = 40;
    private static final double HEIGHT = 20;
    private double dx = 3;

    public MyRectangle(double x, double y, Color color) {
        super(new Rectangle(WIDTH, HEIGHT), x, y, color);
    }

    @Override
    public void move(double width, double height) {
        double newX = shape.getLayoutX() + dx;
        if (newX < 0 || newX + WIDTH > width) {
            dx = -dx;
            newX = shape.getLayoutX() + dx;
        }
        shape.setLayoutX(newX);
    }
}