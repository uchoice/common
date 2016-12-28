/**    
* @Title: FilterRunnerHandler.java  
* @Package net.uchoice.common.base.filter  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xishui.hb huangbo@uchoice.com
* @date 2016年12月28日 上午11:35:13  
* @version V1.0    
*/
package net.uchoice.common.base.filter;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author xishui.hb(huangbo@uchoice.com)
 * @title 
 */
public class FilterRunnerHandler<T> implements FilterHandler<T> {

	private FilterChain<T> filterChain;
	/**需要被过滤的原数据**/
	private T source;
	
	public FilterRunnerHandler(FilterChain<T> filterChain,T t){
		this.filterChain = filterChain;
		this.source = t;
	}
	@Override
	public T filterStartAndReuslt(Map<String, Object> filterSources) {
		if(null == filterChain){
			return source;
		}
		List<Filter<T>> filters = filterChain.list();
		if(null == filters || filters.size() <= 0){
			return source;
		}
		for(final Filter<T> filter : filters){
			source = filter.filter(source, filterSources);
		}
		return source;
	}
	
}
