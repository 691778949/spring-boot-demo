package edu.zut.springboot.demo.manager.impl.test;

import edu.zut.springboot.demo.TestApplication;
import edu.zut.springboot.demo.domain.Person;
import edu.zut.springboot.demo.service.PersonManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
//@ContextConfiguration(classes = {JpaConfiguration.class})
public class PersonManagerImplTest {

    @Autowired
    PersonManager personManager;

    @Test
    public void testInvoke(){
        Person person=new Person();
        person.setName("666");
        this.personManager.save(person);
    }

    @Test
    public void testDelete(){
        this.personManager.deleteById(63867L);
    }

    @Test
    public void testUpdateNameById(){
        this.personManager.updateNameById("777",63868L);
    }

    @Test
    public void testFindByName(){
        System.out.println(this.personManager.findByName("777").size());
    }

    @Test
    public void testFind(){
        List<Person> personList=this.personManager.findAll();
        System.out.println(personList.size());
        if(personList.size()>0){
            System.out.println(this.personManager.findById(personList.get(0).getId()));
        }
    }
}
