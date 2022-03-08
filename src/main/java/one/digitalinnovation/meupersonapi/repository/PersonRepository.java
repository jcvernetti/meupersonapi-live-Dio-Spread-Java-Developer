package one.digitalinnovation.meupersonapi.repository;

import one.digitalinnovation.meupersonapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
