package com.wei.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProviderUser3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderUser3Application.class, args);
    }

}
