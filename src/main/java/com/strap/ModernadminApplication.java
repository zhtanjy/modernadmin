package com.strap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.strap.mapper")
public class ModernadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModernadminApplication.class, args);
    }

}
