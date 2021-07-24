package com.redis.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication(scanBasePackages = "com.redis")
@EnableRedisRepositories("com.redis.repository")
public class SpringDataRedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataRedisApplication.class, args);
    }
}
