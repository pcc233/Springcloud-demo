package com.chen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author chenwenzhuo
 * @date 2020/12/18 10:31
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashboard_9001 {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard_9001.class,args);
    }
}
