package sk.hemii.Service;

import sk.hemii.Dao.StreetDaoAcces;
import sk.hemii.Models.Vybava_street;

public class StreetService {

    StreetDaoAcces streetDaoAcces = new StreetDaoAcces();

    public int addStreet(Vybava_street vybava_street) {

        int cout = 0;
        vybava_street.set_body(cout);

        return streetDaoAcces.insert(vybava_street);
    }

}
