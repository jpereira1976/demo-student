package uy.edu.um.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends CrudRepository<Student, String> {

    List<Student> findByFirstName(String firstName);

}
