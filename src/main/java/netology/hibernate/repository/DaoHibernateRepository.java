package netology.hibernate.repository;

import netology.hibernate.entity.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class DaoHibernateRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public DaoHibernateRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Persons> getPersonByCity(String city) {

        Persons persons1 = new Persons();
        persons1.setName("Alexey");
        persons1.setSituofliving("Moscow");

        entityManager.persist(persons1);

        return null;
    }
}
