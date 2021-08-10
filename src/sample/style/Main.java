package sample.style;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("style");
        VBox vBox = new VBox(12);
        vBox.setPadding(new Insets(12,12,12,12));
        Button button = new Button("button");
        Label   label = new Label("normal"),
                label_class = new Label("class"),
                label_Id = new Label("Id"),
                label_inlineStyle = new Label("inline");



        vBox.getChildren().addAll(label,label_class,label_Id,label_inlineStyle,button);

        Scene scene = new Scene(vBox,400,400);
        scene.getStylesheets().add("/sample/style/style.css");
        label_class.getStyleClass().add("label-class");
        label_Id.setId("label-id");
        label_inlineStyle.setStyle(" -fx-text-fill: rgb(165, 66, 62);");
        stage.setScene(scene);
        stage.show();


    }
}
