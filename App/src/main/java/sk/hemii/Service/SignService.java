package sk.hemii.Service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sk.hemii.Dao.ResultDaoAcces;
import sk.hemii.Dao.SignDaoAcces;
import sk.hemii.Models.Prihlasenie;
import sk.hemii.Models.Sekcia;
import sk.hemii.Models.Vysledok;

import java.util.List;

public class SignService {

    private SignDaoAcces signDao = new SignDaoAcces();
    private ResultDaoAcces resultDaoAcces = new ResultDaoAcces();
    public int addSign(Prihlasenie prihlasenie) {

        return signDao.insert(prihlasenie);
    }

    public ObservableList<Prihlasenie> loadSignIn(int id) {
        System.out.println(id);
        ObservableList<Prihlasenie> enseignantList = FXCollections.observableArrayList();
        List<Prihlasenie> prihlasenie = signDao.select(id);
        for (Prihlasenie ent : prihlasenie) {
            enseignantList.add(ent);
        }


        return enseignantList;
    }




    public void mathRace(int id) {
        List<Prihlasenie> list = signDao.select(id);

        for (Prihlasenie prihlasenie : list) {

            int cas_min = 0, cas_sek = 0, body = 0;
            List<Sekcia> sekcie = prihlasenie.get_sekcia();
            for (Sekcia s : sekcie) {
                cas_min += s.get_cas_min();
                cas_sek += s.get_cas_sek();
                body += s.get_body();
            }
            body += prihlasenie.get_vybava_street().get_body();

            Vysledok vysledok = new Vysledok(cas_min,cas_sek,body,prihlasenie.get_pretekar().get_nick(),prihlasenie,id);
            resultDaoAcces.insert(vysledok);
        }

    }
}
