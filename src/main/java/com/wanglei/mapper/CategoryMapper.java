package com.wanglei.mapper;

import java.util.List;

import com.wanglei.entity.Category;

public interface CategoryMapper {
	/**
	 * 获取分类
	 * @param chnId
	 * @return
	 */
 	List<Category> listByChannelId(int chnId);
}
