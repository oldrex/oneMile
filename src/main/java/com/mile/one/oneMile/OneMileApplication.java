package com.mile.one.oneMile;

import com.mile.one.oneMile.models.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OneMileApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneMileApplication.class, args);
    }

    @GetMapping("/")
    @ResponseBody
    public Greeting hello() {
        return new Greeting(123,"123");
    }
}