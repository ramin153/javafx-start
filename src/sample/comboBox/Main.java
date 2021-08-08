package sample.comboBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("combo box");
        Label label = new Label();
        ComboBox<String> comboBox = new ComboBox<>();

        comboBox.getItems().addAll("first","second","third");
        //comboBox.setPromptText("select");//hint , when we use editable it won't affect the combo box
        comboBox.setEditable(true);// you can write what you want and the value we inserted into combo box will be like helper value
        comboBox.setOnAction(actionEvent -> label.setText(comboBox.getValue()));


        VBox vBox = new VBox( 20 );
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.getChildren().addAll(comboBox,label);

        Scene scene = new Scene(vBox,300,300);
        stage.setScene(scene);
        stage.show();
    }
}
