package sk.hemii.Controler;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sk.hemii.Service.Temporary_save;
import sk.hemii.Models.Pretekar;
import sk.hemii.Models.Prihlasenie;
import sk.hemii.Service.RacerService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddRacerControler implements Initializable {
    Scene Screen;
    Stage window;
    private RacerService racerService = new RacerService();
    @FXML
    private TableView<Pretekar> tabulka;
    @FXML
    private TableColumn<Pretekar,String> meno;
    @FXML
    private TableColumn<Pretekar,String>  priezvisko;
    @FXML
    private TableColumn<Pretekar,String>  nick;
    @FXML
    private TableColumn<Pretekar,String>  cislo;
    @FXML
    private TableColumn<Pretekar,Integer>  id;


    public void initialize(URL location, ResourceBundle resources) {

        meno.setCellValueFactory(new PropertyValueFactory<Pretekar,String>("_meno"));
        priezvisko.setCellValueFactory(new PropertyValueFactory<Pretekar, String>("_priezvisko"));
        nick.setCellValueFactory(new PropertyValueFactory<Pretekar, String>("_nick"));
        cislo.setCellValueFactory(new PropertyValueFactory<Pretekar, String>("_s_cislo"));
        id.setCellValueFactory(new PropertyValueFactory<Pretekar,Integer>("_id"));
        tabulka.setItems(racerService.loadRacers());


    }



    public void addRacer(ActionEvent event) throws Exception{
        Prihlasenie prihlasenie = new Prihlasenie(Temporary_save.get_sutaz(),racerService.findRacer(tabulka.getSelectionModel().getSelectedItem().get_id()));
        Temporary_save.set_prihlasenie(prihlasenie);

        Parent screen = FXMLLoader.load(getClass().getResource("/CheckStreet.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();
    }

    public void createRacer(ActionEvent event) throws Exception{

        Parent screen = FXMLLoader.load(getClass().getResource("/CreateRacer.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();
    }

    public void backToHRace(ActionEvent event) throws IOException {
        Parent screen = FXMLLoader.load(getClass().getResource("/HomeRace.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();

    }

}
