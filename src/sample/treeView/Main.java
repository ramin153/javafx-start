package sample.treeView;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("tree view");

        Label label = new Label();

        TreeItem<String> root,
                one,one_one,one_two,one_three,
                two,two_one,two_two,two_three,
                three,three_one,three_two,three_three;

        root = new TreeItem<>("root");
        one = new TreeItem<>("1");
        one_one = new TreeItem<>("1-1");
        one_two = new TreeItem<>("1-2");
        one_three = new TreeItem<>("1-3");
        two = new TreeItem<>("2");
        two_one = new TreeItem<>("2-1");
        two_two = new TreeItem<>("2-2");
        two_three = new TreeItem<>("2-3");
        three = new TreeItem<>("3");
        three_one = new TreeItem<>("3-1");
        three_two = new TreeItem<>("3-2");
        three_three = new TreeItem<>("3-3");

        root.getChildren().addAll(one,two,three);
        one.getChildren().addAll(one_one,one_two,one_three);
        two.getChildren().addAll(two_one,two_two,two_three);
        three.getChildren().addAll(three_one,three_two,three_three);


        root.setExpanded(true);
        one.setExpanded(true);// it will expand them at first

        TreeView<String> treeView = new TreeView<>(root);
        treeView.setShowRoot(false);// it wont show root
        treeView.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, stringTreeItem, t1) -> {
                    label.setText(t1.getValue());
                }
        );

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.getChildren().addAll(treeView,label);

        Scene scene = new Scene(vBox,400,400);
        stage.setScene(scene);
        stage.show();

    }
}
