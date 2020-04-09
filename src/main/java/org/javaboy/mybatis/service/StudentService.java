package org.javaboy.mybatis.service;

import org.javaboy.mybatis.dao.StudentMapper;
import org.javaboy.mybatis.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentDao;
    public List<Student> list(){
        return studentDao.listAll();
    }
}
