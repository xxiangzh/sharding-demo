package com.xzh.sharding;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author 向振华
 * @date 2020/12/08 12:00
 */
@SpringBootApplication(exclude = JtaAutoConfiguration.class)
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Resource
    private DataSource dataSource;

    @Override
    public void run(String... args) {
        System.out.println(dataSource);
    }
}
