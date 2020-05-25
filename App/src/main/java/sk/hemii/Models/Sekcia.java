package sk.hemii.Models;

import javax.persistence.*;

@Entity
@Table(name = "sekcie")
public class Sekcia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int _id;

    @Column(name = "cas_min")
    private int _cas_min;

    @Column(name = "cas_sek")
    private int _cas_sek;

    @Column(name = "body")
    private int _body;

    @Column(name = "sekcia")
    private int _sekcia;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "prihlasenie_fk", referencedColumnName = "id")
    private Prihlasenie _prihlasenie;





    public Sekcia() {
    }







    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_cas_min() {
        return _cas_min;
    }

    public void set_cas_min(int _cas_min) {
        this._cas_min = _cas_min;
    }

    public int get_cas_sek() {
        return _cas_sek;
    }

    public void set_cas_sek(int _cas_sek) {
        this._cas_sek = _cas_sek;
    }

    public int get_body() {
        return _body;
    }

    public void set_body(int _body) {
        this._body = _body;
    }

    public Prihlasenie get_prihlasenie() {
        return _prihlasenie;
    }

    public void set_prihlasenie(Prihlasenie _prihlasenie) {
        this._prihlasenie = _prihlasenie;
    }

    public int get_sekcia() {
        return _sekcia;
    }

    public void set_sekcia(int _sekcia) {
        this._sekcia = _sekcia;
    }
}
