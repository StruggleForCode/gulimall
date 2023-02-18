package com.atiguigu.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1、整合MyBatis-Plus
 * 		1）、导入依赖
 * 		2）、配置
 * 			1.配置数据源：
 * 				1）、导入数据库的驱动
 * 				2）、创建application.yml,配置数据源相关信息
 * 			2.配置MyBatis-Plus;
 * 				1）、使用@MapperScan
 * 				2）、告诉MyBatis-Plus，sql映射文件位置
 * 2、想要远程调用别的服务
 * 	1）、引入open-feign
 * 	2）、编写一个接口，告诉spring-cloud这个接口需要调用远程服务
 * 		1、声明接口的每一个方法都是调用那个远程服务的那个请求
 *	3）、开启远程调用功能 @EnableFeignClients
 */
@MapperScan("com.atiguigu.gulimall.member.dao")
@EnableFeignClients(basePackages = "com.atiguigu.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallMemberApplication.class, args);
	}

}
