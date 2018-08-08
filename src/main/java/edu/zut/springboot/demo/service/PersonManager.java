package edu.zut.springboot.demo.service;

import edu.zut.springboot.demo.domain.Person;

import java.util.List;

public interface PersonManager {

    public Person save(Person person);

    public void deleteById(Long id);

    public void updateNameById(String name,Long id);

    public List<Person> findByName(String name);

    public Person findById(Long id);

    public List<Person> findAll();
}
