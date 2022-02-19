package example.project.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.project.backend.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	public Person findByUname(String uname);
}
