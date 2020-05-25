package sk.hemii.Controler;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sk.hemii.Models.Prihlasenie;
import sk.hemii.Models.Sekcia;
import sk.hemii.Service.SecService;
import sk.hemii.Service.Temporary_save;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShowSectionControler implements Initializable {
    SecService secService = new SecService();
    private Sekcia sekcia = new Sekcia();
    Scene Screen;
    Stage window;
    @FXML
    private Label label_sekcia;
    @FXML
    private TextField body;
    @FXML
    private TextField cas_sek;
    @FXML
    private TextField cas_min;
    @FXML
    private TableView<Sekcia> table;
    @FXML
    private TableColumn<Sekcia, Integer> table_body;
    @FXML
    private TableColumn<Sekcia, Integer> table_sekcion;
    @FXML
    private TableColumn<Sekcia, Integer> table_min;
    @FXML
    private TableColumn<Sekcia, Integer> teble_sek;
    @FXML
    private TableColumn table_id;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        set();
    }

    public void set() {

        Prihlasenie prihlasenie = Temporary_save.get_prihlasenie();

        table_body.setCellValueFactory(new PropertyValueFactory<Sekcia, Integer>("_body"));
        table_sekcion.setCellValueFactory(new PropertyValueFactory<Sekcia, Integer>("_sekcia"));
        table_min.setCellValueFactory(new PropertyValueFactory<Sekcia, Integer>("_cas_min"));
        teble_sek.setCellValueFactory(new PropertyValueFactory<Sekcia, Integer>("_cas_sek"));
        table_id.setCellValueFactory(new PropertyValueFactory<Sekcia, Integer>("_id"));
        table.setItems(secService.selectAll(prihlasenie.get_id()));
    }

    public void load() {
        sekcia.set_sekcia(table.getSelectionModel().getSelectedItem().get_sekcia());
        sekcia.set_cas_sek(table.getSelectionModel().getSelectedItem().get_cas_sek());
        sekcia.set_cas_min(table.getSelectionModel().getSelectedItem().get_cas_min());
        sekcia.set_body(table.getSelectionModel().getSelectedItem().get_body());
        sekcia.set_id(table.getSelectionModel().getSelectedItem().get_id());

        label_sekcia.setText(String.valueOf(sekcia.get_sekcia()));
        body.setText(String.valueOf(sekcia.get_body()));
        cas_min.setText(String.valueOf(sekcia.get_cas_min()));
        cas_sek.setText(String.valueOf(sekcia.get_cas_sek()));

    }

    public void save(){
        sekcia.set_body(Integer.parseInt(body.getText()));
        sekcia.set_cas_min(Integer.parseInt(cas_min.getText()));
        sekcia.set_cas_sek(Integer.parseInt(cas_sek.getText()));
        System.out.println(sekcia.get_body());
        System.out.println(sekcia.get_cas_min());
        System.out.println(sekcia.get_cas_sek());
        secService.update(sekcia);

        set();

        label_sekcia.setText("");
        body.setText("");
        cas_min.setText("");
        cas_sek.setText("");

    }




    public void backToAdd(javafx.event.ActionEvent event) throws IOException {
        Parent screen = FXMLLoader.load(getClass().getResource("/HomeRace.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();

    }
}
