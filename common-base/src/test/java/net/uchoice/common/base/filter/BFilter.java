/**    
* @Title: BFilter.java  
* @Package net.uchoice.common.base.filter  
* @Description: TODO(用一句话描述该文件做什么)  
* @author xishui.hb huangbo@uchoice.com
* @date 2016年12月28日 下午2:42:38  
* @version V1.0    
*/
package net.uchoice.common.base.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author xishui.hb(huangbo@uchoice.com)
 * @title 
 */
public class BFilter implements Filter<List<String>> {
	
	public static final String BFILTER_STR = "b.filter";

	@Override
	public List<String> filter(List<String> t, Map<String, Object> filterSources) {
		if(null == t || t.size() <= 0){
			return t;
		}
		if(null == filterSources){
			return t;
		}
		String filterStr = filterSources.containsKey(BFILTER_STR) ? (String)filterSources
				.get(BFILTER_STR) : null;
		if(null == filterStr){
			return t;
		}
		List<String> result = new ArrayList<String>();
		for(final String str : t){
			if(!filterStr.equals(str)){
				result.add(str);
			}
		}
		return result;
	}

}
