package com.dao;

import com.entity.XujiexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XujiexinxiVO;
import com.entity.view.XujiexinxiView;


/**
 * 续借信息
 * 
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
public interface XujiexinxiDao extends BaseMapper<XujiexinxiEntity> {
	
	List<XujiexinxiVO> selectListVO(@Param("ew") Wrapper<XujiexinxiEntity> wrapper);
	
	XujiexinxiVO selectVO(@Param("ew") Wrapper<XujiexinxiEntity> wrapper);
	
	List<XujiexinxiView> selectListView(@Param("ew") Wrapper<XujiexinxiEntity> wrapper);

	List<XujiexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XujiexinxiEntity> wrapper);
	
	XujiexinxiView selectView(@Param("ew") Wrapper<XujiexinxiEntity> wrapper);
	

}
