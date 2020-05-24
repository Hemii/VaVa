package sk.hemii.Controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
<<<<<<< HEAD
=======
import javafx.stage.Stage;
import sk.hemii.Dao.Temporary_save;
>>>>>>> a25416e4f9f4b27a7b3c5c712ac5512e736a167b
import sk.hemii.Models.Sutaz;
import sk.hemii.Service.RaceService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class HRaceControler implements Initializable {

    private RaceService raceService;

    Scene Screen;
    Stage window;
    @FXML
    public Label label_place;
    public Label label_nsections;
    public Label label_date;
    public Label label_tsections;

    public void initialize(URL location, ResourceBundle resources) {

        set();
    }

    private void set() {
        Sutaz sutaz = (Sutaz) Temporary_save.get_sutaz();

        label_place.setText(sutaz.get_miesto());
        label_date.setText(sutaz.get_datum());
        label_tsections.setText(String.valueOf(sutaz.get_casovy_limit()));
        label_nsections.setText(String.valueOf(sutaz.get_pocet_sek()));
    }

    public void addRacer(ActionEvent event) throws IOException {
        Parent screen = FXMLLoader.load(getClass().getResource("/AddRacer.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();

    }



    public void backToDashBoard(ActionEvent event) throws Exception {
        Parent screen = FXMLLoader.load(getClass().getResource("/DashBoard.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();
    }



}
