/**   
* @Title: ReportClient.java 
* @Package com.skywares 
* @Description: TODO
* @author Guzman liu
* @date 2017年4月27日 下午3:44:16 
* @version V1.0   
*/ 

package com.gzliu;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * @ClassName: ReportClient 
 * @Description: TODO
 * @author Guzman liu
 * @date 2017年4月27日 下午3:44:16 
 *  
 */
//@FeignClient("report")
public interface ReportClient {

	//@RequestMapping(method = RequestMethod.GET, value = "/list")
    String getStores();

   /* @RequestMapping(method = RequestMethod.POST, value = "/stores/{storeId}", consumes = "application/json")
    Store update(@PathVariable("storeId") Long storeId, Store store);*/
}

class ReportClientImpl implements ReportClient{

	public String getStores() {
		return "client";
	}
	
}
