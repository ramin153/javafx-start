package sample.confirmBox;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicReference;

public class ConfirmBox {

    public static String showAlert(String text,String title)
    {

        AtomicReference<String> result = new AtomicReference<>("0");
        Stage stage = new Stage();
        Button one = new Button("1");
        Button two = new Button("2");

        Label label = new Label(text);
        VBox layout = new VBox();
        layout.getChildren().addAll(label,one,two);
        Scene scene = new Scene(layout,400,200);

        stage.setTitle(title);
        stage.setMinWidth(300);
        stage.initModality(Modality.APPLICATION_MODAL);//it won't let you interact with other stage
        stage.setScene(scene);

        one.setOnAction( actionEvent -> {
            stage.close();
            result.set("1");
                });

        two.setOnAction( actionEvent -> {
            stage.close();
            result.set("2");
        });


        stage.showAndWait();
        return result.get();
    }
}
