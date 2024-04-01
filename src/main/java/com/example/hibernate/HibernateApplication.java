package com.example.hibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author heyunlin
 * @version 1.0
 */
@SpringBootApplication
@EnableJpaRepositories
public class HibernateApplication {
    private static final Logger logger = LoggerFactory.getLogger(HibernateApplication.class);
    public static void main(String[] args) {
        if (logger.isDebugEnabled()) {
            logger.debug("启动hibernate...");
        }
        SpringApplication.run(HibernateApplication.class, args);
    }
    //在这添加一部分注解，第二次修改
}