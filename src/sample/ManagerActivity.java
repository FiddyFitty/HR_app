package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagerActivity extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("manager_activity.fxml"));
        primaryStage.setTitle("HR-OSS_Manager");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


            final ComboBox emailComboBox = new ComboBox();
            emailComboBox.getItems().addAll(
                    "Employee",
                    "Recruit"
            );
    }


    public static void main(String[] args) {
        launch(args);
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


    }
    public void successpage(ActionEvent actionEvent) throws IOException {

        Parent ManagerParent = FXMLLoader.load(getClass().getResource("../unused/success_activity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();


    }
    public void trainingpage(ActionEvent actionEvent) throws IOException {

        Parent ManagerParent = FXMLLoader.load(getClass().getResource("six.training_activity.fxml"));
        Scene ManagerScence = new Scene(ManagerParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(ManagerScence);
        window.show();


    }

}

