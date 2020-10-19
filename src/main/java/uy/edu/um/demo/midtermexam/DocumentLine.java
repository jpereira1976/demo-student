package uy.edu.um.demo.midtermexam;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentLine {
    private Integer line;
    private String productCode;
    private Double quantity;
    private Double price;
}
