package com.example.sem04;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public abstract class GeometricShape {
    protected Shape shape;

    public GeometricShape(Shape shape, double x, double y, Color color) {
        this.shape = shape;
        shape.setFill(color);
        shape.setLayoutX(x);
        shape.setLayoutY(y);
    }

    public Node getNode() {
        return shape;
    }

    public abstract void move(double width, double height);

    public void moveDown(double dy) {
        shape.setLayoutY(shape.getLayoutY() + dy);
    }

    public void setColor(Color color) {
        shape.setFill(color);
    }
}