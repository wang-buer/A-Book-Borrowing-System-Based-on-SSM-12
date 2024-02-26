package com.entity.view;

import com.entity.XujiexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 续借信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
@TableName("xujiexinxi")
public class XujiexinxiView  extends XujiexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XujiexinxiView(){
	}
 
 	public XujiexinxiView(XujiexinxiEntity xujiexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xujiexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
