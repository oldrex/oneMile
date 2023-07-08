package com.mile.one.oneMile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OneMileApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneMileApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "nice to meet you, the rich man!";
    }
}
    set HTTP_PROXY=http://127.0.0.1:7890 && set HTTPS_PROXY=http://127.0.0.1:7890