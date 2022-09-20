package com.example.oop1;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    Button CircleRight = new Button("Вправо круг");

    Button CircleLeft = new Button("Влево круг");

    Button PlusRad = new Button("Больше радиус");

    Button MinusRad = new Button("Меньше радиус");

    Button CircleDown = new Button("Вниз круг");

    Button CircleUp = new Button("Вверх круг");
    MyCircle circle = new MyCircle(100,180,180);

    Button TriangleChangeColor = new Button("Изменить цвет треугольника");
    MyTriangle triangle = new MyTriangle(370, 400, 600, 400, 500,600);

    Button RectangleDown = new Button("Вниз прямоугольник");
    Button RectangleUp = new Button("Вверх прямоугольник");
    Button RectangleLeft = new Button("Влево прямоугольник");
    Button RectangleRight = new Button("Вправо прямоугольник");
    MyRectangle rectangle = new MyRectangle(170, 190,700,90);

    Button RandomOfAll = new Button("Рандом всего");


    @Override
    public void start(Stage stage) {

        CircleRight.setTranslateX(20);
        CircleRight.setTranslateY(30);

        CircleLeft.setTranslateX(20);

        CircleDown.setTranslateX(19);
        CircleDown.setTranslateY(-60);

        CircleUp.setTranslateY(-30);
        CircleUp.setTranslateX(20);

        PlusRad.setTranslateX(130);

        MinusRad.setTranslateY(30);
        MinusRad.setTranslateX(130);


        TriangleChangeColor.setTranslateX(280);

        RectangleDown.setTranslateX(440);
        RectangleDown.setTranslateY(-30);

        RectangleUp.setTranslateX(440);
        RectangleUp.setTranslateY(-60);

        RectangleLeft.setTranslateX(440);

        RectangleRight.setTranslateX(440);
        RectangleRight.setTranslateY(30);

        RandomOfAll.setTranslateY(-50);
        RandomOfAll.setTranslateX(130);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(CircleRight);
        stackPane.getChildren().add(CircleLeft);
        stackPane.getChildren().add(MinusRad);
        stackPane.getChildren().add(PlusRad);
        stackPane.getChildren().add(CircleDown);
        stackPane.getChildren().add(CircleUp);
        stackPane.getChildren().add(RandomOfAll);

        stackPane.getChildren().add(TriangleChangeColor);

        stackPane.getChildren().add(RectangleDown);
        stackPane.getChildren().add(RectangleUp);
        stackPane.getChildren().add(RectangleLeft);
        stackPane.getChildren().add(RectangleRight);

        CircleLeft.setOnAction(event -> circle.setCenterX(circle.getCircle().getCenterX() - 10));
        CircleRight.setOnAction(event -> circle.setCenterX(circle.getCircle().getCenterX() + 10));
        MinusRad.setOnAction(event -> circle.setRadius(circle.getCircle().getRadius() - 5));
        PlusRad.setOnAction(event -> circle.setRadius(circle.getCircle().getRadius() + 5));
        CircleDown.setOnAction(event -> circle.setCenterY(circle.getCircle().getCenterY() + 10));
        CircleUp.setOnAction(event -> circle.setCenterY(circle.getCircle().getCenterY() - 10));

        TriangleChangeColor.setOnAction(event -> triangle.setColor());

        RandomOfAll.setOnAction(event -> {
            Shape[] shapes = new Shape[3];
            shapes[0] = circle;
            shapes[1] = triangle;
            shapes[2] = rectangle;

            for (int i = 0; i < 3; i++) {
                shapes[i].random();
            }
        });



        RectangleUp.setOnAction(event -> rectangle.getRectangle().setY(rectangle.getRectangle().getY() - 10));
        RectangleDown.setOnAction(event -> rectangle.getRectangle().setY(rectangle.getRectangle().getY() + 10));
        RectangleLeft.setOnAction(event -> rectangle.getRectangle().setX(rectangle.getRectangle().getX() - 10));
        RectangleRight.setOnAction(event -> rectangle.getRectangle().setX(rectangle.getRectangle().getX() + 10));

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(circle.create());
        anchorPane.getChildren().add(triangle.create());
        anchorPane.getChildren().add(rectangle.create());
        anchorPane.getChildren().add(stackPane);
        AnchorPane.setBottomAnchor(stackPane, 30d);

        Scene scene = new Scene(anchorPane, 1000, 800);
        stage.setTitle("Управление фигурой");
        stage.setScene(scene);
        stage.show();
    }
}
