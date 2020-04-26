package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import unused.Data;


import java.io.IOException;

public class EmployeeActivity  {
    @FXML
    TextField txtSearch= new TextField();

    @FXML
    TextField txtID = new TextField();
    @FXML
    TextField txtFname;
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

    Data data = new Data();
    String sysID;


    //@Override
    /*public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("employee_activity.fxml"));
        primaryStage.setTitle("HR-OSS_Manager");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();




    }*/

    public void menupage(ActionEvent actionEvent) throws IOException {
        Parent ManagerParent = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();
    }

    public void update(ActionEvent actionEvent) throws IOException {
        String fname = txtFname.getText();
        String lname = txtLname.getText();
        String Email = txtEmail.getText();
        String Address= txtAddress.getText();
        String Status = txtStatus.getText();

        String Phone = txtPhone.getText();


        SQLUPDATE.PUTemp(sysID,fname,lname,Email,Address,Phone,Status);


    }
    public void New(ActionEvent actionEvent) throws IOException {
        //String ID = txtID.getText();
        String Fname= txtFname.getText();
        String Lname = txtLname.getText();
        String Email = txtEmail.getText();

        String Address = txtAddress.getText();

        String Status = txtStatus.getText();
        String Note = txtNote.getText();

        String Phone =txtPhone.getText();


        // Todo update sql database
        SQL.POST(Fname,Lname,Email,Address,Phone,Note,Status);

    }

    public  void SearchID(ActionEvent actionEvent) throws IOException {

        String ID = txtSearch.getText();

        SQLGET.GET(ID);

        System.out.println("Loading");



        txtFname.setText(SQLGET.fname);
        txtLname.setText(SQLGET.lname);
        txtEmail.setText(SQLGET.email);
        txtAddress.setText(SQLGET.address);
        txtStatus.setText(SQLGET.status);
        txtNote.setText(SQLGET.note);
        txtPhone.setText(SQLGET.phone);
        txtNote.setText(SQLGET.note);

        sysID = SQLGET.sysID;



    }




}
