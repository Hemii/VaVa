package sk.hemii.Controler;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import sk.hemii.Functions;
import sk.hemii.Models.Sutaz;

import java.util.List;

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
