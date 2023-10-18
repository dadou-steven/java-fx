package com.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AutresMod extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage mainStage) {
        mainStage.setTitle("Hello World Program (Anon)");

        Button btn = new Button();
        btn.setText("Print Hello World ! ");

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World !");
            }
        };
        btn.setOnAction(handler);

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 400, 300);
        mainStage.setScene(scene);
        mainStage.show();
    }
}
