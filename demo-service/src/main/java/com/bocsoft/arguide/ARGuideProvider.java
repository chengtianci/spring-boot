package com.bocsoft.arguide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.bocsoft.arguide.dao.mapper"})
@SpringBootApplication
public class ARGuideProvider {
    public static void main(String[] args){
        SpringApplication.run(ARGuideProvider.class);
    }
}
