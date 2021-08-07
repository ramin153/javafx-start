package sample.confirmBox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage stage;
    Button button;
    Scene scene;
    VBox layout;
    Label label;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        button = new Button("display alert window");
        layout = new VBox();
        scene = new Scene(layout,800,400);
        label = new Label("");

        stage.setTitle("multiple stage");
        stage.setScene(scene);

        button.setOnAction(actionEvent -> {
            String confirm = ConfirmBox.showAlert("this is confirm page","confirm");
            label.setText(confirm);

        });


        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(button,label);

        stage.show();
    }
}
