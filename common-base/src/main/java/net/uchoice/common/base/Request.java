/**    
* @Title: Request.java  
* @Package net.uchoice.common.base  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xishui.hb huangbo@uchoice.com
* @date 2016年12月28日 上午10:50:13  
* @version V1.0    
*/
package net.uchoice.common.base;

import java.io.Serializable;
import java.util.Map;

/**
 * 基本的请求对象
 * @author xishui.hb(huangbo@uchoice.com)
 * @title 
 */
public class Request<T> implements Serializable{
	private static final long serialVersionUID = -2842285159259840829L;
	/**请求对象数据data**/
	private T data;
	/**请求时间戳**/
	private long timestamp;
	/**请求设置的附件**/
	private Map<String,Object> attachments;
	/**请求的加密key**/
	private String requestKey;
	
	public static <T>Request<T> create(){
		Request<T> request = new Request<T>();
		request.setTimestamp(System.currentTimeMillis());
		return request;
	}
	/**  
	 * @return data  
	 */
	public T getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	/**  
	 * @return timestamp  
	 */
	public long getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	/**  
	 * @return attachments  
	 */
	public Map<String, Object> getAttachments() {
		return attachments;
	}
	/**
	 * @param attachments the attachments to set
	 */
	public void setAttachments(Map<String, Object> attachments) {
		this.attachments = attachments;
	}
	/**  
	 * @return requestKey  
	 */
	public String getRequestKey() {
		return requestKey;
	}
	/**
	 * @param requestKey the requestKey to set
	 */
	public void setRequestKey(String requestKey) {
		this.requestKey = requestKey;
	}
	
	
}
