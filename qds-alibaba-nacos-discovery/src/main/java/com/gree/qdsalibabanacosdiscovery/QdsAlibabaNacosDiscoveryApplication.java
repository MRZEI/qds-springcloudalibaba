package com.gree.qdsalibabanacosdiscovery;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableSwaggerBootstrapUI
@EnableDiscoveryClient
public class QdsAlibabaNacosDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(QdsAlibabaNacosDiscoveryApplication.class, args);
    }

}
