package sample.twoScene;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage stage;

    Button buttonFirst,buttonSecond;
    VBox layoutFirst,layoutSecond;
    Scene first,second;
    Label labelFirst,labelSecond;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;

        labelFirst = new Label("first scene");
        labelSecond = new Label("second scene");


        buttonFirst = new Button("go to second scene");
        buttonFirst.setOnAction(e -> stage.setScene(second));
        buttonSecond = new Button("go to first scene");
        buttonSecond.setOnAction(e -> stage.setScene(first));

        layoutFirst = new VBox();
        layoutFirst.getChildren().addAll(labelFirst,buttonFirst);
        layoutSecond = new VBox();
        layoutSecond.getChildren().addAll(labelSecond,buttonSecond);

        first = new Scene(layoutFirst,400,200);
        second = new Scene(layoutSecond,500,200);

        stage.setScene(first);
        stage.show();

    }
}
