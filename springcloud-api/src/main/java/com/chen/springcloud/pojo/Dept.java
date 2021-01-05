package com.chen.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author chenwenzhuo
 * @date 2020/12/16 13:09
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
