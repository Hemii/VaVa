package sk.hemii.Dao;

import sk.hemii.Models.Prihlasenie;
import sk.hemii.Models.Sekcia;

import java.util.List;

public interface SecDao {





    List<Integer> insert(int pocet, Prihlasenie prihlasenie);

    void update(Sekcia sekcia);

}
