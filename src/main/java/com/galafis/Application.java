package com.galafis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Enterprise Security Management Framework
 * @author Gabriel Demetrios Lafis
 */
@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @GetMapping("/")
    public String home() {
        return "Enterprise Security Management Framework - Created by Gabriel Demetrios Lafis";
    }
}
