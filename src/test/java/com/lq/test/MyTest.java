package com.lq.test;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lq.mapper.MyMapper;
import com.lq.pojo.Error;
import com.lq.pojo.Goods;
import com.lq.pojo.User;

import utils.IOUtils;
import utils.StringUtil;

public class MyTest {
	
	
	public static void main(String[] args) {
		List<Object[]> readFile = IOUtils.readFile("src/main/resources/file.txt", "\\\\t");
		ClassPathXmlApplicationContext cax=new ClassPathXmlApplicationContext("applicationContext.xml");
		MyMapper bean = cax.getBean(MyMapper.class);
		User user=new User();
		Error error=new Error();
		for (Object[] objects : readFile) {
			String[] split = (objects[4]+"").split("%");
			for (String string : split) {
				if(!StringUtil.isEmpty(objects[1]+"")&&StringUtil.isEmail(objects[2]+"")
						&&StringUtil.isPhone(objects[3]+"")&&StringUtil.isNumber(string)){
					Goods goods=new Goods();
					goods.setGname(objects[5]+"");
					Goods goodsAll = bean.GoodsAll(goods);
					user.setId(Integer.parseInt(objects[0]+""));
					user.setEmail(objects[2]+"");
					user.setUsername(objects[1]+"");
					user.setGid(goodsAll.getGid());
					user.setSales(Integer.parseInt(string));
					user.setPhone(objects[3]+"");
					//int insertUser = bean.insertUser(user);
					//System.out.println(insertUser);
				}else if(!StringUtil.isEmail(objects[2]+"")){
					String er="编号为"+objects[0]+"邮箱错误";
					error.setError(er);
					bean.insertError(error);
				}else if(!StringUtil.isPhone(objects[3]+"")){
					String er="编号为"+objects[0]+"的记录，手机号格式错误";
					error.setError(er);
					bean.insertError(error);
				}else if(!StringUtil.isNumber(string)){
					String er="编号为"+objects[0]+"受欢迎度错误";
					error.setError(er);
					bean.insertError(error);
				}
				}
			
			
			}
				
			}
		}
	

	

