package com.library.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/12
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class);
        System.out.println("====my library start up =======");
    }
}
