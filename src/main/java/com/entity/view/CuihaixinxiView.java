package com.entity.view;

import com.entity.CuihaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 催还信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
@TableName("cuihaixinxi")
public class CuihaixinxiView  extends CuihaixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CuihaixinxiView(){
	}
 
 	public CuihaixinxiView(CuihaixinxiEntity cuihaixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, cuihaixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
