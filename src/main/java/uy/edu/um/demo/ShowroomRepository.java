package uy.edu.um.demo;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowroomRepository extends PagingAndSortingRepository<ShowRoom, Integer> {

    List<ShowRoom> findByManager(String manager, Pageable pageable);

    @Query("select s from ShowRoom s where s.manager = ?1")
    List<ShowRoom> findByAsIwish(String manager);

}
