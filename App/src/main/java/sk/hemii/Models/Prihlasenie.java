package sk.hemii.Models;

import javax.persistence.*;

@Entity
@Table(name = "prihlasenia")
public class Prihlasenie {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int _id;

    @Column(name = "kategoria")
    private String _kategoria;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "street_fk", referencedColumnName = "id")
    private Vybava_street _vybava_street;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ultimate_fk", referencedColumnName = "id")
    private Vybava_ultimate _vybava_ultimate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sutaz_fk", referencedColumnName = "id")
    private Sutaz _sutaz;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pretekar_fk", referencedColumnName = "id")
    private Pretekar _pretekar;

    public Prihlasenie() {
    }

    public Prihlasenie(Sutaz sutaz) {
        this._sutaz = sutaz;
    }

    public Prihlasenie(Sutaz sutaz, Pretekar pretekar) {
        this._sutaz = sutaz;
        this._pretekar = pretekar;
    }


    public int get_id() {
        return _id;
    }


    public Vybava_street get_vybava_street() {
        return _vybava_street;
    }

    public void set_vybava_street(Vybava_street _vybava_street) {
        this._vybava_street = _vybava_street;
    }

    public Vybava_ultimate get_vybava_ultimate() {
        return _vybava_ultimate;
    }

    public void set_vybava_ultimate(Vybava_ultimate _vybava_ultimate) {
        this._vybava_ultimate = _vybava_ultimate;
    }

    public Sutaz get_sutaz() {
        return _sutaz;
    }

    public void set_sutaz(Sutaz _sutaz) {
        this._sutaz = _sutaz;
    }

    public Pretekar get_pretekar() {
        return _pretekar;
    }

    public void set_pretekar(Pretekar _pretekar) {
        this._pretekar = _pretekar;
    }

    public String get_kategoria() {
        return _kategoria;
    }

    public void set_kategoria(String _kategoria) {
        this._kategoria = _kategoria;
    }



}
