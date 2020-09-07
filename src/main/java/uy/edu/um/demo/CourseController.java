package uy.edu.um.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/courses")
@AllArgsConstructor
public class CourseController {
    CourseRepository repository;

    @PostMapping("/")
    public void save(@RequestBody Course course) {
        repository.save(course);
    }

    @GetMapping("/{tutor}/{title}")
    public Course load(@PathVariable("tutor") String tutor, @PathVariable("title") String title) {
        Optional<Course> courseOptional = repository.findById(new CoursePk(tutor, title));
        if (courseOptional.isPresent())
            return courseOptional.get();
        else
            throw new RuntimeException("No existe curso");
    }
}
