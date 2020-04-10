package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeeActivity extends Application {
    @FXML
    TextField search= new TextField();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("manager_activity.fxml"));
        primaryStage.setTitle("HR-OSS_Manager");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();




    }

    public void menupage(ActionEvent actionEvent) throws IOException {
        Parent ManagerParent = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();
    }

    public void update(ActionEvent actionEvent) throws IOException {
        String ID = search.getText();



        // Todo update sql database
        //SQL.GET(ID);


    }


}
