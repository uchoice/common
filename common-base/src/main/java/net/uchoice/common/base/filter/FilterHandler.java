/**    
* @Title: FilterHandler.java  
* @Package net.uchoice.common.base.filter  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xishui.hb huangbo@uchoice.com
* @date 2016年12月28日 下午2:03:33  
* @version V1.0    
*/
package net.uchoice.common.base.filter;

import java.util.Map;

/**
 * 过滤器执行体
 * @author xishui.hb(huangbo@uchoice.com)
 * @title 
 */
public interface FilterHandler<T> {

	/**
	 * t:源数据
	 * filterSources：过滤需要的材料及数据
	 */
	T filterStartAndReuslt(Map<String,Object> filterSources);
	
}
