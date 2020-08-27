package uy.edu.um.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public void createStudent(@RequestBody Student student) {
        studentRepository.save(schemaChangeSupport(student));
    }

    private Student schemaChangeSupport(Student student) {
        if (student.getMail() != null && !student.getMail().isEmpty() && student.getMail().contains("@")) {
            student.setEmail(new Email(
                    student.getMail().substring(0, student.getMail().indexOf('@')),
                    student.getMail().substring(student.getMail().indexOf('@')+1, student.getMail().length())
                    ));
        }
        return student;
    }

    @PostMapping("/plano/")
    public void createPlainStudent(@RequestBody String body) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(body, Student.class);
        studentRepository.save(student);
    }

    @GetMapping("/")
    public List<Student> listStudents() {
        List<Student> result = new ArrayList<>();
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        while (studentIterator.hasNext())
            result.add(studentIterator.next());

        return result;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") String id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent())
            return studentOptional.get();

        throw new RuntimeException("El estudiante no existe");
    }
}
