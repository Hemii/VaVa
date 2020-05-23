package sk.hemii.Models;

import javax.persistence.*;


@Entity
@Table(name = "Vybava_ultimate")
public class vybava_ultimate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int _id;
    @Column(name = "prilaseny_fk")
    private int _prilaseny_fk;
    @Column(name = "pneumatiky_minus")
    private Boolean _pneumatiky_minus;
    @Column(name = "naraznik")
    private Boolean _naraznik;
    @Column(name = "pneumatiky_plus")
    private Boolean _pneumatiky_plus;
    @Column(name = "pozdlzny_prekryv_kolies")
    private Boolean _pozdlzny_prekryv_kolies;
    @Column(name = "priecny_prekryv_kolies")
    private Boolean _priecny_prekryv_kolies;
    @Column(name = "ecv")
    private Boolean _ecv;
    @Column(name = "osvetlenie")
    private Boolean _osvetlenie;
    @Column(name = "body")
    private int _body;


    public vybava_ultimate() {
    }

    public int get_prilaseny_fk() {
        return _prilaseny_fk;
    }

    public void set_prilaseny_fk(int _prilaseny_fk) {
        this._prilaseny_fk = _prilaseny_fk;
    }

    public Boolean get_pneumatiky_minus() {
        return _pneumatiky_minus;
    }

    public void set_pneumatiky_minus(Boolean _pneumatiky_minus) {
        this._pneumatiky_minus = _pneumatiky_minus;
    }

    public Boolean get_naraznik() {
        return _naraznik;
    }

    public void set_naraznik(Boolean _naraznik) {
        this._naraznik = _naraznik;
    }

    public Boolean get_pneumatiky_plus() {
        return _pneumatiky_plus;
    }

    public void set_pneumatiky_plus(Boolean _pneumatiky_plus) {
        this._pneumatiky_plus = _pneumatiky_plus;
    }

    public Boolean get_pozdlzny_prekryv_kolies() {
        return _pozdlzny_prekryv_kolies;
    }

    public void set_pozdlzny_prekryv_kolies(Boolean _pozdlzny_prekryv_kolies) {
        this._pozdlzny_prekryv_kolies = _pozdlzny_prekryv_kolies;
    }

    public Boolean get_priecny_prekryv_kolies() {
        return _priecny_prekryv_kolies;
    }

    public void set_priecny_prekryv_kolies(Boolean _priecny_prekryv_kolies) {
        this._priecny_prekryv_kolies = _priecny_prekryv_kolies;
    }

    public Boolean get_ecv() {
        return _ecv;
    }

    public void set_ecv(Boolean _ecv) {
        this._ecv = _ecv;
    }

    public Boolean get_osvetlenie() {
        return _osvetlenie;
    }

    public void set_osvetlenie(Boolean _osvetlenie) {
        this._osvetlenie = _osvetlenie;
    }

    public int get_body() {
        return _body;
    }

    public void set_body(int _body) {
        this._body = _body;
    }
}