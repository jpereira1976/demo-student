package uy.edu.um.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowroomRepository extends CrudRepository<ShowRoom, Integer> {
}
