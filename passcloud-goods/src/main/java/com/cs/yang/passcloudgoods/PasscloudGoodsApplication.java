package com.cs.yang.passcloudgoods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.cs.yang.*.*")
public class PasscloudGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasscloudGoodsApplication.class, args);
    }

}

