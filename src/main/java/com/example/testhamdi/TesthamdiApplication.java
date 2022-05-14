package com.example.testhamdi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TesthamdiApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TesthamdiApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ClubRespository clubRespository) {
        return args->{
            clubRespository.save(new Club(1L,"est",new Date()));
            clubRespository.save(new Club(2L,"ca",new Date()));
        };
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TesthamdiApplication.class);
    }
}
