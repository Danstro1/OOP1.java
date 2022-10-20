package com.example.oop1;


import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import java.util.Random;

public class MyCircle {
    private Circle circle;
    private double radius;
    private double centerX;
    private double centerY;

    private boolean isVisible = true;


    private String[] Colors = new String[]{"BLUE", "RED", "YELLOW", "BLACK", "GREEN", "DARKRED", "MAGENTA", "CYAN", "GRAY", "PINK", "ORANGE"};

    public MyCircle(double radius, double centerX, double centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }


    public Circle getCircle() {
        return circle;
    }

    public void setRadius(double radius) {
        circle.setRadius(radius);
    }

    public void setCenterX(double centerX) {
        circle.setCenterX(centerX);
    }

    public void setCenterY(double centerY) {
        circle.setCenterY(centerY);
    }

    public void RandomRadius() {
        int randomRadius = new Random().nextInt(70);
        try {
            circle.setRadius(randomRadius);
        } catch (NullPointerException e) {
        }
    }

    public void CircleRandM() {
        int randomMove1 = (int) Math.floor(Math.random() * 41 - 20);
        int randomMove2 = (int) Math.floor(Math.random() * 41 - 20);
        try {
            circle.setCenterX(circle.getCenterX() + randomMove1);
            circle.setCenterY(circle.getCenterY() + randomMove2);
        } catch (NullPointerException e) {}
    }
    public void show(AnchorPane anchorPane) {
        if (isVisible == false) {
            anchorPane.getChildren().add(circle);
            isVisible = !isVisible;
        } else {
            anchorPane.getChildren().remove(circle);
            isVisible = !isVisible;
        }
    }
    public void create(AnchorPane anchorPane){
        int random = new Random().nextInt(11);
        circle = new Circle(centerX, centerY, radius,Paint.valueOf(Colors[random]));
        anchorPane.getChildren().add(circle);
    }
}