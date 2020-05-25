package sk.hemii.Controler;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sk.hemii.Service.Temporary_save;
import sk.hemii.Models.Prihlasenie;
import sk.hemii.Models.Sutaz;
import sk.hemii.Service.RaceService;
import sk.hemii.Service.SignService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class HRaceControler implements Initializable {
    private RaceService raceService;
    private SignService signService = new SignService();
    Scene Screen;
    Stage window;

    @FXML
    private TableView<Prihlasenie> table;
    @FXML
    private TableColumn<Prihlasenie, String> table_meno;
    @FXML
    private TableColumn<Prihlasenie, String> table_priezvisko;
    @FXML
    private TableColumn<Prihlasenie, String> table_sc;
    @FXML
    private TableColumn<Prihlasenie, String> table_cat;
    @FXML
    private TableColumn<Prihlasenie, Integer> table_id;

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

        loadSignedIn(sutaz.get_id());
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

    public void loadSignedIn(int id) {
        table_meno.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().get_pretekar().get_meno()));
        table_priezvisko.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().get_pretekar().get_priezvisko()));
        table_sc.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().get_pretekar().get_s_cislo())));
        table_cat.setCellValueFactory(new PropertyValueFactory<Prihlasenie, String>("_kategoria"));
        table_id.setCellValueFactory(new PropertyValueFactory<Prihlasenie, Integer>("_id"));
        table.setItems(signService.loadSignIn(id));

    }

    public void showSections(ActionEvent event) throws IOException {
        Prihlasenie prihlasenie = new Prihlasenie(table.getSelectionModel().getSelectedItem().get_id());
        Temporary_save.set_prihlasenie(prihlasenie);
        Parent screen = FXMLLoader.load(getClass().getResource("/ShowSection.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();
    }


    public void mathResult(ActionEvent event) throws IOException {
        Parent screen = FXMLLoader.load(getClass().getResource("/ResultsRace.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();


    }

}

