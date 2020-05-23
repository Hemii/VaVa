package sk.hemii.Controler;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import sk.hemii.Models.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


public class LoadRaceControler implements Initializable {
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


    public void initialize(URL location, ResourceBundle resources) {

        miesto.setCellValueFactory(new PropertyValueFactory<Sutaz, String>("_miesto"));
        datum.setCellValueFactory(new PropertyValueFactory<Sutaz, String>("_datum"));
        sekcie.setCellValueFactory(new PropertyValueFactory<Sutaz, String>("_pocet_sek"));
        limit.setCellValueFactory(new PropertyValueFactory<Sutaz, String>("_casovy_limit"));
        Loadrace_table.setItems(LoadRaces());

    }


    public void BackToDashBoard(ActionEvent event) throws Exception {
        Parent screen = FXMLLoader.load(getClass().getResource("/DashBoard.fxml"));
        Screen = new Scene(screen);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Screen);
        window.show();
    }

//    Sutaz sutaz = new Sutaz(Loadrace_table.getSelectionModel().getSelectedItem().get_miesto(), Loadrace_table.getSelectionModel().getSelectedItem().get_datum(), Loadrace_table.getSelectionModel().getSelectedItem().get_pocet_sek(), Loadrace_table.getSelectionModel().getSelectedItem().get_casovy_limit());
//        System.out.println(sutaz);


    public ObservableList<Sutaz> LoadRaces() {
        ObservableList<Sutaz> enseignantList = FXCollections.observableArrayList();
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Sutaz> sutaze = entityManager.createQuery("FROM Sutaz", Sutaz.class).getResultList();
        for (Sutaz ent : sutaze) {
            enseignantList.add(ent);


        }



        entityManager.getTransaction().commit();

        return enseignantList;
    }


}
