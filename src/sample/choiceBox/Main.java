package sample.choiceBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("choice box");
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("1","2","3","4","5");
        choiceBox.setValue("1");//default value

        Label label = new Label("1");

        choiceBox.getSelectionModel().selectedIndexProperty().addListener( (observableValue, number, t1) -> {

           String selectItem = choiceBox.getItems().get(t1.intValue());
           label.setText(selectItem);

        });

        VBox vBox = new VBox(20);
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.getChildren().addAll(choiceBox,label);

        Scene scene = new Scene(vBox,300,300);


        stage.setScene(scene);
        stage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}
