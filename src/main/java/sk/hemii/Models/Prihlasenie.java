package sk.hemii.Models;

import javax.persistence.*;

@Entity
@Table(name = "prihlasenia")
public class Prihlasenie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int _id;

    @Column(name = "sutaz_fk")
    private Sutaz _sutaz_id;

    @Column(name = "pretekar_fk")
    private Pretekar _pretekar_id;

    public Prihlasenie() {
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public Sutaz get_sutaz_id() {
        return _sutaz_id;
    }

    public void set_sutaz_id(Sutaz _sutaz_id) {
        this._sutaz_id = _sutaz_id;
    }

    public Pretekar get_pretekar_id() {
        return _pretekar_id;
    }

    public void set_pretekar_id(Pretekar _pretekar_id) {
        this._pretekar_id = _pretekar_id;
    }
}
