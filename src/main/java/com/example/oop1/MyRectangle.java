package com.example.oop1;


import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class MyRectangle implements Shape {
    private Rectangle rectangle;
    private double X;
    private double Y;
    private double translateX;
    private double translateY;

    private  String[] Colors = new String[] {"BLUE","RED","YELLOW","BLACK","GREEN","DARKRED","MAGENTA","CYAN","WHITE","GRAY","PINK","ORANGE"};

    public MyRectangle(double X, double Y, double translateX, double translateY) {
        this.X = X;
        this.Y = Y;
        this.translateX = translateX;
        this.translateY = translateY;
    }

    @Override
    public void random() {
        int randomX = new Random().nextInt(1000);
        int randomY = new Random().nextInt(500);
        int random = new Random().nextInt(Colors.length);
        rectangle.setFill(Paint.valueOf(Colors[random]));
        rectangle.setTranslateX(randomX);
        rectangle.setTranslateY(randomY);
    }

    Rectangle create() {
        rectangle = new Rectangle(X, Y);
        rectangle.setTranslateX(translateX);
        rectangle.setTranslateY(translateY);
        Color color = Color.DARKRED;
        rectangle.setFill(color);
        return rectangle;
    }

    Rectangle getRectangle() {
        return rectangle;
    }
}