package uy.edu.um.demo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name="employee")
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name="DISCRIMINATOR",
        discriminatorType=DiscriminatorType.STRING, length = 20)
@DiscriminatorValue(value="EMPLOYEE")
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Employee.class, name = "employee"),
    @JsonSubTypes.Type(value = Executive.class, name = "executive")
})
public class Employee {
    @Id
    private Integer id;
    private String name;
}
