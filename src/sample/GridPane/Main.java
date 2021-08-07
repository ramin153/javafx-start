package sample.GridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {


        Label username = new Label("username");
        Label password = new Label("password");

        TextField usernameInput = new TextField("username");//default text
        TextField passwordInput = new TextField();
        passwordInput.setPromptText("password");//hint text

        Button submit = new Button("submit");

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(8,8,8,8));
        layout.setVgap(12);//vertical space between item
        layout.setHgap(8);// horizontal space between item
        layout.getChildren().addAll(username,password,usernameInput,passwordInput,submit);
        layout.setConstraints(username,0,0);
        layout.setConstraints(password,0,1);
        layout.setConstraints(usernameInput,1,0);
        layout.setConstraints(passwordInput,1,1);
        layout.setConstraints(submit,1,2);

        Scene scene = new Scene(layout,600,400);
        stage.setScene(scene);
        stage.setTitle("grid pane");
        stage.show();
    }
}
