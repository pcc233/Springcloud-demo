package com.chen.springcloud.service;

import com.chen.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author chenwenzhuo
 * @date 2020/12/16 17:20
 */
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
