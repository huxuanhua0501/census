package com.census.logdata.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author hu_xuanhua_hua
 * @ClassName: DataArkConfig
 * @Description: TODO
 * @date 2018-04-11 17:26
 * @versoin 1.0
 **/
@Configuration
@MapperScan(basePackages = "com.census.logdata.dao", sqlSessionTemplateRef = "arkSqlSessionTemplate")
public class DataArkConfig {
    @Primary
    @Bean(name = "arkDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.ark")
    public DataSource setDataSource() {
        return new DruidDataSource();
    }

    @Primary
    @Bean(name = "arkTransactionManager")
    public DataSourceTransactionManager setTransactionManager(@Qualifier("arkDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean(name = "arkSqlSessionFactory")
    public SqlSessionFactory setSqlSessionFactory(@Qualifier("arkDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Primary
    @Bean(name = "arkSqlSessionTemplate")
    public SqlSessionTemplate setSqlSessionTemplate(@Qualifier("arkSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}