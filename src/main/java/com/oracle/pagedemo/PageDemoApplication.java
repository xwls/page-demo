package com.oracle.pagedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oracle.pagedemo.mapper")
public class PageDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PageDemoApplication.class, args);
    }

}
