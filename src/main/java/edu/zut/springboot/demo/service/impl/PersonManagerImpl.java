package edu.zut.springboot.demo.service.impl;

import edu.zut.springboot.demo.dao.PersonDao;
import edu.zut.springboot.demo.domain.Person;
import edu.zut.springboot.demo.service.PersonManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonManagerImpl implements PersonManager{

    PersonDao personDao;
    @Autowired
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public Person save(Person person) {
        return this.personDao.save(person);
    }

    @Override
    public void deleteById(Long id) {
        this.personDao.deleteById(id);
    }

    @Override
    public void updateNameById(String name, Long id) {
        this.personDao.updateNameById(name, id);
    }

    @Override
    public List<Person> findByName(String name) {
        return this.personDao.findByName(name);
    }

    @Override
    public List<Person> findAll() {
        return this.personDao.findAll();
    }

    @Override
    public Person findById(Long id) {
        return this.personDao.findById(id);
    }
}
