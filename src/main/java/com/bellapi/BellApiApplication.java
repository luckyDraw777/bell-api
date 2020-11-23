package com.bellapi;

import com.bellapi.service.impl.OrganizationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BellApiApplication {



    public static void main(String[] args) {
        SpringApplication.run(BellApiApplication.class, args);
    }

}
