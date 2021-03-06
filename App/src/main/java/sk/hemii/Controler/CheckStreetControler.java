package sk.hemii.Controler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import sk.hemii.Dao.Temporary_save;
import sk.hemii.Models.Prihlasenie;
import sk.hemii.Models.Vybava_street;
import sk.hemii.Service.SignService;
import sk.hemii.Service.StreetService;

import java.net.URL;
import java.util.ResourceBundle;

public class CheckStreetControler implements Initializable {
SignService signService = new SignService();
StreetService streetService = new StreetService();
    @FXML
    private CheckBox osvetlenie;
    @FXML
    private CheckBox vodic;
    @FXML
    private CheckBox interier;
    @FXML
    private CheckBox zrkadla;
    @FXML
    private CheckBox stierace;
    @FXML
    private CheckBox naj_plech;
    @FXML
    private CheckBox ecv;
    @FXML
    private CheckBox kanister;
    @FXML
    private CheckBox exp_bed;
    @FXML
    private CheckBox tazne_lano;
    @FXML
    private CheckBox rezerva;
    @FXML
    private CheckBox navijak;
    @FXML
    private CheckBox ppk;
    @FXML
    private CheckBox naraznik;
    @FXML
    private CheckBox pneu;
    @FXML
    private RadioButton ppkm;
    @FXML
    private RadioButton ppkp;

    private ToggleGroup pozdlzny_prekryv;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        pozdlzny_prekryv = new ToggleGroup();
        this.ppkm.setToggleGroup(pozdlzny_prekryv);
        this.ppkp.setToggleGroup(pozdlzny_prekryv);

    }

    public void test(){
        Vybava_street vybava_street = new Vybava_street(pneu.isSelected(),naraznik.isSelected(),ppk.isSelected(),ppkp.isSelected(),ppkm.isSelected(),rezerva.isSelected(),navijak.isSelected(),tazne_lano.isSelected(),exp_bed.isSelected(),kanister.isSelected(),ecv.isSelected(),naj_plech.isSelected(),stierace.isSelected(),zrkadla.isSelected(),interier.isSelected(),vodic.isSelected(),osvetlenie.isSelected());
        Prihlasenie prihlasenie = Temporary_save.get_prihlasenie();
        prihlasenie.set_vybava_street(vybava_street);
        prihlasenie.set_vybava_ultimate(null);
        prihlasenie.set_kategoria("street");
        streetService.addStreet(vybava_street);
        System.out.println(prihlasenie.get_sutaz().get_id());
        System.out.println(prihlasenie.get_pretekar().get_id());
        System.out.println(prihlasenie.get_vybava_street().get_id());

//        Temporary_save.set_prihlasenie(null);
       signService.addSign(prihlasenie);


    }


}
