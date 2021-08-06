package com.example.helloworldrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldRestApiApplication.class, args);
    }
    @GetMapping("/hello")
   public String helloWorld()
   {
       return "Hello World";
   }



}
