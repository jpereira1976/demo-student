package uy.edu.um.demo.midtermexam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamMember {
    private String firstName;
    private String lastName;
    private int age;
}
