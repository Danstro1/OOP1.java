package com.example.oop1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Random;

public class HelloApplication extends Application {

     int min = 2;
     int max = 5;
     int random = (int) Math.floor(Math.random() * (max - min + 1) + min);

    MyCircle[] circles = new MyCircle[random + 1];
    MyRectangle[] rectangles = new MyRectangle[random + 1];
    MyTriangle[] triangles = new MyTriangle[random + 1];
    private final String[] Colors = new String[] {"BLUE","RED","YELLOW","BLACK","GREEN","DARKRED","MAGENTA","CYAN","GRAY","PINK","ORANGE"};

    int i = 0;
    AnchorPane anchorPane = new AnchorPane();
    MyCircle circle = new MyCircle(1,2,3);

    Button RandomOfCircle = new Button("Сгенерировать рандом круги");

    Button RandomCircleRadius = new Button("Рандом радиус кругов");

    Button Rectangle = new Button("Прямоугольник");

    Button Circle = new Button("Круг");

    Button Triangle = new Button("Треугольник");

    MyTriangle triangle = new MyTriangle(1, 1, 1, 1, 1,1);

    Button RandomOfTriangle = new Button("Сгенерировать рандом треугольники");
    MyRectangle rectangle = new MyRectangle(1, 1,1,1);
    Button RectangleRandomMove = new Button("Переместить прямоугольники");

    Button CircleRandomMove = new Button("Переместить круги");

    Button TriangleRandomMove = new Button("Переместить треугольники");
    Button Back = new Button("Назад");

    Button CreateRectangle = new Button("Создать прямоугольник");

    Button CreateCircle = new Button("Создать круг");

    Button CreateTriangle = new Button("Создать треугольник");

    Button ShowHideTriangles = new Button("Показать/Скрыть");
    
    Button ShowHideCircles = new Button("Показать/Скрыть");
    Button ShowHideRectangles = new Button("Показать/Скрыть");
    Button DeleteRectangle = new Button("Удалить прямоугольники");
    Button DeleteCircle = new Button("Удалить круги");
    Button DeleteTriangle = new Button("Удалить треугольники");

    Button ChangeTriangleColor = new Button("Изменить цвет треугольников");
    Button RandomOfRectangle = new Button("Сгенерировать рандом прямоугольник");



    @Override
    public void start(Stage stage) {
        DeleteCircle.setTranslateY(30);
        DeleteRectangle.setTranslateY(30);
        DeleteTriangle.setTranslateY(30);
        DeleteTriangle.setTranslateX(15);
        DeleteCircle.setTranslateX(15);
        DeleteRectangle.setTranslateX(15);

        RandomCircleRadius.setTranslateX(220);
        RandomCircleRadius.setTranslateY(-30);
        RandomOfCircle.setTranslateY(-30);
        RandomOfCircle.setTranslateX(15);
        ShowHideCircles.setTranslateX(400);
        ShowHideCircles.setTranslateY(-30);
        RectangleRandomMove.setTranslateX(220);
        RandomOfRectangle.setTranslateY(-30);
        RandomOfRectangle.setTranslateX(15);
        ShowHideRectangles.setTranslateX(400);
        ShowHideRectangles.setTranslateY(-30);
        Rectangle.setTranslateX(400);
        Triangle.setTranslateX(100);
        Circle.setTranslateX(250);
        CreateRectangle.setTranslateX(15);

        CreateCircle.setTranslateX(15);
        CircleRandomMove.setTranslateX(220);

        CreateTriangle.setTranslateX(15);
        RandomOfTriangle.setTranslateY(-30);
        RandomOfTriangle.setTranslateX(15);
        ChangeTriangleColor.setTranslateX(230);
        ChangeTriangleColor.setTranslateY(-30);
        TriangleRandomMove.setTranslateX(230);
        TriangleRandomMove.setTranslateY(0);
        ShowHideTriangles.setTranslateX(400);
        ShowHideTriangles.setTranslateY(-30);

        Back.setTranslateY(0);
        Back.setTranslateX(600);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(Triangle);
        stackPane.getChildren().add(Circle);
        stackPane.getChildren().add(Rectangle);

        Rectangle.setOnAction(event -> {
            stackPane.getChildren().add(CreateRectangle);
            stackPane.getChildren().add(ShowHideRectangles);
            stackPane.getChildren().add(DeleteRectangle);
            stackPane.getChildren().add(RandomOfRectangle);
            stackPane.getChildren().add(RectangleRandomMove);
            stackPane.getChildren().add(Back);
            stackPane.getChildren().remove(Circle);
            stackPane.getChildren().remove(Triangle);
            stackPane.getChildren().remove(Rectangle);
        });
        Circle.setOnAction(event -> {
            stackPane.getChildren().add(CircleRandomMove);
            stackPane.getChildren().add(CreateCircle);
            stackPane.getChildren().add(ShowHideCircles);
            stackPane.getChildren().add(RandomCircleRadius);
            stackPane.getChildren().add(RandomOfCircle);
            stackPane.getChildren().add(DeleteCircle);
            stackPane.getChildren().add(Back);
            stackPane.getChildren().remove(Circle);
            stackPane.getChildren().remove(Triangle);
            stackPane.getChildren().remove(Rectangle);
        });
        Triangle.setOnAction(event -> {
            stackPane.getChildren().add(CreateTriangle);
            stackPane.getChildren().add(ShowHideTriangles);
            stackPane.getChildren().add(RandomOfTriangle);
            stackPane.getChildren().add(DeleteTriangle);
            stackPane.getChildren().add(TriangleRandomMove);
            stackPane.getChildren().add(ChangeTriangleColor);
            stackPane.getChildren().add(Back);
            stackPane.getChildren().remove(Circle);
            stackPane.getChildren().remove(Triangle);
            stackPane.getChildren().remove(Rectangle);
        });
        Back.setOnAction(event -> {
            stackPane.getChildren().add(Triangle);
            stackPane.getChildren().add(Circle);
            stackPane.getChildren().add(Rectangle);
            stackPane.getChildren().remove(ShowHideTriangles);
            stackPane.getChildren().remove(RandomOfTriangle);
            stackPane.getChildren().remove(DeleteTriangle);
            stackPane.getChildren().remove(TriangleRandomMove);
            stackPane.getChildren().remove(ChangeTriangleColor);
            stackPane.getChildren().remove(ShowHideCircles);
            stackPane.getChildren().remove(RandomCircleRadius);
            stackPane.getChildren().remove(RandomOfCircle);
            stackPane.getChildren().remove(DeleteCircle);
            stackPane.getChildren().remove(ShowHideRectangles);
            stackPane.getChildren().remove(DeleteRectangle);
            stackPane.getChildren().remove(RandomOfRectangle);
            stackPane.getChildren().remove(RectangleRandomMove);
            stackPane.getChildren().remove(Back);
            stackPane.getChildren().remove(CreateTriangle);
            stackPane.getChildren().remove(CreateCircle);
            stackPane.getChildren().remove(CreateRectangle);
            stackPane.getChildren().remove(CircleRandomMove);
            for (int i = 0; i <= random; i++) {
                try {
                    anchorPane.getChildren().remove(circles[i].getCircle());
                    circles[i] = null;
                }catch(Exception ignored){}
                try {
                    anchorPane.getChildren().remove(rectangles[i].getRectangle());
                    rectangles[i] = null;
                }catch(Exception ignored){}
                try {
                    anchorPane.getChildren().remove(triangles[i].getTriangle());
                    triangles[i] = null;
                }catch(Exception ignored){}

            }
            try {
                anchorPane.getChildren().remove(circle.getCircle());
                circle = null;
            }catch(Exception ignored){}
            try {
                anchorPane.getChildren().remove(rectangle.getRectangle());
                rectangle = null;
            }catch(Exception ignored){}
            try {
                anchorPane.getChildren().remove(triangle.getTriangle());
                triangle = null;
            }catch(Exception ignored){}
            if (i == 1) {
            i -= 1;
            }
        });
        CreateCircle.setOnAction(event -> {
            if (i == 0) {
                int randomX = new Random().nextInt(1000);
                int randomY = new Random().nextInt(500);
                int randomRadius = new Random().nextInt(70);
                circle = new MyCircle(randomRadius, randomX, randomY);
                circle.create(anchorPane);
                i += 1;
            }
        });

        CreateTriangle.setOnAction(event -> {
            if (i == 0) {
                int X1 = new Random().nextInt(1000);
                int Y1 = new Random().nextInt(500);
                int X2 = new Random().nextInt(1000);
                int Y2 = new Random().nextInt(500);
                int X3 = new Random().nextInt(1000);
                int Y3 = new Random().nextInt(500);
                triangle = new MyTriangle(X1, Y1, X2, Y2, X3, Y3);
                triangle.create(anchorPane);
                i += 1;
            }
        });
        CreateRectangle.setOnAction(event -> {
            if (i == 0) {
                int x = new Random().nextInt(500);
                int y = new Random().nextInt(250);
                int translateX = new Random().nextInt(500);
                int translateY = new Random().nextInt(250);
                rectangle = new MyRectangle(x, y, translateX, translateY);
                rectangle.create(anchorPane);
                i += 1;
            }
        });

        ChangeTriangleColor.setOnAction(event -> {
            for (MyTriangle value : triangles) {
                int random = new Random().nextInt(Colors.length);
                if (value != null) {
                    try {
                        value.RandomTriangleColor(random);
                    }catch (Exception ignored){}
                }
                else{
                    try{
                        triangle.RandomTriangleColor(random);
                    }catch (Exception ignored){}
                    }
                }
        });
        CircleRandomMove.setOnAction(event -> {
                for (MyCircle value : circles) {
                    if (value != null) {
                        value.CircleRandM();
                    } else {
                        try {
                            circle.CircleRandM();
                        } catch (NullPointerException ignored) {}
                    }
                }
        });

        RectangleRandomMove.setOnAction(event -> {
            for (MyRectangle value : rectangles) {
                if (value != null) {
                    value.RectanglesRandM();
                } else {
                    try {
                        rectangle.RectanglesRandM();
                    } catch (NullPointerException ignored) {}
                }
            }
        });
        
        TriangleRandomMove.setOnAction(event -> {
            for (MyTriangle value : triangles) {
                if (value != null) {
                    value.TrianglesRandM();
                } else {
                    try {
                        triangle.TrianglesRandM();
                    } catch (NullPointerException ignored) {}
                }
            }
        });

        RandomCircleRadius.setOnAction(event -> {
            for (MyCircle value : circles) {
                if (value != null) {
                    value.RandomRadius();
                } else {
                    try {
                        circle.RandomRadius();
                    } catch (NullPointerException ignored) {}
                }
            }
        });

        DeleteRectangle.setOnAction(event -> {
            for (int i = 0; i <= random; i++) {
                try {
                    anchorPane.getChildren().remove(rectangles[i].getRectangle());
                    rectangles[i] = null;
                }catch(Exception ignored){}
            }
            try {
                anchorPane.getChildren().remove(rectangle.getRectangle());
                rectangle = null;
            }catch(Exception ignored){}
            if (i == 1) {
                i -= 1;
            }
        });
        DeleteCircle.setOnAction(event -> {
                for (int i = 0; i <= random; i++) {
                    try {
                        anchorPane.getChildren().remove(circles[i].getCircle());
                        circles[i] = null;
                    }catch(Exception ignored){}
                }
                try {
                    anchorPane.getChildren().remove(circle.getCircle());
                    circle = null;
                }catch(Exception ignored){}
                if (i == 1) {
                    i -= 1;
                }
        });

        DeleteTriangle.setOnAction(event -> {
            for (int i = 0; i <= random; i++) {
                try {
                    anchorPane.getChildren().remove(triangles[i].getTriangle());
                    triangles[i] = null;
                } catch (Exception ignored) {}
            }
            try{
                anchorPane.getChildren().remove(triangle.getTriangle());
                triangle = null;
            }catch (Exception ignored) {}
            if (i == 1) {
                i -= 1;
            }
        });

        RandomOfRectangle.setOnAction(event -> {
            if (rectangles[random - 1] == null) {
                for (int i = 0; i < random; i++) {
                    int x = new Random().nextInt(500);
                    int y = new Random().nextInt(250);
                    int translateX = new Random().nextInt(500);
                    int translateY = new Random().nextInt(250);
                    rectangles[i] = new MyRectangle(x, y, translateX, translateY);
                    rectangles[i].create(anchorPane);
                }
                rectangles[random] = rectangle;
            }
        });
        RandomOfTriangle.setOnAction(event -> {
            if (triangles[random - 1] == null) {
                for (int i = 0; i < random; i++) {
                    int X1 = new Random().nextInt(1000);
                    int Y1 = new Random().nextInt(500);
                    int X2 = new Random().nextInt(1000);
                    int Y2 = new Random().nextInt(500);
                    int X3 = new Random().nextInt(1000);
                    int Y3 = new Random().nextInt(500);
                    triangles[i] = new MyTriangle(X1, Y1, X2, Y2, X3, Y3);
                    triangles[i].create(anchorPane);
                }
                triangles[random] = triangle;
            }
        });
        RandomOfCircle.setOnAction(event -> {
            if (circles[random - 1] == null) {
                for (int i = 0; i < random; i++) {
                    int randomX = new Random().nextInt(1000);
                    int randomY = new Random().nextInt(500);
                    int randomRadius = new Random().nextInt(70);
                    circles[i] = new MyCircle(randomRadius, randomX, randomY);
                    circles[i].create(anchorPane);
                }
                circles[random] = circle;
            }
        });
        ShowHideRectangles.setOnAction(event -> {
            for (MyRectangle value : rectangles) {
                if (value != null) {
                    value.show(anchorPane);
                } else {
                    try {
                        rectangle.show(anchorPane);
                    } catch (Exception ignored) {}
                }
            }
        });
        ShowHideCircles.setOnAction(event -> {
           for (MyCircle value : circles) {
               if (value != null) {
                   value.show(anchorPane);
               } else {
                   try {
                       circle.show(anchorPane);
                   } catch (Exception ignored) {}
               }
           }
        });
        ShowHideTriangles.setOnAction(event -> {
            for (MyTriangle value : triangles) {
                if (value != null) {
                    value.show(anchorPane);
                } else {
                    try {
                        triangle.show(anchorPane);
                    } catch (Exception ignored) {}
                }
            }
        });

        anchorPane.getChildren().add(stackPane);
        anchorPane.setStyle("-fx-background-color: white;");
        AnchorPane.setBottomAnchor(stackPane, 30d);

        Scene scene = new Scene(anchorPane, 1000, 600);
        stage.setTitle("Управление фигурой");
        stage.setScene(scene);
        stage.show();
    }
}
