package org.poseidon.component.dataExport;

import java.util.LinkedHashMap;
import java.util.List;


public interface DataExport<T,O> {
	
	/**
	 * 根据原始数据，列头转换成需要的导出对象
	 */
	public O convertList(List<T> dataList, LinkedHashMap<String, String> headMap) 
		throws Exception;

	/**
	 * 根据原始数据，列头，文件输出路径转换
	 */
	public boolean convertList2File(List<T> dataList, LinkedHashMap<String, String> headMap, String path)
		throws Exception;
}