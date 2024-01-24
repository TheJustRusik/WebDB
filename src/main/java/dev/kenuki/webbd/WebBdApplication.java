package dev.kenuki.webbd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class WebBdApplication {
    @Autowired
    private JobsRepository jobsRepository;

    public static void main(String[] args) {
        SpringApplication.run(WebBdApplication.class, args);
    }


}
