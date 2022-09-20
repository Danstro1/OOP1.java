package com.example.oop1;


import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.util.Random;

public class MyCircle implements Shape {
    private Circle circle;
    private double radius;
    private double centerX;
    private double centerY;

    private  String[] Colors = new String[] {"BLUE","RED","YELLOW","BLACK","GREEN","DARKRED","MAGENTA","CYAN","WHITE","GRAY","PINK","ORANGE"};

    public MyCircle(double radius, double centerX, double centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle create() {
        circle = new Circle(centerX, centerY, radius);
        Color color = Color.DARKBLUE;
        circle.setFill(color);
        return circle;
    }

    public Circle getCircle() {
        return circle;
    }

    @Override
    public void random() {
        int randomX = new Random().nextInt(1000);
        int randomY = new Random().nextInt(500);
        int random = new Random().nextInt(Colors.length);
        circle.setFill(Paint.valueOf(Colors[random]));
        circle.setCenterX(randomX);
        circle.setCenterY(randomY);
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

}
