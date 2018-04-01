package com.ecut.yrl.ipinche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={
//        JpaRepositoriesAutoConfiguration.class//禁止springboot自动加载持久化bean
//})
public class IpincheApplication {

    public static void main(String[] args) {
        SpringApplication.run(IpincheApplication.class, args);
    }
}
