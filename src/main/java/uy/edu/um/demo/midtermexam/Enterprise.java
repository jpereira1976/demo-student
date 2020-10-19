package uy.edu.um.demo.midtermexam;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "enterprises")
@Builder
@Data
public class Enterprise {
    @Id
    private Integer id;
    private String name;
    private String address;
    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable
            (name="enterprises_employees",
                    joinColumns = @JoinColumn(name="enterprise_id")
            )
    private List<Employee> employees;
}
