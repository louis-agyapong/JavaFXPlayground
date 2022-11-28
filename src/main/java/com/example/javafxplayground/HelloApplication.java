package com.example.javafxplayground;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
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
        window.setTitle("Bucky's Meat Subs");

        // Checkboxes
        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        // getItems returns the ObservableList object which you can add items to.
        choiceBox.getItems().addAll("Apple", "Strawberry", "Banana", "Orange", "Pineapple", "Watermelon", "Guava");
        // Set a default value
        choiceBox.setValue("Apple");

        Button button = new Button("Click me");
        button.setOnAction(e -> getChoice(choiceBox));

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);


        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }

    private void getChoice(ChoiceBox<String> choiceBox) {
        String fruit = choiceBox.getValue();
        System.out.println(fruit);
    }


}