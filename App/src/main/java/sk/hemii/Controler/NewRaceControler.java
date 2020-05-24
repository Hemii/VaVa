package sk.hemii.Controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sk.hemii.Dao.Temporary_save;
import sk.hemii.Models.Sutaz;
import sk.hemii.Service.RaceService;

import java.io.IOException;

public class NewRaceControler {
    public TextField input_place;
    public TextField input_date;
    public TextField input_nsections;
    public TextField input_tsection;
    Scene Screen;
    Stage window;

    private RaceService raceService = new RaceService();




    public void backToDashBoard(ActionEvent event) throws Exception {
        Parent screen = FXMLLoader.load(getClass().getResource("/DashBoard.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();
    }

    public void confirmAndNext(ActionEvent event) throws IOException {

        if (input_place.getText().equals("") || input_date.getText().equals("") || input_nsections.getText().equals("") || input_tsection.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Nie su vyplnene vsetky textove polia");

            alert.showAndWait();

        } else {
            if(!isNumeric(input_nsections.getText()) || !isNumeric(input_tsection.getText())){

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Cas alebo pocet sekcii musia obsahovat cislo");

                alert.showAndWait();



            }else  {
                Sutaz sutaz = new Sutaz(input_place.getText(), input_date.getText(), Integer.parseInt(input_nsections.getText()), Integer.parseInt(input_tsection.getText()));

                int id = raceService.addRace(sutaz);
                Temporary_save.set_sutaz(new Sutaz(id,input_place.getText(), input_date.getText(), Integer.parseInt(input_nsections.getText()), Integer.parseInt(input_tsection.getText())));
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/HomeRace.fxml"));
                Parent screen = loader.load();
                Screen = new Scene(screen);
                window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(Screen);
                window.show();

            }

        }
    }


    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }


}
