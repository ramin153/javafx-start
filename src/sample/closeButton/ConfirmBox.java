package sample.closeButton;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicReference;

public class ConfirmBox {

    public static boolean showAlert(String text,String title)
    {

        AtomicReference<Boolean> result = new AtomicReference<>(false);
        Stage stage = new Stage();
        Button yes = new Button("yes");
        Button no = new Button("no");

        Label label = new Label(text);
        VBox layout = new VBox();
        layout.getChildren().addAll(label,yes,no);
        Scene scene = new Scene(layout,400,200);

        stage.setTitle(title);
        stage.setMinWidth(300);
        stage.initModality(Modality.APPLICATION_MODAL);//it won't let you interact with other stage
        stage.setScene(scene);

        yes.setOnAction( actionEvent -> {
            stage.close();
            result.set(true);
                });

        no.setOnAction( actionEvent -> {
            stage.close();
            result.set(false);
        });


        stage.showAndWait();
        return result.get();
    }
}
