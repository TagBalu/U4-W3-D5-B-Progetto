package corsoBackEnd;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4-W3-D5-B-Progetto");

        EntityManager em= emf.createEntityManager();

        System.out.println("Hello World!");

        em.close();
        emf.close();
    }
}
