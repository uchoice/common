/**    
 * @Title: GenericFilterChain.java  
 * @Package net.uchoice.common.base.filter  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author xishui.hb huangbo@uchoice.com
 * @date 2016年12月28日 上午11:06:59  
 * @version V1.0    
 */
package net.uchoice.common.base.filter;

import java.util.List;

import com.google.api.client.util.Lists;

/**
 * FilterChain的基本实现类
 * @author xishui.hb(huangbo@uchoice.com)
 * @title
 */
public class DefaultFilterChain<T> implements FilterChain<T>{
	
	private int capacity = Integer.MAX_VALUE;

	private List<Filter<T>> filters = Lists.newArrayList();

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public final void addFilter(Filter<T> filter) {
		if(filters.size() >= capacity){
			return ;
		}
		if(null !=  filter){
			filters.add(filter);
		}
	}

	@Override
	public final void addFilters(List<Filter<T>> filters) {
		if((this.filters.size() + filters.size()) > capacity){
			return ;
		}
		if(null == filters || filters.size() <= 0){
			return;
		}
		filters.addAll(filters);
	}
	@Override
	public final List<Filter<T>> list() {
		return filters;
	}
	
}
