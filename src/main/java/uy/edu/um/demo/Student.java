package uy.edu.um.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Student {
    @Id
    @Column(length = 16)
    private String id;
    private String firstName;
    private String lastName;
    private String mail;
    @Embedded
    private Email email;
    @ElementCollection
    private List<String> subjects;
}
