package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {


    @GetMapping("/hello")
    public String home() {
        return "Halló! ";
    }

    @GetMapping("/hi")
    public String hi() {
        return "Hæ! ";
    }
    @GetMapping("/hello/{name}")
    public String name(@PathVariable String name){
       return "Halló " + name;
    }
    
}
