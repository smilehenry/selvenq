package com.sevlenq.clienteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientEurekaApplication.class, args);
    }

    @RequestMapping(value = "info")
    public String info(){
        return "Hello Eureka!";
    }
}
