package com.gzliu.zuulfilter;
/**   
* @Title: PreZuulFilter.java 
* @Package com.skywares.zuulfilter 
* @Description: TODO
* @author Guzman liu
* @date 2017年4月27日 下午7:11:44 
* @version V1.0   
*//* 

package com.skywares.zuulfilter;

import com.netflix.zuul.ZuulFilter;

*//** 
 * @ClassName: PreZuulFilter 
 * @Description: TODO
 * @author Guzman liu
 * @date 2017年4月27日 下午7:11:44 
 * 
 *  filterOrder:filter执行顺序，通过数字指定 
	shouldFilter:filter是否需要执行 true执行 false 不执行 
	run : filter具体逻辑 
	filterType :filter类型,分为以下几种
		pre:请求执行之前filter 
		route: 处理请求，进行路由 
		post: 请求处理完成后执行的filter 
		error:出现错误时执行的filter
 *//*
public class PreZuulFilter extends ZuulFilter{

	@Override
	public Object run() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(ZuulFilter filter) {
		// TODO Auto-generated method stub
		return super.compareTo(filter);
	}

	@Override
	public String disablePropertyName() {
		// TODO Auto-generated method stub
		return super.disablePropertyName();
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFilterDisabled() {
		// TODO Auto-generated method stub
		return super.isFilterDisabled();
	}

	@Override
	public boolean isStaticFilter() {
		// TODO Auto-generated method stub
		return super.isStaticFilter();
	}

	

}
*/