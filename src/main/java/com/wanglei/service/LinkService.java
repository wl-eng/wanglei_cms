package com.wanglei.service;
import javax.validation.Valid;

import com.github.pagehelper.PageInfo;
import com.wanglei.entity.Link;

public interface LinkService {

	int add(Link link);
	PageInfo list(int page);
	int delete(int id);
	Link get(int id);
	int update( Link link);

}
