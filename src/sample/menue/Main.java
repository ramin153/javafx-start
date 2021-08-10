package sample.menue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("menu");
        Label label = new Label("");
        MenuBar menuBar = new MenuBar();

        Menu menu1,menu2,menu3,menu4,menu5;

        menu1 = new Menu("_one");// open with alt + o
        MenuItem item = new MenuItem("1-1");
        item.setOnAction(actionEvent -> label.setText("1-1"));
        menu1.getItems().add(item);

        item = new MenuItem("1-2");
        item.setOnAction(actionEvent -> label.setText("1-2"));
        menu1.getItems().add(item);

        menu1.getItems().add(new SeparatorMenuItem());//put line

        item = new MenuItem("1-3");
        item.setOnAction(actionEvent -> label.setText("1-3"));
        menu1.getItems().add(item);

        menu1.getItems().add(new SeparatorMenuItem());

        item = new MenuItem("1-4");
        item.setOnAction(actionEvent -> label.setText("1-4"));
        item.setDisable(true);//un click able
        menu1.getItems().add(item);




        menu2 = new Menu("two");

        item = new MenuItem("2-1");
        item.setOnAction(actionEvent -> label.setText("2-1"));
        menu2.getItems().add(item);

        item = new MenuItem("2-2");
        item.setOnAction(actionEvent -> label.setText("2-2"));
        menu2.getItems().add(item);

        item = new MenuItem("2-3");
        item.setOnAction(actionEvent -> label.setText("2-3"));
        menu2.getItems().add(item);

        item = new MenuItem("2-4");
        item.setOnAction(actionEvent -> label.setText("2-4"));
        menu2.getItems().add(item);


        menu3 = new Menu("_three");//open with alt + t


        item = new MenuItem("3-1");
        item.setOnAction(actionEvent -> label.setText("3-1"));
        menu3.getItems().add(item);

        item = new MenuItem("3-2");
        item.setOnAction(actionEvent -> label.setText("3-2"));
        menu3.getItems().add(item);

        item = new MenuItem("3-3");
        item.setOnAction(actionEvent -> label.setText("3-3"));
        menu3.getItems().add(item);

        item = new MenuItem("3-4");
        item.setOnAction(actionEvent -> label.setText("3-4"));
        menu3.getItems().add(item);



        menu4 = new Menu("something");
        CheckMenuItem checkMenuItem = new CheckMenuItem("change label color");
        checkMenuItem.setOnAction(actionEvent ->
        {
            if (checkMenuItem.isSelected())
            {
                label.setTextFill(Color.web("#0076a3"));
            }else
            {
                label.setTextFill(Color.web("#000000"));
            }
        });
        checkMenuItem.setSelected(false);//it is not checked at first
        menu4.getItems().addAll(checkMenuItem);




        menu5 = new Menu("toggle");
        ToggleGroup toggleGroup = new ToggleGroup();

        RadioMenuItem first = new RadioMenuItem("first");
        RadioMenuItem second = new RadioMenuItem("second");
        RadioMenuItem third = new RadioMenuItem("third");

        first.setToggleGroup(toggleGroup);
        second.setToggleGroup(toggleGroup);
        third.setToggleGroup(toggleGroup);

        first.setSelected(true);

        menu5.getItems().addAll(first,second,third);


        menuBar.getMenus().addAll(menu1,menu2,menu3,menu4,menu5);

        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);
        layout.setBottom(label);

        Scene scene = new Scene(layout,400,300);

        stage.setScene(scene);
        stage.show();

    }
}
