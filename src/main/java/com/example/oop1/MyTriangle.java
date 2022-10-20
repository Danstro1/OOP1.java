package com.example.oop1;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

import java.util.Random;
public class MyTriangle {

    private double X1;
    private double Y1;
    private double X2;
    private double Y2;
    private double X3;
    private double Y3;

    private  boolean isVisible = true;
    private Polygon triangle;
    private int min = 2;
    private int max = 5;
    private int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
    private Polygon[] triangles = new Polygon[random + 1];
    private  String[] Colors = new String[] {"BLUE","RED","YELLOW","BLACK","GREEN","DARKRED","MAGENTA","CYAN","GRAY","PINK","ORANGE"};
    public MyTriangle(double X1, double Y1, double X2, double Y2,double X3,double Y3) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
        this.X3 = X3;
        this.Y3 = Y3;
    }
    public Polygon getPolygon() {
        return triangle;
    }

    Polygon getTriangle() {
        return triangle;
    }
    public void TrianglesRandM() {
        int randomMove1 = (int) Math.floor(Math.random() * 41 - 20);
        int randomMove2 = (int) Math.floor(Math.random() * 41 - 20);
        try {
            triangle.setTranslateY(triangle.getTranslateY() + randomMove1);
            triangle.setTranslateX(triangle.getTranslateX() + randomMove2);
        } catch (NullPointerException e) {}
    }
    public void RandomTriangleColor(int random) {
        try {
            triangle.setFill(Paint.valueOf(Colors[random]));
        } catch (NullPointerException e) {}
    }
    public void show(AnchorPane anchorPane) {
        if (isVisible == false) {
            anchorPane.getChildren().add(triangle);
            isVisible = !isVisible;
        } else {
            anchorPane.getChildren().remove(triangle);
            isVisible = !isVisible;
        }
    }
    public void create(AnchorPane anchorPane){
        int random = new Random().nextInt(11);
        triangle = new Polygon(X1, Y1, X2, Y2, X3, Y3);
        triangle.setFill(Paint.valueOf(Colors[random]));
        anchorPane.getChildren().add(triangle);
    }
}
