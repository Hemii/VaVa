package sk.hemii.Models;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name = "vysledky")
public class Vysledok {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

//test