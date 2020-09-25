package uy.edu.um.demo;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/showrooms")
@AllArgsConstructor
public class ShowroomsController {
    ShowroomRepository repository;
    CarRepository carRepository;

    @PostMapping("/")
    public void create(@RequestBody ShowRoom showroom) {
        /*for (Car car : showroom.getCars())
            carRepository.save(car);*/
        repository.save(showroom);
    }

    @GetMapping("/")
    public List<ShowRoom> all(@RequestParam(value = "manager",required = false) String manager,
                              @RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        if (manager == null)
            return StreamSupport.stream(repository.findAll(PageRequest.of(page, size)).spliterator(), false)
                    .collect(Collectors.toList());
        else
            //return repository.findByManager(manager, PageRequest.of(page, size));
            return repository.findByAsIwish(manager);
    }



}
