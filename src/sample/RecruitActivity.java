package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;


import java.awt.*;
import java.io.IOException;
import sample.SQL.*;

public class RecruitActivity extends Application {


    @FXML
    TextField txtID = new TextField();
    @FXML
    TextField txtFname= new TextField();
    @FXML
    javafx.scene.control.TextField txtLname = new javafx.scene.control.TextField();
    @FXML
    TextField txtEmail = new TextField();
    Button update = new Button("update");

    String ID = txtID.toString();
    String Fname= txtFname.toString();
    String Lname = txtLname.toString();
    String Email = txtEmail.toString();


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("recruit_activity.fxml"));
        primaryStage.setTitle("HR-OSS_Manager");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();






       


    }

    public static void main(String[] args) {
        launch(args);
    }

    // back to HR
    public void HRpage(ActionEvent actionEvent) throws IOException {
        Parent ManagerParent =FXMLLoader.load(getClass().getResource("HRActivity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();
    }

    //back to managerpage
    public void managerpage(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent ManagerParent =FXMLLoader.load(getClass().getResource("manager_activity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();
    }

    //back to menu button
    public void menupage(ActionEvent actionEvent) throws IOException {

        Parent ManagerParent = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();
    }

    //update button
    public void update(ActionEvent actionEvent) throws IOException {

        // Todo update sql database


    }
}
