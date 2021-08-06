package sample.multipleStage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage stage;
    Button button;
    Scene scene;
    StackPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        button = new Button("display alert window");
        layout = new StackPane();
        scene = new Scene(layout,800,400);

        stage.setTitle("multiple stage");
        stage.setScene(scene);

        button.setOnAction(actionEvent -> AlertBox.showAlert("this is alert page","alert"));

        layout.getChildren().add(button);

        stage.show();
    }
}
