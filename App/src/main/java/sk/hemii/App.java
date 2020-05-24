package sk.hemii;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
<<<<<<< HEAD
import sk.hemii.Models.*;
=======
import sk.hemii.Models.Pretekar;
import sk.hemii.Models.Prihlasenie;
import sk.hemii.Models.Sutaz;
>>>>>>> a25416e4f9f4b27a7b3c5c712ac5512e736a167b

import javax.persistence.EntityManager;


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
//
//    public static void main( String[] args )
//    {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hemii");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//
//
////        entityManager.getTransaction().begin();
//
////        Prihlasenie prihlasenie = new Prihlasenie();
////        Vybava_street vybava_street = new Vybava_street();
////        vybava_street = entityManager.find(Vybava_street.class,5);
////
////        Pretekar pretekar = new Pretekar();
////        pretekar = entityManager.find(Pretekar.class,2);
////
////        Sutaz sutaz = new Sutaz();
////        sutaz = entityManager.find(Sutaz.class,18);
////
////        prihlasenie.set_sutaz(sutaz);
////        prihlasenie.set_kategoria("ultimate");
////        prihlasenie.set_vybava_street(vybava_street);
////        prihlasenie.set_pretekar(pretekar);
////
////        entityManager.persist(prihlasenie);
//        metoda2(entityManager);
//
////        entityManager.getTransaction().commit();
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
