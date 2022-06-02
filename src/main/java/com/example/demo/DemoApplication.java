package com.example.demo;

import com.example.demo.service.MainService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class DemoApplication {
//
//    @Bean
//    public DataSource dataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        return dataSource;
//    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		DataSource dataSource = applicationContext.getBean(DataSource.class);
        MainService mainService = applicationContext.getBean(MainService.class);
		System.out.println(mainService);


    }

}
