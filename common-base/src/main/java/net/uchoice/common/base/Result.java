/**    
* @Title: Result.java  
* @Package net.uchoice.common.base  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xishui.hb huangbo@uchoice.com
* @date 2016年12月28日 上午10:59:10  
* @version V1.0    
*/
package net.uchoice.common.base;

import java.io.Serializable;
import java.util.Map;

/**
 * 基本的返回对象
 * @author xishui.hb(huangbo@uchoice.com)
 * @title 
 */
public class Result<T> implements Serializable{
	private static final long serialVersionUID = -1461930672073753286L;
	/**返回的数据对象**/
	private T data;
	/**是否处理成功**/
	private boolean isSuccess;
	/**错误码**/
	private String code;
	/**错误描述**/
	private String description;
	/**返回的附件**/
	private Map<String,Object> attachments;
	
	public static <T>Result<T> create(){
		Result<T> result = new Result<T>();
		result.setSuccess(false);
		return result;
	}
	
	public static <T>Result<T> success(T t){
		Result<T> result = new Result<T>();
		result.setSuccess(true);
		result.setData(t);
		return result;
	}
	public static <T>Result<T> fail(String code,String description){
		Result<T> result = new Result<T>();
		result.setSuccess(false);
		result.setData(null);
		result.setCode(code);
		result.setDescription(description);
		return result;
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
	 * @return isSuccess  
	 */
	public boolean isSuccess() {
		return isSuccess;
	}
	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	/**  
	 * @return code  
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**  
	 * @return description  
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
}
