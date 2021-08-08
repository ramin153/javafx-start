package sample.checkBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("check box");
        Button button = new Button("show selected checkBox");
        Label label = new Label();
        CheckBox first = new CheckBox("first");
        CheckBox second = new CheckBox("second");

        VBox layout = new VBox(12);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(first,second,button,label);

        button.setOnAction(actionEvent -> {
            String message = createMassage(first,second);
            label.setText(message);
        });

        Scene scene = new Scene(layout,300,300);
        stage.setScene(scene);
        stage.show();

    }

    private String createMassage(CheckBox first, CheckBox second) {
        String result = "";
        if (first.isSelected() && second.isSelected())
        {
            result = "first and second are selected";
        }else if(first.isSelected())
        {
            result = "first is selected";
        }else if(second.isSelected())
        {
            result = "second is selected";
        }else
        {
            result = "nothing is selected";
        }

        return result;

    }

    public static void main(String[] args) {
        launch(args);
    }
}
