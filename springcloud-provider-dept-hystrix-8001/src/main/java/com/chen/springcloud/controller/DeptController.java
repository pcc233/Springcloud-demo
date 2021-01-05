package com.chen.springcloud.controller;

import com.chen.springcloud.pojo.Dept;
import com.chen.springcloud.service.DeptService;
import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;
import java.util.List;

/**
 * @author chenwenzhuo
 * @date 2020/12/16 17:23
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);

        if (dept==null){
            throw new RuntimeException("id=>"+id+",不存在用户~");
        }
        return dept;
    }

    public Dept hystrixGet(@PathVariable("id") Long id){

        return new Dept().setDeptno(id)
                .setDname("id=>"+id+",没有对应的信息~--@我是Hystrix")
                .setDb_source("no this datebase in MySQL");
    }
}
