package sk.hemii.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sutaze")
public class Sutaz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int _id;

    @Column(name = "miesto")
    private String _miesto;

    @Column(name = "datum")
    private String _datum;

    @Column(name = "pocet_sekcii")
    private int _pocet_sek;

    @Column(name = "casovy_limit")
    private int _casovy_limit;

    @OneToMany(mappedBy = "_sutaz",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Prihlasenie> _prihlasenie;

    public Sutaz() {
    }


    public Sutaz(String _miesto, String _datum, int _pocet_sek, int _casovy_limit) {
        this._miesto = _miesto;
        this._datum = _datum;
        this._pocet_sek = _pocet_sek;
        this._casovy_limit = _casovy_limit;
    }

    public Sutaz(int _id, String _miesto, String _datum, int _pocet_sek, int _casovy_limit) {
        this._id = _id;
        this._miesto = _miesto;
        this._datum = _datum;
        this._pocet_sek = _pocet_sek;
        this._casovy_limit = _casovy_limit;
    }

    public  int get_casovy_limit() {
        return _casovy_limit;
    }

    public void set_casovy_limit(int _casovy_limit) {
        this._casovy_limit = _casovy_limit;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_miesto() {
        return _miesto;
    }

    public void set_miesto(String _miesto) {
        this._miesto = _miesto;
    }

    public String get_datum() {
        return _datum;
    }

    public void set_datum(String _datum) {
        this._datum = _datum;
    }

    public int get_pocet_sek() {
        return _pocet_sek;
    }

    public void set_pocet_sek(int _pocet_sek) {
        this._pocet_sek = _pocet_sek;
    }
}
