package uy.edu.um.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/oneemployee")
@AllArgsConstructor
public class OneEmployeeController {
    OneEmployeeRepository employeeRepository;

    @PostMapping("/")
    public void save(@RequestBody OneEmployee employee) {
        employeeRepository.save(employee);
    }

    @GetMapping("/query")
    public List<OneEmployee> query(@RequestParam("name") String name) {
        return employeeRepository.customFindByName(name);
    }
}
