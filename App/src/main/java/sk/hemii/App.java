package sk.hemii;



import sk.hemii.Models.Pretekar;
import sk.hemii.Models.Sutaz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
        EntityManager entityManager = entityManagerFactory.createEntityManager();



        metoda1(entityManager);
      //  metoda2(entityManager);




        entityManager.close();
    }

    private static void metoda1(EntityManager entityManager) {
        entityManager.getTransaction().begin();
        Sutaz sutaz = new Sutaz();
        sutaz.set_miesto("Revuca");
        sutaz.set_pocet_sek(5);
        sutaz.set_datum("28.10.9999");
        sutaz.set_casovy_limit(10);
        entityManager.persist(sutaz);

        entityManager.getTransaction().commit();

    }

    private static void metoda2(EntityManager entityManager) {
        entityManager.getTransaction().begin();


        Pretekar pretekar = new Pretekar();
        pretekar.set_meno("Fero");
        pretekar.set_priezvisko("babko");
        pretekar.set_nick("FF");
        pretekar.set_s_cislo(456);

        entityManager.persist(pretekar);

        entityManager.getTransaction().commit();

    }




}
