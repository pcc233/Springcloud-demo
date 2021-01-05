package com.chen.springcloud.controller;

import com.chen.springcloud.pojo.Dept;
import com.chen.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author chenwenzhuo
 * @date 2020/12/16 18:38
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService service = null;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return this.service.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.service.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return this.service.queryAll();
    }

}
