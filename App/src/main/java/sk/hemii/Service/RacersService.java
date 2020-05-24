package sk.hemii.Service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sk.hemii.Dao.RacerDaoAcces;
import sk.hemii.Models.Pretekar;

import java.util.List;

public class RacersService {
    private RacerDaoAcces racerDao = new RacerDaoAcces();


    public ObservableList<Pretekar> loadRaces(){
        ObservableList<Pretekar> enseignantList = FXCollections.observableArrayList();
        List<Pretekar> Pretekar = racerDao.loadall();
        for (Pretekar ent : Pretekar) {
            enseignantList.add(ent);
            System.out.println(ent.get_nick());
        }


        return enseignantList;
    }

    public Pretekar findRacer(int id) {

        return racerDao.select(id);
    }
}
