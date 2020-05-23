package sk.hemii.Controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controler {


    Scene NewRaceScreen;
    Scene DashBoardScreen;
    Scene worker_show_screen_scene;
    Stage window;
    Stage primaryStage;
    @FXML



    public void NewRaceScreen(ActionEvent event) throws Exception {

        Parent screen = FXMLLoader.load(getClass().getResource("/NewRace.fxml"));
        NewRaceScreen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewRaceScreen);
        window.show();
    }

    public void BackToDashBoard(ActionEvent event) throws Exception {
        Parent screen = FXMLLoader.load(getClass().getResource("/DashBoard.fxml"));
        DashBoardScreen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(DashBoardScreen);
        window.show();
    }

    public void LoadRaceScreen(ActionEvent event) throws Exception {

        Parent screen = FXMLLoader.load(getClass().getResource("/LoadRace.fxml"));
        NewRaceScreen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewRaceScreen);





        window.show();


    }




}
