package com.intissar.o;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Producto producto = new Producto();
        Scene scene = new Scene(producto, 500, 150);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);

        primaryStage.setTitle("Producto Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
