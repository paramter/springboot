package com.lcs.digital.digitalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = "com.lcs.digital")
public class DigitalServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalServiceApplication.class, args);
    }
}
