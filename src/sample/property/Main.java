package sample.property;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        stage.setTitle("property");

        Label data = new Label("");
        Label listener = new Label("");

        Test test = new Test("");
        test.textProperty().addListener((observableValue, s, t1) ->
        {
            data.setText(test.getText());
            listener.setText("new data : "+t1+", old data : "+s);
        });

        TextField textField = new TextField();
        textField.setPromptText("write something");

        Button button = new Button("submit");
        button.setOnAction(actionEvent ->
        {
            String text = textField.getText();
            textField.clear();
            test.setText(text);
        });



        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.getChildren().addAll(textField,button,data,listener);
        Scene scene = new Scene(vBox,300,300);

        stage.setScene(scene);
        stage.show();
    }
}
