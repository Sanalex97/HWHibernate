package netology.hibernate.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
public class Persons {
    @Id
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;
    private int age;
    private String phonenumber;
    private String situofliving;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSituofliving() {
        return situofliving;
    }

    public void setSituofliving(String situofliving) {
        this.situofliving = situofliving;
    }
}
