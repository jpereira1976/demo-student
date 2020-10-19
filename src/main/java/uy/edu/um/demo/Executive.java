package uy.edu.um.demo;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value="EXECUTIVE")
@Data
public class Executive extends OneEmployee {
    String role;
}
