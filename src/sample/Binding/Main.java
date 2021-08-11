package sample.Binding;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("binding");
        TextField textField = new TextField();
        textField.setPromptText("write something");

        Label label = new Label( "" );
        label.textProperty().bind(textField.textProperty());

        VBox vBox = new VBox(20);
        vBox.setPadding(new Insets(20));

        vBox.getChildren().addAll(textField,label);

        Scene scene = new Scene(vBox,300,300);

        stage.setScene(scene);
        stage.show();
    }
}
