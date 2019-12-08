package com.lq.mapper;

import com.lq.pojo.Error;
import com.lq.pojo.Goods;
import com.lq.pojo.User;

public interface MyMapper {

	int insertUser(User user);
	Goods GoodsAll(Goods goods);
	int insertError(Error er);
}
