package com.dao;

import com.entity.TushuguashiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushuguashiVO;
import com.entity.view.TushuguashiView;


/**
 * 图书挂失
 * 
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
public interface TushuguashiDao extends BaseMapper<TushuguashiEntity> {
	
	List<TushuguashiVO> selectListVO(@Param("ew") Wrapper<TushuguashiEntity> wrapper);
	
	TushuguashiVO selectVO(@Param("ew") Wrapper<TushuguashiEntity> wrapper);
	
	List<TushuguashiView> selectListView(@Param("ew") Wrapper<TushuguashiEntity> wrapper);

	List<TushuguashiView> selectListView(Pagination page,@Param("ew") Wrapper<TushuguashiEntity> wrapper);
	
	TushuguashiView selectView(@Param("ew") Wrapper<TushuguashiEntity> wrapper);
	

}
