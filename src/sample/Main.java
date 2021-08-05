package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.EventListener;

public class Main extends Application implements EventHandler<ActionEvent> {

    Button button;


    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Hello World");

        StackPane layout = new StackPane();
        button = new Button("hello world");
        button.setOnAction(this);
        layout.getChildren().add(button);

        Scene scene = new Scene(layout,400,200);

        primaryStage.setScene(scene);


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button)
        {
            System.out.println("button clicked");
        }
    }
}
