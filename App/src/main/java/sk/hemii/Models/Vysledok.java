package sk.hemii.Models;

import javax.persistence.*;

@Entity
@Table(name = "vysledky")
public class Vysledok {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int _id;

    @Column(name = "celkovy_cas_min")
    private int _celkovy_cas_min;

    @Column(name = "celkovy_cas_sek")
    private int _celkovy_cas_sek;

    @Column(name = "celkove_body")
    private int _celkove_bod;

    @Column(name = "sutaz_id")
    private int _sutaz_id;

    @Column(name = "nick")
    private String _nick;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "prihlasenie_fk", referencedColumnName = "id")
    private Prihlasenie _prihlasenie;

    public Vysledok() {
    }

    public Vysledok(int celkovy_cas_min, int celkovy_cas_msek, int celkove_bod, String _nick, Prihlasenie _prihlasenie, int _sutaz_id) {
        this._celkovy_cas_min = celkovy_cas_min;
        this._celkovy_cas_sek = celkovy_cas_msek;
        this._celkove_bod = celkove_bod;
        this._nick = _nick;
        this._prihlasenie = _prihlasenie;
        this._sutaz_id = _sutaz_id;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_celkovy_cas_min() {
        return _celkovy_cas_min;
    }

    public void set_celkovy_cas_min(int _celkovy_cas_min) {
        this._celkovy_cas_min = _celkovy_cas_min;
    }

    public int get_celkovy_cas_sek() {
        return _celkovy_cas_sek;
    }

    public void set_celkovy_cas_sek(int _celkovy_cas_sek) {
        this._celkovy_cas_sek = _celkovy_cas_sek;
    }

    public int get_celkove_bod() {
        return _celkove_bod;
    }

    public void set_celkove_bod(int _celkove_bod) {
        this._celkove_bod = _celkove_bod;
    }

    public int get_sutaz_id() {
        return _sutaz_id;
    }

    public void set_sutaz_id(int _sutaz_id) {
        this._sutaz_id = _sutaz_id;
    }

    public Prihlasenie get_prihlasenie() {
        return _prihlasenie;
    }

    public void set_prihlasenie(Prihlasenie _prihlasenie) {
        this._prihlasenie = _prihlasenie;
    }

    public String get_nick() {
        return _nick;
    }

    public void set_nick(String _nick) {
        this._nick = _nick;
    }
}

