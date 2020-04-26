package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.io.IOException;


public class Controller {
    @FXML
    private AnchorPane main_page;

    @FXML
    private Button ManagerButton;

    @FXML
    private Button employeeButton;

    @FXML
    private Button HRButton;
    @FXML
    private AnchorPane mSearchButton;

    @FXML
    private Button resultButton;

    @FXML
    private Button reportingButton;

    @FXML
    private Button successButton;
    @FXML
    private AnchorPane salaryButton;

    @FXML
    private Button trainingButton;







// Load manager page


    public void managerpage(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent ManagerParent =FXMLLoader.load(getClass().getResource("manager_activity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();
    }


    public void HRpage(ActionEvent actionEvent) throws IOException {
        Parent ManagerParent =FXMLLoader.load(getClass().getResource("HRActivity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();
    }

    public void employeepage(ActionEvent actionEvent) throws IOException {
        Parent ManagerParent =FXMLLoader.load(getClass().getResource("employee_activity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();
    }

    public void menupage(ActionEvent actionEvent) throws IOException {

        Parent ManagerParent = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();


    }

    public void recruitpage(ActionEvent actionEvent) throws IOException {

        Parent ManagerParent = FXMLLoader.load(getClass().getResource("../unused/recruit_activity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();


    }
    public void reportpage(ActionEvent actionEvent) throws IOException {

        Parent ManagerParent = FXMLLoader.load(getClass().getResource("../unused/reporting_activity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();


    }
    public void resultpage(ActionEvent actionEvent) throws IOException {

        Parent ManagerParent = FXMLLoader.load(getClass().getResource("result_activity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();

        // todo use info in text bar to preload next page
        // todo or add search bar for stored procedure on actual age page


    }
    public void salarypage(ActionEvent actionEvent) throws IOException {

        Parent ManagerParent = FXMLLoader.load(getClass().getResource("salary_activity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();

        // todo open payroll page


    }
    public void successpage(ActionEvent actionEvent) throws IOException {

        Parent ManagerParent = FXMLLoader.load(getClass().getResource("../unused/success_activity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();

        // Todo use ID or employee name to pull up success planning


    }
    public void trainingpage(ActionEvent actionEvent) throws IOException {

        Parent ManagerParent = FXMLLoader.load(getClass().getResource("../unused/training_activity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();

        // todo use Id to show training page


    }




}
