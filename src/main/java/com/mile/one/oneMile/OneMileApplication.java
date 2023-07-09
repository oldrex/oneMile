package com.mile.one.oneMile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mile.one.oneMile.models.Greeting;
import com.mile.one.oneMile.models.Quote;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class OneMileApplication {
    private static final Logger log = LoggerFactory.getLogger(OneMileApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OneMileApplication.class, args);
    }

    @GetMapping("/")
    @ResponseBody
    public Greeting hello() {
        return new Greeting(123, "123");
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject(
                    "http://localhost:8080/api/random", Quote.class);
            log.info(quote.toString());
        };
    }
}