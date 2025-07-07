package corsoBackEnd;

import corsoBackEnd.dao.CatalogoDao;
import corsoBackEnd.entities.Catalogo;
import corsoBackEnd.entities.Libro;
import corsoBackEnd.entities.Periodicita;
import corsoBackEnd.entities.Rivista;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4-W3-D5-B-Progetto");
    public static void main(String[] args) {
        EntityManager em= emf.createEntityManager();
        CatalogoDao ad = new CatalogoDao(em);
        Libro IoSonoGroot = new Libro("ciao sono un codice","Io sono Groot",2022,1500,"Io sono Groot","fantascienza");
        Libro IoSonoIronman = new Libro("Prova314","Ironman",2006,1000,"Robert","fantascienza");
        Rivista Guardia = new Rivista("Sono un codice a Barre","The Guardian",2025,100, Periodicita.SEMESTRALE);
        Rivista Levissima = new Rivista("Prova103","Purissima",2020,30, Periodicita.SETTIMANALE);

        ad.save(IoSonoGroot);
        ad.save(IoSonoIronman);
        ad.save(Guardia);
        ad.save(Levissima);
        em.close();
        emf.close();
    }
}
