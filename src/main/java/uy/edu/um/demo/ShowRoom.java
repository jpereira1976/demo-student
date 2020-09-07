package uy.edu.um.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ShowRoom {
    @Id
    private Integer id;
    private String manager;
    private String location;
    @OneToMany
    @JoinColumn(name="showroom_id")
    List<Car> cars;
}
