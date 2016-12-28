/**    
 * @Title: DefaultFilterChain.java  
 * @Package net.uchoice.common.base.filter  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author xishui.hb huangbo@uchoice.com
 * @date 2016年12月28日 上午11:03:24  
 * @version V1.0    
 */
package net.uchoice.common.base.filter;

import java.util.List;

/**
 * filterChain接口
 * 
 * @author xishui.hb(huangbo@uchoice.com)
 * @title
 */
public interface FilterChain<T> {
	/**
	 * 添加filter
	 */
	void addFilter(Filter<T> filter);

	/** 添加filters **/
	void addFilters(List<Filter<T>> filters);

	/** 返回filters **/
	List<Filter<T>> list();
}
