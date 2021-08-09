package sample.tableView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);





    }


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("table view");

        TableColumn<Student,String> firstNameColumn = new TableColumn<>("First name");
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName") );//must be the same as the variable in object that we use it to create table view


        TableColumn<Student,String> lastNameColumn = new TableColumn<>("Last name");
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName") );//must be the same as the variable in object that we use it to create table view


        TableColumn<Student,Long> studentIdColumn = new TableColumn<>("Student Id");
        studentIdColumn.setCellValueFactory(new PropertyValueFactory<>("studentId") );//must be the same as the variable in object that we use it to create table view
        studentIdColumn.setMinWidth(200);

        TableView<Student> tableView = new TableView<>();
        tableView.setItems(getStudents());
        tableView.getColumns().addAll(firstNameColumn,lastNameColumn,studentIdColumn);

        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(10,10,10,10));
        stackPane.getChildren().add(tableView);

        Scene scene = new Scene(stackPane,400,300);

        stage.setScene(scene);
        stage.show();
    }

    private ObservableList<Student> getStudents()
    {
        ObservableList<Student> students = FXCollections.observableArrayList();
        students.add(new Student("ramin","rowshan", 1L));
        students.add(new Student("mohamad","jahandideh", 2L));
        students.add(new Student("mehdi","feghei", 3L));
        students.add(new Student("omid","asalie", 4L));
        students.add(new Student("amir mohamad","tavakoli", 5L));
        return students;
    }
}
