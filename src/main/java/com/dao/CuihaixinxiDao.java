package com.dao;

import com.entity.CuihaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CuihaixinxiVO;
import com.entity.view.CuihaixinxiView;


/**
 * 催还信息
 * 
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
public interface CuihaixinxiDao extends BaseMapper<CuihaixinxiEntity> {
	
	List<CuihaixinxiVO> selectListVO(@Param("ew") Wrapper<CuihaixinxiEntity> wrapper);
	
	CuihaixinxiVO selectVO(@Param("ew") Wrapper<CuihaixinxiEntity> wrapper);
	
	List<CuihaixinxiView> selectListView(@Param("ew") Wrapper<CuihaixinxiEntity> wrapper);

	List<CuihaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CuihaixinxiEntity> wrapper);
	
	CuihaixinxiView selectView(@Param("ew") Wrapper<CuihaixinxiEntity> wrapper);
	

}
