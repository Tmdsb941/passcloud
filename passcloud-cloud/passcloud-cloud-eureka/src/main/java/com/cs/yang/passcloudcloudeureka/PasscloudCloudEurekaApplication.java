package com.cs.yang.passcloudcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PasscloudCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasscloudCloudEurekaApplication.class, args);
    }

}
