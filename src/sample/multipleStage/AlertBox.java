package sample.multipleStage;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    public static void showAlert(String text,String title)
    {
        Stage stage = new Stage();
        Button button = new Button("close");
        Label label = new Label(text);
        VBox layout = new VBox();
        layout.getChildren().addAll(button,label);
        Scene scene = new Scene(layout,400,200);

        stage.setTitle(title);
        stage.setMinWidth(300);
        stage.initModality(Modality.APPLICATION_MODAL);//it won't let you interact with other stage
        stage.setScene(scene);

        button.setOnAction( actionEvent -> stage.close());

        stage.showAndWait();

    }
}
