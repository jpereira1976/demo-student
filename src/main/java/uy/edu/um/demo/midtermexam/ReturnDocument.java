package uy.edu.um.demo.midtermexam;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
public class ReturnDocument extends SaleDocument {
    private Integer refId;
}
