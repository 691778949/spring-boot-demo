package edu.zut.springboot.demo;

import edu.zut.springboot.demo.config.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = "edu.zut.springboot.demo")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
