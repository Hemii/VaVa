package sk.hemii.Service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sk.hemii.Dao.SecDaoAcces;
import sk.hemii.Models.Prihlasenie;
import sk.hemii.Models.Sekcia;

import java.util.ArrayList;
import java.util.List;

public class SecService {

    SecDaoAcces secDaoAcces = new SecDaoAcces();

    public List<Sekcia> addSections(int pocet_sekcii, Prihlasenie prihlasenie) {
        List<Sekcia> sekcie = new ArrayList<Sekcia>();
        List<Integer> list = secDaoAcces.insert(pocet_sekcii,prihlasenie);

        for (int i : list) {
            Sekcia sek = new Sekcia();
            sek.set_id(i);
            sekcie.add(sek);

        }

        return sekcie;
    }


    public ObservableList<Sekcia> selectAll(int id) {
        ObservableList<Sekcia> enseignantList = FXCollections.observableArrayList();
        System.out.println(id);
        List<Sekcia> sekcias = secDaoAcces.select(id);

        for (Sekcia ent : sekcias) {
            enseignantList.add(ent);
        }
        return enseignantList;


    }

    public void update(Sekcia sekcia) {
        System.out.println(sekcia.get_id());
        secDaoAcces.update(sekcia);

    }
}
