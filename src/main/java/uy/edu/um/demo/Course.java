package uy.edu.um.demo;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Course {
    @Id
    private CoursePk coursePk;
    private int students;
}
