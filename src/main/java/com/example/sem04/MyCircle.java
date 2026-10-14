package com.example.sem04;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MyCircle extends GeometricShape {
    private double centerX, centerY;
    private final double radius = 12;
    private double angle = 0;

    public MyCircle(double x, double y, Color color) {
        super(new Circle(20), x, y, color);
        this.centerX = x;
        this.centerY = y;
    }

    @Override
    public void move(double width, double height) {
        angle += 0.05;
        shape.setLayoutX(centerX + radius * Math.cos(angle));
        shape.setLayoutY(centerY + radius * Math.sin(angle));
    }

    @Override
    public void moveDown(double dy) {
        centerY += dy;
        super.moveDown(dy);
    }
}