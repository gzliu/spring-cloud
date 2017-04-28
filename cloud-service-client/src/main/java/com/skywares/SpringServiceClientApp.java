/**   
* @Title: SpringServiceClientApp.java 
* @Package com.skywares 
* @Description: TODO
* @author Guzman liu
* @date 2017年4月26日 下午6:14:34 
* @version V1.0   
*/ 

package com.skywares;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @ClassName: SpringServiceClientApp 
 * @Description: TODO
 * @author Guzman liu
 * @date 2017年4月26日 下午6:14:34 
 *  
 */
@Configuration
@ComponentScan
@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/report")
public class SpringServiceClientApp {
	
	
	@RequestMapping("/")
	public String home(HttpServletRequest request,HttpServletResponse response){
		
		return "home page "+request.getServerPort();
	}
	
	/*@RequestMapping("/report")
    public String Detail(){
        return "## Detail information about : User ";
    }
	
	@RequestMapping("/info")
    public String info(){
        return "## Detail information about : User info";
    }*/
    public static void main(String[] args) {
    	
        SpringApplication.run(SpringServiceClientApp.class, args);
    }
/*   
 * 服务发现代码
 *  
 *  
   //原生
    @Autowired
    private EurekaClient discoveryClient;

    public String serviceUrl() {
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("STORES", false);
        return instance.getHomePageUrl();
    }
     // 使用spring
    @Autowired
	private DiscoveryClient discoveryClient;
	
	public String serviceUrl() {
	    List<ServiceInstance> list = discoveryClient.getInstances("STORES");
	    if (list != null && list.size() > 0 ) {
	        return list.get(0).getUri();
	    }
	    return null;
	}
    
    *
    */
}
