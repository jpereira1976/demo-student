package uy.edu.um.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findByName(String name);

    @Query("from uy.edu.um.demo.Employee where name=?1")
    List<Employee> customFindByName(String name);

}
