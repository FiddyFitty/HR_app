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

import java.awt.*;
import java.io.IOException;

public class ResultActivity  {

    @FXML
    TextField txtID = new TextField();
    @FXML
    TextField txtFname= new TextField();
    @FXML
    TextField txtLname = new TextField();
    @FXML
    TextField txtEmail = new TextField();
    @FXML
    TextField txtJob = new TextField();
    @FXML
    TextField txtSalary = new TextField();
    @FXML
    TextField txtStatus = new TextField();
    @FXML
    TextField txtNote = new TextField();
    @FXML
    TextField txtPerformance = new TextField();
    @FXML
    TextField txtAddress = new TextField();
    @FXML
    TextField txtManager = new TextField();
    @FXML
    TextField txtPhone = new TextField();






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
        //String ID = txtID.getText();
        String Fname= txtFname.getText();
        String Lname = txtLname.getText();
        String Email = txtEmail.getText();


        // Todo update sql database
        //SQL.POST(Fname,Lname,Email);

    }

    public void New(ActionEvent actionEvent) throws IOException {
        //String ID = txtID.getText();
        String Fname= txtFname.getText();
        String Lname = txtLname.getText();
        String Email = txtEmail.getText();
        String Job = txtJob.getText();
        String Address = txtAddress.getText();
        String Salary = txtSalary.getText();
        String Status = txtStatus.getText();
        String Note = txtNote.getText();
        String Performance = txtPerformance.getText();
        String Manager = txtManager.getText();
        String Phone =txtPhone.getText();


        // Todo update sql database
        SQL.POSTHR(Fname,Lname,Email,Address,Job,Manager,Note,Performance,Phone,Salary,Status);

    }
}
