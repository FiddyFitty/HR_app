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
    TextField txtSearch= new TextField();

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
    String sysID;








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

    public  void updateButton(ActionEvent actionEvent) throws IOException {

        String fname = txtFname.getText();
        String lname = txtLname.getText();
        String Email = txtEmail.getText();
        String Address= txtAddress.getText();
        String Job = txtJob.getText();
        String Note = txtNote.getText();
        String Phone = txtPhone.getText();
        String Manager =txtManager.getText();
        String Salary = txtSalary.getText();
        String Status = txtStatus.getText();

        String Performance = txtPerformance.getText();


        SQLUPDATE.PUT(sysID,fname,lname,Email,Address,Job,Manager,Note,Performance,Phone,Salary,Status);
    }

    public  void SearchID(ActionEvent actionEvent) throws IOException {

        String ID = txtSearch.getText();

        SQLGET.GET(ID);

        txtID.setText(SQLGET.id);

        txtFname.setText(SQLGET.fname);
        txtLname.setText(SQLGET.lname);
        txtEmail.setText(SQLGET.email);
        txtAddress.setText(SQLGET.address);
        txtStatus.setText(SQLGET.status);
        txtNote.setText(SQLGET.note);
        txtPhone.setText(SQLGET.phone);
        txtNote.setText(SQLGET.note);
        txtJob.setText(SQLGET.job);
        txtManager.setText(SQLGET.manager);
        txtSalary.setText(SQLGET.salary);
        txtPerformance.setText(SQLGET.performance);

        sysID = SQLGET.sysID;



    }
}
