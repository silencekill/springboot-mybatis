package org.javaboy.mybatis;

import org.javaboy.mybatis.dao.StudentMapper;
import org.javaboy.mybatis.dao2.StudentMapper2;
import org.javaboy.mybatis.service.StudentService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {

    @Autowired
    StudentMapper studentMapper1;

    @Autowired
    StudentMapper2 studentMapper2;

    @Test
    public void contextLoads() {

        //System.out.println(studentService.list());
    }

    @Test
    public void test1() {

        System.out.println(studentMapper1.listAll());
        System.out.println(studentMapper2.listAll());
    }

}
