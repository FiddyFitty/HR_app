package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ResultActivity extends Application {

    @FXML
    TextField txtID = new TextField();
    @FXML
    TextField txtFname= new TextField();
    @FXML
    TextField txtLname = new TextField();
    @FXML
    TextField txtEmail = new TextField();


    String ID ;
    String Fname;
    String Lname;
    String Email ;


    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("result_activity.fxml"));
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
        String ID = txtID.getText();
        String Fname= txtFname.getText();
        String Lname = txtLname.getText();
        String Email = txtEmail.getText();


        // Todo update sql database
        SQL.POST(ID,Fname,Lname,Email);


    }
}
