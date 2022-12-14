package com.basic.auth;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        try {
            SpringApplication springApplication = new SpringApplication(Application.class);
            springApplication.setBannerMode(Banner.Mode.OFF);
            springApplication.run(args);
        } catch (Throwable t) {
            t.printStackTrace();
            throw t;
        }
    }
}
