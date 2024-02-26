package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XujiexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XujiexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XujiexinxiView;


/**
 * 续借信息
 *
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
public interface XujiexinxiService extends IService<XujiexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XujiexinxiVO> selectListVO(Wrapper<XujiexinxiEntity> wrapper);
   	
   	XujiexinxiVO selectVO(@Param("ew") Wrapper<XujiexinxiEntity> wrapper);
   	
   	List<XujiexinxiView> selectListView(Wrapper<XujiexinxiEntity> wrapper);
   	
   	XujiexinxiView selectView(@Param("ew") Wrapper<XujiexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XujiexinxiEntity> wrapper);
   	

}

