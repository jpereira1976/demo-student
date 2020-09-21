package uy.edu.um.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CarJsonSerializationExample {

    public static void main(String[] args) throws JsonProcessingException {
        Car car = new Car();
        car.setColor("rojo");
        car.setId(1);
        car.setName("Toyota");
        Engine engine = new Engine();
        engine.setId(1);
        engine.setMake("Toyota");
        engine.setModel("Corolla");
        engine.setModel("1.6VTI");
        car.setEngine(engine);

        System.out.println(new ObjectMapper().writeValueAsString(car));

    }
}
