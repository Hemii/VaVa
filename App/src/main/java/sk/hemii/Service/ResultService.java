package sk.hemii.Service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sk.hemii.Dao.ResultDaoAcces;
import sk.hemii.Models.Vysledok;

import java.util.List;

public class ResultService {
    private ResultDaoAcces resultDaoAcces = new ResultDaoAcces();


    public ObservableList<Vysledok> selectAll(int id) {
        ObservableList<Vysledok> enseignantList = FXCollections.observableArrayList();
        System.out.println(id);
        List<Vysledok> vysledok = resultDaoAcces.select(id);

        for (Vysledok ent : vysledok) {
            enseignantList.add(ent);
        }
        return enseignantList;


    }

    public void deletAll(int id){

        List<Vysledok> vysledok = resultDaoAcces.select(id);

        for (Vysledok temp: vysledok) {
            resultDaoAcces.remove(temp.get_id());
        }

    }



}
