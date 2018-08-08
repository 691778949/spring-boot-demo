package edu.zut.springboot.demo.dao;

import edu.zut.springboot.demo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface PersonDao extends JpaRepository<Person,Long>{

    public Person save(Person person);

    /**
     * Delete sentence need "Transactional"
     * @param id
     */
    public void deleteById(Long id);

    /**
     * Update sentence need "@Modify"
     * @param name
     * @param id
     */
    @Modifying
    @Query(value = "update Person person set person.name= :name where person.id= :id")
    public void updateNameById(@Param("name") String name,@Param("id") Long id);

    @Query(value = "select person from Person person where person.name=?1")
    public List<Person> findByName(String name);

    public Person findById(Long id);

    public List<Person> findAll();
}
