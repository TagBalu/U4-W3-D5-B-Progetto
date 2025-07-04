package corsoBackEnd;

import corsoBackEnd.dao.CatalogoDao;
import corsoBackEnd.entities.Catalogo;
import corsoBackEnd.entities.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4-W3-D5-B-Progetto");
    public static void main(String[] args) {
        EntityManager em= emf.createEntityManager();
        CatalogoDao ad = new CatalogoDao(em);




        em.close();
        emf.close();
    }
}
