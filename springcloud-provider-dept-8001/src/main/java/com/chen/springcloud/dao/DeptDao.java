package com.chen.springcloud.dao;

import com.chen.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chenwenzhuo
 * @date 2020/12/16 17:12
 */
@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
