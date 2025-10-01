package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
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
    
}
