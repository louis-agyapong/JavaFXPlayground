package com.example.javafxplayground;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    Stage window;
    Scene scene;
    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("ComboBox Demo");

        Button button = new Button("Submit");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Good Will Hunting", "St. Vincent",
                "Blackhat", "Game of Thrones", "The Firm");

        comboBox.setEditable(true);

        comboBox.setPromptText("What is your favorite movie");

        button.setOnAction(e -> printMovie());



        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(comboBox, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }

    private void printMovie() {
        System.out.println(comboBox.getValue());
    }


}