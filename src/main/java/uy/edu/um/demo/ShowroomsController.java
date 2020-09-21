package uy.edu.um.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
