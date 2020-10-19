package uy.edu.um.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {
    StudentRepository studentRepository;

    @PostMapping("/")
    @Transactional
    public void createStudent(@RequestBody Student student) {
        student.schemaChangeSupport();
        studentRepository.save(student);
    }

    @PostMapping("/bulk")
    @Transactional
    public void create(@RequestBody MultipleStudentRequest request) {
        for (Student student : request.getStudents()) {
            student.schemaChangeSupport();
            studentRepository.save(student);
        }
    }

    @PostMapping("/plano/")
    public void createPlainStudent(@RequestBody String body) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(body, Student.class);
        studentRepository.save(student);
    }

    @GetMapping("/")
    public List<Student> listStudents(@RequestParam(name="firstName",required = false) String firstName,
                                      @RequestParam (name="lastName",required = false) String lastName) {
        if (firstName != null || lastName != null)
           return studentRepository.findAll(StudentSpecification.builder()
                   .firstName(firstName)
                   .lastName(lastName)
                   .build());
        else {
            List<Student> result = new ArrayList<>();
            Iterator<Student> studentIterator = studentRepository.findAll().iterator();
            while (studentIterator.hasNext())
                result.add(studentIterator.next());

            return result;
        }
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") String id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent())
            return studentOptional.get();

        throw new RuntimeException("El estudiante no existe");
    }

    @GetMapping("/find_by_first_name/{name}")
    public List<Student> findByFirstName(@PathVariable("name") String name) {
        return studentRepository.findByFirstName(name);
    }


}
