package com.whale.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.whale.service"})
@PropertySource("classpath:jdbc.properties") // 设置配置文件
@Import({JdbcConfig.class,MyBatisConfig.class})  // 添加配置类
@EnableTransactionManagement    // 开启事务
public class SpringConfig {
}
