package uy.edu.um.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MainRestClient {
    public static void main(String[] args) throws JsonProcessingException {
        RestTemplate template = new RestTemplate();
        ResponseEntity<String> response
                = template.getForEntity("http://localhost:8080/students/2", String.class);

        System.out.println(new ObjectMapper().readValue(response.getBody(), Student.class));
    }
}
