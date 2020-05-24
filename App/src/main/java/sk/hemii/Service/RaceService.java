package sk.hemii.Service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sk.hemii.Dao.RaceDaoAcces;
import sk.hemii.Models.Sutaz;

import java.util.List;

public class RaceService {


    private RaceDaoAcces raceDao = new RaceDaoAcces();

    public int addRace(Sutaz sutaz){
       return raceDao.inser(sutaz);
    }


    public ObservableList<Sutaz> loadRaces(){
        ObservableList<Sutaz> enseignantList = FXCollections.observableArrayList();
        List<Sutaz> sutaze = raceDao.select();
        for (Sutaz ent : sutaze) {
            enseignantList.add(ent);
        }


        return enseignantList;
    }



//    public List<Sutaz>

}
