package com.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PrintMessage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    // méthodes

    public void start(Stage mainStage) {
        mainStage.setTitle("Apps Inc");

        Button btn = new Button();
        btn.setText("Print message !");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Bienvenue, nous sommes ravis que vous vous joigniez à nous");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 300);
        mainStage.setScene(scene);
        mainStage.show();
        }
    }
