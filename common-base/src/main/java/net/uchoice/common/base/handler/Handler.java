/**    
* @Title: Handler.java  
* @Package net.uchoice.common.base.filter  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xishui.hb huangbo@uchoice.com
* @date 2016年12月28日 上午11:04:54  
* @version V1.0    
*/
package net.uchoice.common.base.handler;

import java.util.Map;

/**
 * handler执行器(责任链模式的使用)
 * @author xishui.hb(huangbo@uchoice.com)
 * @title 
 */
public interface Handler<T> {

	/**
	 * T 原数据
	 * context:上下文依赖数据
	 */
	T handler(T t,Map<String,Object> context);
}
