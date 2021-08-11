package sample.inputField;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("input field");

        VBox layout = new VBox();
        TextField ageInput = new TextField();
        ageInput.setPromptText("enter age");
        Label valid = new Label();
        Button submit = new Button("submit");

        submit.setOnAction(actionEvent ->
        {
            if (inputInt(ageInput))
            {
                valid.setText("your input  was : " + (ageInput.getText())  );
            }else
            {
                valid.setText("your input was invalid ");
            }
        });

        layout.getChildren().addAll(ageInput,valid,submit);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(100,40,10,40));
        layout.setSpacing(5);


        Scene scene = new Scene(layout,400,300);

        stage.setScene(scene);
        stage.show();


    }

    private boolean inputInt(TextField ageInput) {
        try {
            int check = Integer.parseInt(ageInput.getText());
            if (check <= 0)
                throw new Exception("most be positive");
            return true;
        }catch (Exception e)
        {

            return false;
        }
    }
}
