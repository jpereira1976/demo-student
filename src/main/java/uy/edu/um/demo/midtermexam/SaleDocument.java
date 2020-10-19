package uy.edu.um.demo.midtermexam;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = SaleDocument.class, name = "sale"),
        @JsonSubTypes.Type(value = ReturnDocument.class, name = "return")
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class SaleDocument {
    private Integer id;
    private Date date;
    private List<DocumentLine> lines;
}
