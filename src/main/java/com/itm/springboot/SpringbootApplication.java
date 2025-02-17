package com.itm.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringbootApplication.class, args);
        openHomePage();
    }

    private static void openHomePage() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8080/");
    }

}
