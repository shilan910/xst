package com.xst.dao;

import com.xst.bean.V9News;

/**
 * 
 * @author CrazyCodess
 *
 */
public class NewsDao  extends BaseDao {

	public V9News getById(int id){
		return get(V9News.class,id);
	}
}
