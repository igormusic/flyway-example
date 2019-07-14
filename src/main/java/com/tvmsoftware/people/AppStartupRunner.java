package com.tvmsoftware.people;

import com.tvmsoftware.people.model.Address;
import com.tvmsoftware.people.model.Person;
import com.tvmsoftware.people.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Slf4j
@Component
public class AppStartupRunner implements ApplicationRunner {

    @Autowired
    PersonRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
       Person person =  new Person("Joe","H","Bloggs", LocalDate.of(1970,1,1));

        Address address = new Address("119 Ingress Road", null,"Toronto","ON", "N8Y1H4", person);

        person.addAddress(address);

        repository.save(person);

        log.info(person.toString());
    }
}