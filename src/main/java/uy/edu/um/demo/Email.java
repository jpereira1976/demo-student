package uy.edu.um.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Email {
    @Column(name="email_name")
    private String name;
    @Column(name="email_domain")
    private String domain;

    @Override
    public String toString() {
        return String.format("%s@%s", name, domain);
    }
}
