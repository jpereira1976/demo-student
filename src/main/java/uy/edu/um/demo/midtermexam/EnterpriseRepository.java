package uy.edu.um.demo.midtermexam;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EnterpriseRepository extends CrudRepository<Enterprise, Integer> {

    List<Enterprise> findByName(String name);

}
