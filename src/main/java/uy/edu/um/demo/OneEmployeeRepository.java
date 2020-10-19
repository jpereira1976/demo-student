package uy.edu.um.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OneEmployeeRepository extends CrudRepository<OneEmployee, Integer> {

    List<OneEmployee> findByName(String name);

    @Query("from uy.edu.um.demo.OneEmployee where name=?1")
    List<OneEmployee> customFindByName(String name);

}
