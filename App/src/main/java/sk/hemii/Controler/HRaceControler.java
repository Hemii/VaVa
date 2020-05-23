package sk.hemii.Controler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import sk.hemii.Models.Sutaz;
import sk.hemii.Temporary_save;

import java.net.URL;
import java.util.ResourceBundle;

public class HRaceControler implements Initializable {

    @FXML
    public Label label_place;
    public Label label_nsections;
    public Label label_date;
    public Label label_tsections;

    public void initialize(URL location, ResourceBundle resources) {

        Set();
    }

    private void Set() {
        Sutaz sutaz = (Sutaz) Temporary_save.get_sutaz();
        label_place.setText(sutaz.get_miesto());
        label_date.setText(sutaz.get_datum());
        label_tsections.setText(String.valueOf(sutaz.get_casovy_limit()));
        label_nsections.setText(String.valueOf(sutaz.get_pocet_sek()));
    }


}
