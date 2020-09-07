package uy.edu.um.demo;

import lombok.Data;

import java.util.List;

@Data
public class MultipleStudentRequest {
    private List<Student> students;
}
