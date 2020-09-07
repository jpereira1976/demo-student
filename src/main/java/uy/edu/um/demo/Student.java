package uy.edu.um.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name="student")
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
    private Set<String> subjects;

    public void schemaChangeSupport() {
        if (mail != null && !mail.isEmpty() && mail.contains("@"))
            email = new Email(mail.substring(0, mail.indexOf('@')), mail.substring(mail.indexOf('@')+1, mail.length()));
    }
}
