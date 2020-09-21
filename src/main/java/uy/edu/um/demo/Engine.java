package uy.edu.um.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Engine {
    @Id
    private Integer id;
    private String make;
    private String model;
    private String size;
    //@OneToOne(mappedBy="engine")
    //private Car car;
}
