package org.javaboy.mybatis.dao2;

import org.javaboy.mybatis.entity.Student;

import java.util.List;

//@Mapper
public interface StudentMapper2 {
    List<Student> listAll();
}
