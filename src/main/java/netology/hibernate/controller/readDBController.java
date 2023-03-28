package netology.hibernate.controller;

import netology.hibernate.entity.Persons;
import netology.hibernate.repository.DaoHibernateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class readDBController {
    private final DaoHibernateRepository daoHibernateRepository;

    public readDBController(DaoHibernateRepository daoHibernateRepository) {
        this.daoHibernateRepository = daoHibernateRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> readDBPerson(@RequestParam String city) {
        System.out.println(city);
        return daoHibernateRepository.getPersonByCity(city);
    }
}
