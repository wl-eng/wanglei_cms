package com.wanglei.service;

import java.util.List;

import com.wanglei.entity.Category;

public interface CategoryService {
	/**
	 * 获取分类
	 * @param chnId  频道id
	 * @return
	 */
	List<Category> listByChannelId(Integer chnId);

}
