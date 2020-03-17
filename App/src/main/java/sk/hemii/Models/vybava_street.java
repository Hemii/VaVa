package sk.hemii.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vybava_street")
public class vybava_street {


    private Boolean  pneumatiky;
    private Boolean  naraznik;
    private Boolean  pozdlzny_prekryv_kolies;
    private Boolean  priecny_prekryv_kolies_plus;
    private Boolean  priecny_prekryv_kolies_minus;
    private Boolean  rezerva;
    private Boolean  navijak;
    private Boolean  tazne_lano;
    private Boolean  exped_bedna;
    private Boolean  kanister;
    private Boolean  ecv;
    private Boolean  najazdove_plechy;
    private Boolean  stierace;
    private Boolean  zrkadla;
    private Boolean  interier;
    private Boolean  vodic;
    private Boolean  osvetlenie;
    private int  prihlaseny_fk;
    private int body;


    public vybava_street() {

    }

    public Boolean getPneumatiky() {
        return pneumatiky;
    }

    public void setPneumatiky(Boolean pneumatiky) {
        this.pneumatiky = pneumatiky;
    }

    public Boolean getNaraznik() {
        return naraznik;
    }

    public void setNaraznik(Boolean naraznik) {
        this.naraznik = naraznik;
    }

    public Boolean getPozdlzny_prekryv_kolies() {
        return pozdlzny_prekryv_kolies;
    }

    public void setPozdlzny_prekryv_kolies(Boolean pozdlzny_prekryv_kolies) {
        this.pozdlzny_prekryv_kolies = pozdlzny_prekryv_kolies;
    }

    public Boolean getPriecny_prekryv_kolies_plus() {
        return priecny_prekryv_kolies_plus;
    }

    public void setPriecny_prekryv_kolies_plus(Boolean priecny_prekryv_kolies_plus) {
        this.priecny_prekryv_kolies_plus = priecny_prekryv_kolies_plus;
    }

    public Boolean getPriecny_prekryv_kolies_minus() {
        return priecny_prekryv_kolies_minus;
    }

    public void setPriecny_prekryv_kolies_minus(Boolean priecny_prekryv_kolies_minus) {
        this.priecny_prekryv_kolies_minus = priecny_prekryv_kolies_minus;
    }

    public Boolean getRezerva() {
        return rezerva;
    }

    public void setRezerva(Boolean rezerva) {
        this.rezerva = rezerva;
    }

    public Boolean getNavijak() {
        return navijak;
    }

    public void setNavijak(Boolean navijak) {
        this.navijak = navijak;
    }

    public Boolean getTazne_lano() {
        return tazne_lano;
    }

    public void setTazne_lano(Boolean tazne_lano) {
        this.tazne_lano = tazne_lano;
    }

    public Boolean getExped_bedna() {
        return exped_bedna;
    }

    public void setExped_bedna(Boolean exped_bedna) {
        this.exped_bedna = exped_bedna;
    }

    public Boolean getKanister() {
        return kanister;
    }

    public void setKanister(Boolean kanister) {
        this.kanister = kanister;
    }

    public Boolean getEcv() {
        return ecv;
    }

    public void setEcv(Boolean ecv) {
        this.ecv = ecv;
    }

    public Boolean getNajazdove_plechy() {
        return najazdove_plechy;
    }

    public void setNajazdove_plechy(Boolean najazdove_plechy) {
        this.najazdove_plechy = najazdove_plechy;
    }

    public Boolean getStierace() {
        return stierace;
    }

    public void setStierace(Boolean stierace) {
        this.stierace = stierace;
    }

    public Boolean getZrkadla() {
        return zrkadla;
    }

    public void setZrkadla(Boolean zrkadla) {
        this.zrkadla = zrkadla;
    }

    public Boolean getInterier() {
        return interier;
    }

    public void setInterier(Boolean interier) {
        this.interier = interier;
    }

    public Boolean getVodic() {
        return vodic;
    }

    public void setVodic(Boolean vodic) {
        this.vodic = vodic;
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

    public int getPrihlaseny_fk() {
        return prihlaseny_fk;
    }

    public void setPrihlaseny_fk(int prihlaseny_fk) {
        this.prihlaseny_fk = prihlaseny_fk;
    }
}
