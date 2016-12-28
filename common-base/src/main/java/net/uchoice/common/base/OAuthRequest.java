/**    
* @Title: OAuthRequest.java  
* @Package net.uchoice.common.base  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xishui.hb huangbo@uchoice.com
* @date 2016年12月28日 上午10:55:16  
* @version V1.0    
*/
package net.uchoice.common.base;

/**
 * 有权限验证类型的请求对象
 * @author xishui.hb(huangbo@uchoice.com)
 * @title 
 */
public class OAuthRequest<T> extends Request<T> {

	private static final long serialVersionUID = 5757469654409774168L;
	/**是否需要验证**/
	private boolean needOAuth;
	/**全局oneId**/
	private long oneId;
	/**操作类型,可多个**/
	private byte[] operatorTypes;

	/**  
	 * @return needOAuth  
	 */
	public boolean isNeedOAuth() {
		return needOAuth;
	}

	/**
	 * @param needOAuth the needOAuth to set
	 */
	public void setNeedOAuth(boolean needOAuth) {
		this.needOAuth = needOAuth;
	}

	/**  
	 * @return oneId  
	 */
	public long getOneId() {
		return oneId;
	}

	/**
	 * @param oneId the oneId to set
	 */
	public void setOneId(long oneId) {
		this.oneId = oneId;
	}

	/**  
	 * @return operatorTypes  
	 */
	public byte[] getOperatorTypes() {
		return operatorTypes;
	}

	/**
	 * @param operatorTypes the operatorTypes to set
	 */
	public void setOperatorTypes(byte[] operatorTypes) {
		this.operatorTypes = operatorTypes;
	}
	
	
}
