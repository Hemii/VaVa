package sk.hemii.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vybava_ultimate")
public class vybava_ultimate {

    private int   prilaseny_fk;
    private Boolean   pneumatiky_minus;
    private Boolean   naraznik;
    private Boolean   pneumatiky_plus;
    private Boolean   pozdlzny_prekryv_kolies;
    private Boolean    priecny_prekryv_kolies;
    private Boolean    ecv;
    private Boolean    osvetlenie;
    private int    body;


    public vybava_ultimate() {
    }

    public int getPrilaseny_fk() {
        return prilaseny_fk;
    }

    public void setPrilaseny_fk(int prilaseny_fk) {
        this.prilaseny_fk = prilaseny_fk;
    }

    public Boolean getPneumatiky_minus() {
        return pneumatiky_minus;
    }

    public void setPneumatiky_minus(Boolean pneumatiky_minus) {
        this.pneumatiky_minus = pneumatiky_minus;
    }

    public Boolean getNaraznik() {
        return naraznik;
    }

    public void setNaraznik(Boolean naraznik) {
        this.naraznik = naraznik;
    }

    public Boolean getPneumatiky_plus() {
        return pneumatiky_plus;
    }

    public void setPneumatiky_plus(Boolean pneumatiky_plus) {
        this.pneumatiky_plus = pneumatiky_plus;
    }

    public Boolean getPozdlzny_prekryv_kolies() {
        return pozdlzny_prekryv_kolies;
    }

    public void setPozdlzny_prekryv_kolies(Boolean pozdlzny_prekryv_kolies) {
        this.pozdlzny_prekryv_kolies = pozdlzny_prekryv_kolies;
    }

    public Boolean getPriecny_prekryv_kolies() {
        return priecny_prekryv_kolies;
    }

    public void setPriecny_prekryv_kolies(Boolean priecny_prekryv_kolies) {
        this.priecny_prekryv_kolies = priecny_prekryv_kolies;
    }

    public Boolean getEcv() {
        return ecv;
    }

    public void setEcv(Boolean ecv) {
        this.ecv = ecv;
    }

    public Boolean getOsvetlenie() {
        return osvetlenie;
    }

    public void setOsvetlenie(Boolean osvetlenie) {
        this.osvetlenie = osvetlenie;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }
}
