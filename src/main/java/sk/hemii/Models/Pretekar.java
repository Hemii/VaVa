package sk.hemii.Models;

import javax.persistence.*;

@Entity
@Table(name = "pretekari")
public class Pretekar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int _id;

    @Column(name = "meno")
    private String _meno;

    @Column(name = "priezvisko")
    private String _priezvisko;

    @Column(name = "nick")
    private String _nick;

    @Column(name = "startovne_cislo")
    private int _s_cislo;

    @Column(name = "email")
    private String _email;

    @Column(name = "tel")
    private String _tel;

    public Pretekar() {
    }

    public Pretekar(String _meno, String _priezvisko, String _nick, int _s_cislo, String _email, String _tel) {
        this._meno = _meno;
        this._priezvisko = _priezvisko;
        this._nick = _nick;
        this._s_cislo = _s_cislo;
        this._email = _email;
        this._tel = _tel;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_meno() {
        return _meno;
    }

    public void set_meno(String _meno) {
        this._meno = _meno;
    }

    public String get_priezvisko() {
        return _priezvisko;
    }

    public void set_priezvisko(String _priezvisko) {
        this._priezvisko = _priezvisko;
    }

    public String get_nick() {
        return _nick;
    }

    public void set_nick(String _nick) {
        this._nick = _nick;
    }

    public int get_s_cislo() {
        return _s_cislo;
    }

    public void set_s_cislo(int _s_cislo) {
        this._s_cislo = _s_cislo;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_tel() {
        return _tel;
    }

    public void set_tel(String _tel) {
        this._tel = _tel;
    }
}
