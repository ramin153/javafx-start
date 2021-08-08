package sample.listView;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("list view");

        Label label = new Label();

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("first","second","third");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView.getSelectionModel().selectedIndexProperty().addListener( (observableValue, number, t1) -> {

            ObservableList<String> selectItem = listView.getSelectionModel().getSelectedItems();
            String result ="";
            for (String i : selectItem)
            {
                result+=i +" ";
            }
            label.setText(result);

        });



        VBox vBox = new VBox(20);
        vBox.getChildren().addAll(listView,label);
        vBox.setPadding(new Insets(10,10,10,10));

        Scene scene = new Scene(vBox,300,300);
        stage.setScene(scene);



        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
