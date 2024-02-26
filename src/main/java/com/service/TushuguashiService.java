package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TushuguashiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TushuguashiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TushuguashiView;


/**
 * 图书挂失
 *
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
public interface TushuguashiService extends IService<TushuguashiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushuguashiVO> selectListVO(Wrapper<TushuguashiEntity> wrapper);
   	
   	TushuguashiVO selectVO(@Param("ew") Wrapper<TushuguashiEntity> wrapper);
   	
   	List<TushuguashiView> selectListView(Wrapper<TushuguashiEntity> wrapper);
   	
   	TushuguashiView selectView(@Param("ew") Wrapper<TushuguashiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushuguashiEntity> wrapper);
   	

}

