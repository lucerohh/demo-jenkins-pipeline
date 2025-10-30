package com.upc.dentify.demojenkinspipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemojenkinspipelineApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemojenkinspipelineApplication.class, args);
        System.out.println("Hola Jenkins, soy Elizabeth");
    }

}
