package sk.hemii.Dao;

import sk.hemii.Models.Sutaz;

import java.util.List;

public interface RaceDao {

    int inser(Sutaz sutaz);
    List<Sutaz> select();
    void remove(int id);
    void save(Sutaz sutaz);
    Sutaz load();



}
