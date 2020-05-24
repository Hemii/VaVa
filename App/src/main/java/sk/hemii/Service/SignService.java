package sk.hemii.Service;

import sk.hemii.Dao.SignDaoAcces;
import sk.hemii.Models.Prihlasenie;

public class SignService {

    private SignDaoAcces signDao = new SignDaoAcces();

    public void addSign(Prihlasenie prihlasenie) {
        signDao.insert(prihlasenie);
    }


}
