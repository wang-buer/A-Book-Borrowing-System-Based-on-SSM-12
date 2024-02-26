package com.entity.view;

import com.entity.TushuguashiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 图书挂失
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
@TableName("tushuguashi")
public class TushuguashiView  extends TushuguashiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TushuguashiView(){
	}
 
 	public TushuguashiView(TushuguashiEntity tushuguashiEntity){
 	try {
			BeanUtils.copyProperties(this, tushuguashiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
