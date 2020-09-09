package com.stwen.mycat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stwen.mycat.dao*")
public class SpringbootMycatApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMycatApplication.class, args);
    }

}
