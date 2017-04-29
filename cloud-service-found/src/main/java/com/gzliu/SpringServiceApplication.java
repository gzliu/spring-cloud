/**   
* @Title: SpringApplication.java 
* @Package com.main 
* @Description: TODO
* @author Guzman liu
* @date 2017年4月26日 下午6:08:05 
* @version V1.0   
*/ 

package com.gzliu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** 
 * @ClassName: SpringApplication 
 * @Description: TODO
 * @author Guzman liu
 * @date 2017年4月26日 下午6:08:05 
 *  
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringServiceApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringServiceApplication.class, args);
	}

}
