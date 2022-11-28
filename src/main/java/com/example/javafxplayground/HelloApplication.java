package com.example.javafxplayground;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    Stage window;
    Scene scene;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("JavaFX - Title");

        // Form
        TextField nameInput = new TextField();
        Button button = new Button("Click me");
        Label label = new Label();
        button.setOnAction(e -> {
            if (isInt(nameInput, nameInput.getText())) {
                label.setText("User is " + nameInput.getText());
                nameInput.clear();
            } else {
                label.setText("User is " + nameInput.getText());
            }

        });

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, label, button);


        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }


    private boolean isInt(TextField input, String message) {
        try {
            int age = Integer.parseInt(input.getText());
            System.out.println("User is " + age);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error: " + message + " is not a number.");
            return false;
        }
    }

}