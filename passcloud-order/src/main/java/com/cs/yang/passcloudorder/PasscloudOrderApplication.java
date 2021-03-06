package com.cs.yang.passcloudorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan("com.cs.yang.*.*")
public class PasscloudOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasscloudOrderApplication.class, args);
    }

}

