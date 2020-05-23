package sk.hemii.Models;

import javax.persistence.*;

@Entity
@Table(name = "prihlasenia")
public class Prihlasenie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int _id;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sutaz_fk",referencedColumnName = "id")
    private Sutaz _sutaz;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pretekar_fk",referencedColumnName = "id")
    private Pretekar _pretekar;

    public Prihlasenie() {
    }


    public int get_id() {
        return _id;
    }



    public Sutaz get_sutaz_id() {
        return _sutaz;
    }


    public Pretekar get_pretekar() {
        return _pretekar;
    }
}
