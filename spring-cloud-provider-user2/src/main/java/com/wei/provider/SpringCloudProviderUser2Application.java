package com.wei.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProviderUser2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderUser2Application.class, args);
    }

}
