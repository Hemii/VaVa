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
import sk.hemii.Dao.Temporary_save;
import sk.hemii.Models.Sutaz;
import sk.hemii.Service.RaceService;

import java.net.URL;
import java.util.ResourceBundle;


public class LoadRaceControler implements Initializable {

    private RaceService raceService = new RaceService();
    Scene Screen;
    Stage window;
    @FXML
    private TableView<Sutaz> Loadrace_table;
    @FXML
    private TableColumn<Sutaz, String> miesto;
    @FXML
    private TableColumn<Sutaz, String> datum;
    @FXML
    private TableColumn<Sutaz, String> sekcie;
    @FXML
    private TableColumn<Sutaz, String> limit;
    @FXML
    private TableColumn<Sutaz, Integer> id;

    public void initialize(URL location, ResourceBundle resources) {

        miesto.setCellValueFactory(new PropertyValueFactory<Sutaz, String>("_miesto"));
        datum.setCellValueFactory(new PropertyValueFactory<Sutaz, String>("_datum"));
        sekcie.setCellValueFactory(new PropertyValueFactory<Sutaz, String>("_pocet_sek"));
        limit.setCellValueFactory(new PropertyValueFactory<Sutaz, String>("_casovy_limit"));
        id.setCellValueFactory(new PropertyValueFactory<Sutaz, Integer>("_id"));
        Loadrace_table.setItems(raceService.loadRaces());

    }


    public void backToDashBoard(ActionEvent event) throws Exception {
        Parent screen = FXMLLoader.load(getClass().getResource("/DashBoard.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();
    }



    public void selectAndConfirm(ActionEvent event) throws Exception{
        Sutaz sutaz  = new Sutaz(Loadrace_table.getSelectionModel().getSelectedItem().get_id(),Loadrace_table.getSelectionModel().getSelectedItem().get_miesto(),Loadrace_table.getSelectionModel().getSelectedItem().get_datum(),Loadrace_table.getSelectionModel().getSelectedItem().get_pocet_sek(),Loadrace_table.getSelectionModel().getSelectedItem().get_casovy_limit());
        Temporary_save.set_sutaz(sutaz);
        System.out.println(sutaz.get_id());
        Parent screen = FXMLLoader.load(getClass().getResource("/HomeRace.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();

    }


}
