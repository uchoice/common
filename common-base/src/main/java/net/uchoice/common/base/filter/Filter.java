/**    
* @Title: Filter.java  
* @Package net.uchoice.common.base.filter  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xishui.hb huangbo@uchoice.com
* @date 2016年12月28日 上午11:01:32  
* @version V1.0    
*/
package net.uchoice.common.base.filter;

import java.util.Map;

/**
 * 过滤器
 * @author xishui.hb(huangbo@uchoice.com)
 * @title 
 */
public interface Filter<T> {

	T filter(T t,Map<String,Object> filterSources);
}
