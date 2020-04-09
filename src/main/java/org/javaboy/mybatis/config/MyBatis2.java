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
@MapperScan(basePackages = "org.javaboy.mybatis.dao2",sqlSessionFactoryRef="sessionFactory2",sqlSessionTemplateRef = "sqlSessionTemplate2")
public class MyBatis2 {

    @Resource(name = "dataSource2")
    DataSource dataSource2;

    @Bean
    public SqlSessionFactory sessionFactory2(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        try {
            sqlSessionFactoryBean.setDataSource(dataSource2);
            return sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate2(){
        return new SqlSessionTemplate(sessionFactory2());
    }
}
