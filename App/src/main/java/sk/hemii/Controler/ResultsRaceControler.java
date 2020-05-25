package sk.hemii.Controler;

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
import sk.hemii.Models.Pretekar;
import sk.hemii.Models.Sutaz;
import sk.hemii.Service.ResultService;
import sk.hemii.Service.SignService;
import sk.hemii.Service.Temporary_save;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ResultsRaceControler implements Initializable {
    private SignService signService = new SignService();
    private ResultService resultService = new ResultService();

    Scene Screen;
    Stage window;

    @FXML
    private TableView table;
    @FXML
    private TableColumn table_nick;
    @FXML
    private TableColumn table_min;
    @FXML
    private TableColumn table_body;
    @FXML
    private TableColumn table_sek;


    public void result() {
        Sutaz sutaz = Temporary_save.get_sutaz();
        resultService.deletAll(sutaz.get_id());

        System.out.println(sutaz.get_id());
        signService.mathRace(sutaz.get_id());
        set();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        set();
    }

    private void set() {
        Sutaz sutaz = Temporary_save.get_sutaz();
        table_nick.setCellValueFactory(new PropertyValueFactory<Pretekar, String>("_nick"));
        table_min.setCellValueFactory(new PropertyValueFactory<Pretekar, String>("_celkovy_cas_min"));
        table_body.setCellValueFactory(new PropertyValueFactory<Pretekar, String>("_celkove_bod"));
        table_sek.setCellValueFactory(new PropertyValueFactory<Pretekar, String>("_celkovy_cas_sek"));
        table.setItems(resultService.selectAll(sutaz.get_id()));

    }



    public void back(javafx.event.ActionEvent event) throws IOException {
        Parent screen = FXMLLoader.load(getClass().getResource("/HomeRace.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();

    }
}
