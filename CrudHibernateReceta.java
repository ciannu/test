package recetascocina;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CrudHibernateReceta {

    SessionFactory sessionFactory;

    //Constructor el qual crea la sessionFactory
    public CrudHibernateReceta(){

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(RecetaPOJO.class);
        sessionFactory = configuration.buildSessionFactory();

    }


    //Tornem tot el arraylist de recetes
    public List<RecetaPOJO> listarRecetas(){

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<RecetaPOJO> listaRecetas = session.createQuery("from RecetaPOJO", RecetaPOJO.class).getResultList();

        session.getTransaction().commit();
        session.close();

        return listaRecetas;

    }; // FUNCIONA

    //Donat un objecte receta, el guardem en la base de datos
    public void create(RecetaPOJO recetaPOJO){

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(recetaPOJO);

        session.getTransaction().commit();
        session.close();

    }//FUNCIONA



    //Donat un objecte el actualizem en la base de datos
    public void update(RecetaPOJO recetaNueva){

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(recetaNueva);

        session.getTransaction().commit();
        session.close();
    }


    //Donat un objecte de tipo receta, el eliminem de la base de datos
    public void delete(RecetaPOJO receta){

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(receta);

        session.getTransaction().commit();
        session.close();

    }

    public void close(){


        sessionFactory.close();

    }//FUNCIONA




}
