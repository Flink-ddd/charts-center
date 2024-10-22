package com.panda.charts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.panda.charts")
public class ChartsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChartsServiceApplication.class, args);
    }

}
