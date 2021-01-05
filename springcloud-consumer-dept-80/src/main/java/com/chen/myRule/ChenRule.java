package com.chen.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenwenzhuo
 * @date 2020/12/17 13:18
 */
@Configuration
public class ChenRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
