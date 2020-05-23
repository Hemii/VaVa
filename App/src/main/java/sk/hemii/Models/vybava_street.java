package sk.hemii.Models;

import javax.persistence.*;

@Entity
@Table(name = "Vybava_street")
public class Vybava_street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int  _id;

    @Column(name = "pneumatiky")
    private Boolean  _pneumatiky;
    @Column(name = "naraznik")
    private Boolean  _naraznik;
    @Column(name = "pozdlzny_prekryv_kolies")
    private Boolean  _pozdlzny_prekryv_kolies;
    @Column(name = "priecny_prekryv_kolies_plus")
    private Boolean  _priecny_prekryv_kolies_plus;
    @Column(name = "priecny_prekryv_kolies_minus")
    private Boolean  _priecny_prekryv_kolies_minus;
    @Column(name = "rezerva")
    private Boolean  _rezerva;
    @Column(name = "navijak")
    private Boolean  _navijak;
    @Column(name = "tazne_lano")
    private Boolean  _tazne_lano;
    @Column(name = "exped_bedna")
    private Boolean  _exped_bedna;
    @Column(name = "kanister")
    private Boolean  _kanister;
    @Column(name = "ecv")
    private Boolean  _ecv;
    @Column(name = "najazdove_plechy")
    private Boolean  _najazdove_plechy;
    @Column(name = "stierace")
    private Boolean  _stierace;
    @Column(name = "zrkadla")
    private Boolean  _zrkadla;
    @Column(name = "interier")
    private Boolean  _interier;
    @Column(name = "_vodic")
    private Boolean  vodic;
    @Column(name = "osvetlenie")
    private Boolean  _osvetlenie;
    @Column(name = "prihlaseny_fk")
    private int  _prihlaseny_fk;
    @Column(name = "body")
    private int _body;


    public Vybava_street() {

    }

    public Boolean get_pneumatiky() {
        return _pneumatiky;
    }

    public void set_pneumatiky(Boolean _pneumatiky) {
        this._pneumatiky = _pneumatiky;
    }

    public Boolean get_naraznik() {
        return _naraznik;
    }

    public void set_naraznik(Boolean _naraznik) {
        this._naraznik = _naraznik;
    }

    public Boolean get_pozdlzny_prekryv_kolies() {
        return _pozdlzny_prekryv_kolies;
    }

    public void set_pozdlzny_prekryv_kolies(Boolean _pozdlzny_prekryv_kolies) {
        this._pozdlzny_prekryv_kolies = _pozdlzny_prekryv_kolies;
    }

    public Boolean get_priecny_prekryv_kolies_plus() {
        return _priecny_prekryv_kolies_plus;
    }

    public void set_priecny_prekryv_kolies_plus(Boolean _priecny_prekryv_kolies_plus) {
        this._priecny_prekryv_kolies_plus = _priecny_prekryv_kolies_plus;
    }

    public Boolean get_priecny_prekryv_kolies_minus() {
        return _priecny_prekryv_kolies_minus;
    }

    public void set_priecny_prekryv_kolies_minus(Boolean _priecny_prekryv_kolies_minus) {
        this._priecny_prekryv_kolies_minus = _priecny_prekryv_kolies_minus;
    }

    public Boolean get_rezerva() {
        return _rezerva;
    }

    public void set_rezerva(Boolean _rezerva) {
        this._rezerva = _rezerva;
    }

    public Boolean get_navijak() {
        return _navijak;
    }

    public void set_navijak(Boolean _navijak) {
        this._navijak = _navijak;
    }

    public Boolean get_tazne_lano() {
        return _tazne_lano;
    }

    public void set_tazne_lano(Boolean _tazne_lano) {
        this._tazne_lano = _tazne_lano;
    }

    public Boolean get_exped_bedna() {
        return _exped_bedna;
    }

    public void set_exped_bedna(Boolean _exped_bedna) {
        this._exped_bedna = _exped_bedna;
    }

    public Boolean get_kanister() {
        return _kanister;
    }

    public void set_kanister(Boolean _kanister) {
        this._kanister = _kanister;
    }

    public Boolean get_ecv() {
        return _ecv;
    }

    public void set_ecv(Boolean _ecv) {
        this._ecv = _ecv;
    }

    public Boolean get_najazdove_plechy() {
        return _najazdove_plechy;
    }

    public void set_najazdove_plechy(Boolean _najazdove_plechy) {
        this._najazdove_plechy = _najazdove_plechy;
    }

    public Boolean get_stierace() {
        return _stierace;
    }

    public void set_stierace(Boolean _stierace) {
        this._stierace = _stierace;
    }

    public Boolean get_zrkadla() {
        return _zrkadla;
    }

    public void set_zrkadla(Boolean _zrkadla) {
        this._zrkadla = _zrkadla;
    }

    public Boolean get_interier() {
        return _interier;
    }

    public void set_interier(Boolean _interier) {
        this._interier = _interier;
    }

    public Boolean getVodic() {
        return vodic;
    }

    public void setVodic(Boolean vodic) {
        this.vodic = vodic;
    }

    public Boolean get_osvetlenie() {
        return _osvetlenie;
    }

    public void set_osvetlenie(Boolean _osvetlenie) {
        this._osvetlenie = _osvetlenie;
    }

    public int get_prihlaseny_fk() {
        return _prihlaseny_fk;
    }

    public void set_prihlaseny_fk(int _prihlaseny_fk) {
        this._prihlaseny_fk = _prihlaseny_fk;
    }

    public int get_body() {
        return _body;
    }

    public void set_body(int _body) {
        this._body = _body;
    }
}
