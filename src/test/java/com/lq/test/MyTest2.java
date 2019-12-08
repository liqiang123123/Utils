package com.lq.test;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lq.mapper.MyMapper;
import com.lq.pojo.Error;
import com.lq.pojo.Goods;
import com.lq.pojo.Type;
import com.lq.pojo.User;

import net.sf.jsqlparser.schema.Table;
import utils.IOUtils;
import utils.StringUtil;

public class MyTest2 {
	
	
	public static void main(String[] args) {
		List<Object[]> readFile = IOUtils.readFile("src/main/resources/file2.txt", "\\\\t");
		for (Object[] objects : readFile) {
			System.out.println(Arrays.toString(objects));
			Type type=new Type();
			type.setId(Integer.parseInt(objects[0]+""));
			if(!StringUtil.isEmpty(objects[1]+"")){
				type.setName(objects[1]+"");
				if(StringUtil.isNumber(objects[2]+"")&&(objects[2]+"")!=null){
					//System.out.println(objects[2]+"");
					type.setSeals(Integer.parseInt(objects[2]+""));
					if(!StringUtil.isEmpty(objects[3]+"")&&StringUtil.isPhone(objects[3]+"")){
						type.setPhone(objects[3]+"");
						if(!StringUtil.isEmpty(objects[4]+"")){
							type.setTname(objects[4]+"");
						}
					}
				}
			}
			System.out.println(type);
		}
	
	}
	
	
}
	

