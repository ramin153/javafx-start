package sample.embeddingLayouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        HBox top = new HBox();

        Button buttonTop1 = new Button("top 1");
        Button buttonTop2 = new Button("top 2");
        Button buttonTop3 = new Button("top 3");
        Button buttonTop4 = new Button("top 4");

        top.getChildren().addAll(buttonTop1,buttonTop2,buttonTop3,buttonTop4);




        VBox left = new VBox();

        Button buttonLeft1 = new Button("Left 1");
        Button buttonLeft2 = new Button("Left 2");
        Button buttonLeft3 = new Button("Left 3");
        Button buttonLeft4 = new Button("Left 4");

        left.getChildren().addAll(buttonLeft1,buttonLeft2,buttonLeft3,buttonLeft4);




        VBox right = new VBox();

        Button buttonRight1 = new Button("Right 1");
        Button buttonRight2 = new Button("Right 2");
        Button buttonRight3 = new Button("Right 3");
        Button buttonRight4 = new Button("Right 4");

        right.getChildren().addAll(buttonRight1,buttonRight2,buttonRight3,buttonRight4);



        HBox bottom = new HBox();

        Button buttonBottom1 = new Button("Bottom 1");
        Button buttonBottom2 = new Button("Bottom 2");
        Button buttonBottom3 = new Button("Bottom 3");
        Button buttonBottom4 = new Button("Bottom 4");

        bottom.getChildren().addAll(buttonBottom1,buttonBottom2,buttonBottom3,buttonBottom4);



        StackPane center = new StackPane();

        Button buttonCenter = new Button("center");

        center.getChildren().addAll(buttonCenter);

        BorderPane layout = new BorderPane();
        layout.setBottom(bottom);
        layout.setCenter(center);
        layout.setLeft(left);
        layout.setRight(right);
        layout.setTop(top);

        Scene scene = new Scene(layout,800,600);


        stage.setScene(scene);
        stage.setTitle("embedding layout");
        stage.show();


    }
}
