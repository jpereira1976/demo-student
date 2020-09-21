package uy.edu.um.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {
    EmployeeRepository employeeRepository;

    @PostMapping("/")
    public void save(@RequestBody Employee employee) {
        employeeRepository.save(employee);
    }

    @GetMapping("/query")
    public List<Employee> query(@RequestParam("name") String name) {
        return employeeRepository.customFindByName(name);
    }
}
