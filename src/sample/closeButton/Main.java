package sample.closeButton;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage stage;
    Button button;
    Scene scene;
    VBox layout;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        button = new Button("close");
        layout = new VBox();
        scene = new Scene(layout,800,400);


        stage.setTitle("close button");
        stage.setScene(scene);

        stage.setOnCloseRequest(actionEvent -> {
            actionEvent.consume();//it won't let action that would happen normally to continue
            close();

        });
        button.setOnAction(actionEvent -> close());


        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(button);

        stage.show();
    }

    private void close()
    {
        boolean close = ConfirmBox.showAlert("do you want to close","close");

        if (close)
        {
            stage.close();
        }
    }

}
