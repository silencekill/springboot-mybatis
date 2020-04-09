package org.javaboy.mybatis.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "org.javaboy.mybatis.dao",sqlSessionFactoryRef="sessionFactory1",sqlSessionTemplateRef = "sqlSessionTemplate1")
public class MyBatis1 {

    @Resource(name = "dataSource1")
    DataSource dataSource1;


    @Bean
    public SqlSessionFactory sessionFactory1(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        try {
            sqlSessionFactoryBean.setDataSource(dataSource1);
            return sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate1(){
        return new SqlSessionTemplate(sessionFactory1());
    }
}
