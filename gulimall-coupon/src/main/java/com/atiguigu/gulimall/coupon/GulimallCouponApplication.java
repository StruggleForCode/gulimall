package com.atiguigu.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
 * 	3、	如何使用Nacos作为配置中心——管理配置
 * 		1）、引入依赖
 * 	 	   <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *         <dependency>
 *             <groupId>org.springframework.cloud</groupId>
 *             <artifactId>spring-cloud-starter-bootstrap</artifactId>
 *         </dependency>
 *      2）、创建一个bootstrap.properties
 *      	spring.application.name=gulimall-coupon
 * 			spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *		3）、需要给配置中心默认添加一个叫 数据集（Data Id) gulimall-coupon.properties。默认规则.应用名.properties
 *		4) 、给应用名.properties添加任何配置
 *		5）、动态获取配置
 * 			@RefreshScope:动态获取并刷新配置
 * 			@Value(${配置项的名})：获取到配置
 * 			如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置
 * 	4. 细节
 * 		1）.命名空间：配置隔离;
 * 			默认：public(保留空间);默认新增的所有配置都在public空间
 * 			1.开发，测试，生产：利用命名空间来做环境隔离
 * 			  注意：在bootstrap.properties；配置上，需要使用那个命名空间下的配置
 * 			  spring.cloud.nacos.config.namespace=e31daea4-3a2a-4c65-ba58-07cc5a954eda
 * 			2.每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 * 		2）.配置集：所有的配置的集合
 * 		3）.配置集ID：类似文件名
 * 			Data ID: 类似文件名
 * 		4）.配置分组：
 * 			默认所有的配置集都属于：DEFAULT_GROUP
 * 			1111，618，1212
 * 			spring.cloud.nacos.config.group=1111
 * 	每个微服务创建自己的命名空间，使用配置分组区分环境，alpha,gamma,prod
 *
 * 	3. 同时加载多个配置集
 * 	1）、微服务任何配置信息，任何配置文件都可以放到配置中心中
 * 	2）、只需要在bootstrap.properties说明加载配置中心中那些配置文件即可
 * 	3）、@Value. @ConfigurationProperties.....
 * 	以前SpringBoot任何方法从配置文件中获取值，都能使用
 * 	配置中心有， 优先使用配置中心的值
 *
 */
@MapperScan("com.atiguigu.gulimall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallCouponApplication.class, args);
	}

}
