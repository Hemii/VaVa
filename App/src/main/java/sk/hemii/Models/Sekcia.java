package sk.hemii.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "sekcie")
public class Sekcia {

    @Id
    @Column(name = "id")
    private int _id;

    @Column(name = "cas")
    private Date _cas;

    @Column(name = "body")
    private int _body;

//    @Column(name = "prihlaseny_fk")
//    private Prihlasenie _prihlasenie;

    public Sekcia() {
    }





//    public Sekcia(Date _cas, int _body, Prihlasenie _prihlasenie) {
//        this._cas = _cas;
//        this._body = _body;
//        this._prihlasenie = _prihlasenie;
//    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public Date get_cas() {
        return _cas;
    }

    public void set_cas(Date _cas) {
        this._cas = _cas;
    }

    public int get_body() {
        return _body;
    }

    public void set_body(int _body) {
        this._body = _body;
    }

//    public Prihlasenie get_prihlasenie() {
//        return _prihlasenie;
//    }
//
//    public void set_prihlasenie(Prihlasenie _prihlasenie) {
//        this._prihlasenie = _prihlasenie;
//    }
}
