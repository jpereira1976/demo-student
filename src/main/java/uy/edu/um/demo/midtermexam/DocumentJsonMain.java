package uy.edu.um.demo.midtermexam;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.Date;

public class DocumentJsonMain {

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(SaleDocument.builder()
                .date(new Date())
                .id(1234)
                .lines(Arrays.asList(DocumentLine.builder()
                        .line(1)
                        .productCode("1234567890")
                        .price(200.0)
                        .quantity(1.0)
                        .build(),
                        DocumentLine.builder()
                                .line(2)
                                .productCode("1234567891")
                                .price(150.0)
                                .quantity(2.0)
                                .build())
                        )
                .build()));

        System.out.println(mapper.writeValueAsString(ReturnDocument.builder()
                .date(new Date())
                .id(2345)
                .lines(Arrays.asList(DocumentLine.builder()
                                .line(1)
                                .productCode("1234567890")
                                .price(200.0)
                                .quantity(1.0)
                                .build(),
                        DocumentLine.builder()
                                .line(2)
                                .productCode("1234567891")
                                .price(150.0)
                                .quantity(2.0)
                                .build())
                )
                .refId(1234)
                .build()));
    }
}
