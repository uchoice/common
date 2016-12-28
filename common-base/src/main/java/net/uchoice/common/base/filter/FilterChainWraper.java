/**    
* @Title: FilterChainWraper.java  
* @Package net.uchoice.common.base.filter  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xishui.hb huangbo@uchoice.com
* @date 2016年12月28日 上午11:32:29  
* @version V1.0    
*/
package net.uchoice.common.base.filter;

import java.util.List;
import java.util.Map;

/**
 * FilterChain对外的包装类
 * @author xishui.hb(huangbo@uchoice.com)
 * @title 
 */
public class FilterChainWraper<T> implements FilterHandler<T>{

	private FilterChain<T> filterChain;
	private FilterHandler<T> handler;
	
	public FilterChainWraper(FilterChain<T> filterChain,T t){
		this.filterChain = filterChain;
		this.handler = new FilterRunnerHandler<>(filterChain,t);
	}
	
	public static <T>FilterChainWraper<T> wraper(FilterChain<T> filterChain,T t){
		return new FilterChainWraper<T>(filterChain,t);
	}
	public FilterChainWraper<T> addFilter(Filter<T> filter) {
		filterChain.addFilter(filter);
		return this;
	}
	public FilterChainWraper<T> addFilters(List<Filter<T>> filters) {
		filterChain.addFilters(filters);
		return this;
	}

	public List<Filter<T>> list() {
		return filterChain.list();
	}

	@Override
	public T filterStartAndReuslt(Map<String, Object> filterSources) {
		return handler.filterStartAndReuslt(filterSources);
	}
	
}
