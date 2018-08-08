package edu.zut.springboot.demo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "SPRING_BOOT_DEMO_PERSON")
@Entity
public class Person implements Serializable{

    @Column(name = "NAME")
    String name;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
