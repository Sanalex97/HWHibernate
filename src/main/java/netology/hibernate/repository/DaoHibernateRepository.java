package netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import netology.hibernate.entity.Persons;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public class DaoHibernateRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public DaoHibernateRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Persons> getPersonByCity(String city) {

        var responseToRequest = entityManager.createNativeQuery("select * from ddl.PERSONS "
                + "where lower(city_of_living) = lower(:city)");

        responseToRequest.setParameter("city", city);

        return responseToRequest.getResultList();
    }
}
