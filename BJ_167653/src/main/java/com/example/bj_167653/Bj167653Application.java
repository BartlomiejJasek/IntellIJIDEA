package com.example.bj_167653;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Bj167653Application {

    public static void main(String[] args) {
        SpringApplication.run(Bj167653Application.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "Bezimienny") String name) {
        return String.format("Witaj %s!", name);
    }

}





