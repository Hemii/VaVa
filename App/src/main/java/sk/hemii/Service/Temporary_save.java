package sk.hemii.Service;

import sk.hemii.Models.Prihlasenie;
import sk.hemii.Models.Sutaz;

public class Temporary_save {

    static Sutaz _sutaz;
    static Prihlasenie _prihlasenie;

    public static Sutaz get_sutaz() {
        return _sutaz;
    }

    public static void set_sutaz(Sutaz value) {
        _sutaz = value;
    }


    public static Prihlasenie get_prihlasenie() {
        return _prihlasenie;
    }

    public static void set_prihlasenie(Prihlasenie _prihlasenie) {
        Temporary_save._prihlasenie = _prihlasenie;
    }
}
