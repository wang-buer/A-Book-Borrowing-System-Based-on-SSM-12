package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JieyuezhengjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JieyuezhengjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JieyuezhengjianView;


/**
 * 借阅证件
 *
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
public interface JieyuezhengjianService extends IService<JieyuezhengjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JieyuezhengjianVO> selectListVO(Wrapper<JieyuezhengjianEntity> wrapper);
   	
   	JieyuezhengjianVO selectVO(@Param("ew") Wrapper<JieyuezhengjianEntity> wrapper);
   	
   	List<JieyuezhengjianView> selectListView(Wrapper<JieyuezhengjianEntity> wrapper);
   	
   	JieyuezhengjianView selectView(@Param("ew") Wrapper<JieyuezhengjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JieyuezhengjianEntity> wrapper);
   	

}

