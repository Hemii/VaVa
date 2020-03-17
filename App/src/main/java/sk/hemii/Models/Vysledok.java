package sk.hemii.Models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.text.DateFormat;

@Entity
@Table()
public class Vysledok {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "celkovy_cas")
    private DateFormat celkovy_cas;

    @Column(name = "celkove_body")
    private int celkove_bod;

    @Column(name = "sutaz_fk")
    private int sutaz_fk;

    @Column(name = "prihlaseny_fk")
    private int prihlaseny_fk;
}
