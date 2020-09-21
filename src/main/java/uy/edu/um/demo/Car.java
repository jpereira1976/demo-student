package uy.edu.um.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
    @Id
    private Integer id;
    private String name;
    private String color;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="engine_id")
    private Engine engine;
}
