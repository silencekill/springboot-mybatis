package org.javaboy.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.javaboy.mybatis.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

//@Mapper
public interface StudentMapper {
    List<Student> listAll();
}
