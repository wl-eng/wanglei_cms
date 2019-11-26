package com.wanglei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanglei.mapper.CategoryMapper;
import com.wanglei.entity.Category;
import com.wanglei.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryMapper dao;

	@Override
	public List<Category> listByChannelId(Integer chnId) {
		// TODO Auto-generated method stub
		return dao.listByChannelId(chnId);
	}
}
