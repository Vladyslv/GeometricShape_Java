package com.example.sem04;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HelloController {
    @FXML private Pane pane;

    private final List<GeometricShape> shapes = new ArrayList<>();
    private final Random random = new Random();

    @FXML public void initialize() {
        AnimationTimer timer = new AnimationTimer() {
            private long last = 0;

            public void handle(long now) {
                if (now - last < 30_000_000) {
                    return;
                }
                last = now;
                for(GeometricShape s : shapes) {
                    s.move(pane.getWidth(), pane.getHeight());
                }
            }
        };
        timer.start();
    }

    private double randX(double objWidth) {
        return 50 + random.nextDouble() * Math.max(1, pane.getWidth() - objWidth - 100);
    }
    private double randY(double objHeight) {
        return 50 + random.nextDouble() * Math.max(1, pane.getHeight() - objHeight - 100);
    }
    private void addShape(GeometricShape s) {
        shapes.add(s);
    pane.getChildren().add(s.getNode());
    }

    @FXML private void onAddRectangle() {
        addShape(new MyRectangle(randX(120), randY(60), Color.RED));
    }

    @FXML private void onAddCircle() {
        addShape(new MyCircle(randX(100), randY(100), Color.GREEN));
    }

    @FXML private void onAddSquare() {
        addShape(new MySquare(randX(50), randY(50), Color.ORANGE));
    }

    @FXML private void onCircleBlue() {
        for(GeometricShape s : shapes) {
            if(s instanceof MyCircle) {
                s.setColor(Color.BLUE);
            }
        }
    }

    @FXML private void onMoveDown() {
        for(GeometricShape s : shapes) {
            s.moveDown(30);
        }
    }
}
