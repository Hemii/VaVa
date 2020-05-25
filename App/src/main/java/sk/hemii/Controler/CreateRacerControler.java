package sk.hemii.Controler;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sk.hemii.Models.Pretekar;
import sk.hemii.Service.RacerService;

public class CreateRacerControler {

    RacerService racerService = new RacerService();
    Scene Screen;
    Stage window;

    @FXML
    public TextField meno;
    public TextField priezvisko;
    public TextField s_cislo;
    public TextField nick;
    public TextField email;
    public TextField tel;

    public void createRacer(javafx.event.ActionEvent event) throws Exception {

        if(meno.getText().equals("")|| priezvisko.getText().equals("") ||nick.getText().equals("") ||s_cislo.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Nie su vyplnene textove polia Meno/Priezvisko/Nick/Startovne cislo");

            alert.showAndWait();
        }
        else  {
            if(!isNumeric(s_cislo.getText())){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Pole Startovne cislo musi obsahovat cislo");

                alert.showAndWait();

            }else {

                Pretekar pretekar = new Pretekar(meno.getText(), priezvisko.getText(), nick.getText(), Integer.parseInt(s_cislo.getText()), email.getText(), tel.getText());
                racerService.addRacer(pretekar);

                Parent screen = FXMLLoader.load(getClass().getResource("/AddRacer.fxml"));
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
