package uy.edu.um.demo.midtermexam;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="employees")
public class Employee {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
}
