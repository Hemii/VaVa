package sk.hemii;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Criteria;
import sk.hemii.Models.Pretekar;
import sk.hemii.Models.Prihlasenie;
import sk.hemii.Models.Sutaz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class App extends Application
{


    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/DashBoard.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();
    }



    public static void main(String[] args) throws Exception {


        launch(args);

    }

//    public static void main( String[] args )
//    {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//
//
//        entityManager.getTransaction().begin();
//
//        List<Pretekar> sutaze = entityManager.createQuery("FROM Pretekar where id = 2", Pretekar.class).getResultList();
//        for (Pretekar row: sutaze) {
//            System.out.println(row.get_priezvisko());
//        }

//        Pretekar pretekar = entityManager.find(Pretekar.class, 0);
//        System.out.println(pretekar.get_id());

//        Criteria criteria = entityManager.createCriteria(Pretekar.class);
//        List<Pretekar> list = criteria.add(Restrictions.eq("yourField", yourFieldValue)).list();

//        entityManager.getTransaction().commit();
//
//
//
//
//
//
//
//
//        metoda1(entityManager);
//        metoda2(entityManager);
//
//
//
//
//        entityManager.close();
//    }

    private static void metoda3(EntityManager entityManager) {
        entityManager.getTransaction().begin();
        Prihlasenie sutaz = new Prihlasenie();
//        sutaz.set_id("Revuca");
//        sutaz.set_pocet_sek(5);
//        sutaz.set_datum("28.10.9999");
//        sutaz.set_casovy_limit(10);
        entityManager.persist(sutaz);

        entityManager.getTransaction().commit();

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
