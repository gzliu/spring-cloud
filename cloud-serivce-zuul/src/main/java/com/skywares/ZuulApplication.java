/**   
* @Title: ZuulApplication.java 
* @Package com.skywares 
* @Description: TODO
* @author Guzman liu
* @date 2017年4月27日 下午6:22:42 
* @version V1.0   
*/ 

package com.skywares;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

/** 
 * @ClassName: ZuulApplication 
 * @Description: TODO
 * @author Guzman liu
 * @date 2017年4月27日 下午6:22:42 
 *  
 */
@SpringCloudApplication
@EnableZuulProxy
public class ZuulApplication {

	/*
	 * 
	 * 路径匹配
	 * @Bean
	public PatternServiceRouteMapper serviceRouteMapper() {
	    return new PatternServiceRouteMapper(
	        "(report)-(?<name>^.+)",
	        "${name}");
	}
	*/
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
	
	
	/*
	 * 手动发现已注册的服务
	 * 
	 * @Autowired
    private EurekaClient discoveryClient;

    public String serviceUrl() {
//    	discoveryClient.getInstancesById("");
    	discoveryClient.getInstancesByVipAddress("",false);
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("mmb-eureka-subject", false);
        
        return instance.getHomePageUrl();
    }*/
	
	
	
	
}
