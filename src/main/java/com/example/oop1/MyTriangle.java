package com.example.oop1;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;
import java.util.Random;
public class MyTriangle implements Shape {

    private double X1;
    private double Y1;
    private double X2;
    private double Y2;
    private double X3;
    private double Y3;
    private Polygon triangle;
    private  String[] Colors = new String[] {"BLUE","RED","YELLOW","BLACK","GREEN","DARKRED","MAGENTA","CYAN","WHITE","GRAY","PINK","ORANGE"};
    public MyTriangle(double X1, double Y1, double X2, double Y2,double X3,double Y3) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
        this.X3 = X3;
        this.Y3 = Y3;
    }

    @Override
    public void random() {
        int randomX = new Random().nextInt(1000);
        int randomY = new Random().nextInt(500);
        int random = new Random().nextInt(Colors.length);
        triangle.setFill(Paint.valueOf(Colors[random]));
        triangle.setLayoutX(randomX);
        triangle.setLayoutY(randomY);
    }

    public Polygon create(){
        int random = new Random().nextInt(Colors.length);
        triangle = new Polygon();
        triangle.getPoints().addAll(X1,Y1,X2,Y2,X3,Y3);
        triangle.setFill(Paint.valueOf(Colors[random]));
        return triangle;
    }
    public Polygon getPolygon() {
        return triangle;
    }
    public void setColor() {
        int random = new Random().nextInt(Colors.length);
        triangle.setFill(Paint.valueOf(Colors[random]));
    }
}
