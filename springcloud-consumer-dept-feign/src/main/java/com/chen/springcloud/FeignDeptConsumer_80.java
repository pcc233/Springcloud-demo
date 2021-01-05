package com.chen.springcloud;

import com.chen.myRule.ChenRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author chenwenzhuo
 * @date 2020/12/16 18:48
 */
@SpringBootApplication(scanBasePackages = "com.chen.springcloud")
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.chen.springcloud"})
public class FeignDeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class,args);
    }
}
