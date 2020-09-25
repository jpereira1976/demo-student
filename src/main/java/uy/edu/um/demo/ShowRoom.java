package uy.edu.um.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@JoinColumn(name="showroom_id")
    @JoinTable
            (name="show_room_car",
                    joinColumns = @JoinColumn(name="showroom_id")
            )
    @OrderColumn(name="car_idx")
    List<Car> cars;
}
