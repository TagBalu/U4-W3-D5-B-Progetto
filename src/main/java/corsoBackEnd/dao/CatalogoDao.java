package corsoBackEnd.dao;

import corsoBackEnd.entities.Catalogo;
import corsoBackEnd.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;



public class CatalogoDao {
    private final EntityManager entityManager;

    public CatalogoDao(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    public void save(Catalogo newCatalago){
        EntityTransaction transaction= entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newCatalago);
        transaction.commit();
        System.out.println("Il libro " + newCatalago.getTitolo()+" è stato creato correttamente!");
    }

    public Catalogo findById(long CatalogoId){
        Catalogo found = entityManager.find(Catalogo.class, CatalogoId);
        if (found == null) throw new NotFoundException(CatalogoId);
        return found;
    }


}
