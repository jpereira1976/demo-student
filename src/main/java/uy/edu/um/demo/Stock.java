package uy.edu.um.demo;

import lombok.Data;
import org.apache.catalina.Store;

@Data
public class Stock {
    private Product product;
    private Store store;
    private double quantity;
}
