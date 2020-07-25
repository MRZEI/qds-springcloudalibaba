package com.gree.qdsalibabanacosconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;

/**
 * 程序主入口
 *
 */
@SpringBootApplication
@EnableSwaggerBootstrapUI
@EnableDiscoveryClient
public class QdsAlibabaNacosConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(QdsAlibabaNacosConfigApplication.class, args);
    }

}
