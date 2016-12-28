/**    
 * @Title: FilterChainTest.java  
 * @Package net.uchoice.common.base.filter  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author xishui.hb huangbo@uchoice.com
 * @date 2016年12月28日 下午2:50:03  
 * @version V1.0    
 */
package net.uchoice.common.base.filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author xishui.hb(huangbo@uchoice.com)
 * @title
 */
public class FilterChainTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		list.add("B");
		Map<String,Object> filterMap = new HashMap<String,Object>();
		filterMap.put(AFilter.AFILTER_STR, "A");
		filterMap.put(BFilter.BFILTER_STR, "B");
		list = FilterChainWraper
				.wraper(new DefaultFilterChain<List<String>>(), list)
				.addFilter(new AFilter()).addFilter(new BFilter())
				.filterStartAndReuslt(filterMap);
		for(String str: list){
			System.out.println(str);
		}
	}

}
