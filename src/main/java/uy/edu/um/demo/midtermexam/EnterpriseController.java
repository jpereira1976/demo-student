package uy.edu.um.demo.midtermexam;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {
    private EnterpriseRepository repository;

    @PostMapping("/")
    public void add(@RequestBody Enterprise enterprise) {
        repository.save(enterprise);
    }

    @GetMapping("/")
    public List<Enterprise> all(@RequestParam(name="name", required = false) String name) {
        return (name == null) ? StreamSupport.stream(repository.findAll().spliterator(), false)
                .collect(Collectors.toList()) :
                repository.findByName(name);
    }


}
