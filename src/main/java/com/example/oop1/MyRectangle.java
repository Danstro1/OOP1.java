package com.example.oop1;


import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class MyRectangle  {
    private Rectangle rectangle;

    private boolean isVisible = true;
    private double X;
    private double Y;
    private double translateX;
    private double translateY;
    private int min = 2;
    private int max = 5;
    private int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
    private Rectangle[] rectangles = new Rectangle[random + 1];

    private  String[] Colors = new String[] {"BLUE","RED","YELLOW","BLACK","GREEN","DARKRED","MAGENTA","CYAN","GRAY","PINK","ORANGE"};

    public MyRectangle(double X, double Y, double translateX, double translateY) {
        this.X = X;
        this.Y = Y;
        this.translateX = translateX;
        this.translateY = translateY;
    }
    Rectangle getRectangle() {
        return rectangle;
    }
    public void RectanglesRandM() {
        int randomMove1 = (int) Math.floor(Math.random() * 41 - 20);
        int randomMove2 = (int) Math.floor(Math.random() * 41 - 20);
        try {
            rectangle.setTranslateY(rectangle.getTranslateY() + randomMove1);
            rectangle.setTranslateX(rectangle.getTranslateX() + randomMove2);
        } catch (NullPointerException e) {}
    }
    public void show(AnchorPane anchorPane) {
        if (isVisible == false) {
            anchorPane.getChildren().add(rectangle);
            isVisible = !isVisible;
        } else {
            anchorPane.getChildren().remove(rectangle);
            isVisible = !isVisible;
        }
    }
    public void create(AnchorPane anchorPane){
        int random = new Random().nextInt(11);
        rectangle = new Rectangle(X, Y, translateX, translateY);
        rectangle.setFill(Paint.valueOf(Colors[random]));
        anchorPane.getChildren().add(rectangle);
    }
}