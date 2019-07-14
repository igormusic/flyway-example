package com.tvmsoftware.people.repository;

import com.tvmsoftware.people.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {
}
