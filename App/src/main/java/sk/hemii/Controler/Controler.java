package sk.hemii.Controler;

import javafx.event.ActionEvent;
<<<<<<< HEAD
import javafx.fxml.FXML;
=======
>>>>>>> a25416e4f9f4b27a7b3c5c712ac5512e736a167b
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



    public void newRaceScreen(ActionEvent event) throws Exception {

        Parent screen = FXMLLoader.load(getClass().getResource("/NewRace.fxml"));
        NewRaceScreen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewRaceScreen);
        window.show();
    }

    public void backToDashBoard(ActionEvent event) throws Exception {
        Parent screen = FXMLLoader.load(getClass().getResource("/DashBoard.fxml"));
        DashBoardScreen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(DashBoardScreen);
        window.show();
    }

    public void loadRaceScreen(ActionEvent event) throws Exception {

        Parent screen = FXMLLoader.load(getClass().getResource("/LoadRace.fxml"));
        NewRaceScreen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(NewRaceScreen);





        window.show();


    }




}
