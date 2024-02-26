package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CuihaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CuihaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CuihaixinxiView;


/**
 * 催还信息
 *
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
public interface CuihaixinxiService extends IService<CuihaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CuihaixinxiVO> selectListVO(Wrapper<CuihaixinxiEntity> wrapper);
   	
   	CuihaixinxiVO selectVO(@Param("ew") Wrapper<CuihaixinxiEntity> wrapper);
   	
   	List<CuihaixinxiView> selectListView(Wrapper<CuihaixinxiEntity> wrapper);
   	
   	CuihaixinxiView selectView(@Param("ew") Wrapper<CuihaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CuihaixinxiEntity> wrapper);
   	

}

