/**    
* @Title: DateAware.java  
* @Package net.uchoice.common.base.interfaces  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xishui.hb huangbo@uchoice.com
* @date 2016年12月28日 下午5:25:40  
* @version V1.0    
*/
package net.uchoice.common.base.interfaces;

/**
 * 数据注入顶级接口
 * @author xishui.hb(huangbo@uchoice.com)
 * @title 
 */
public interface DataAware<T> extends Aware<T> {

	void setData(T t);
}
