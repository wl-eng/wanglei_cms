package com.wanglei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanglei.mapper.ChannelMapper;
import com.wanglei.entity.Channel;
import com.wanglei.service.ChannelService;

@Service
public class ChannelServiceImpl  implements ChannelService{
	
	@Autowired
	ChannelMapper dao;

	@Override
	public List<Channel> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}
}
