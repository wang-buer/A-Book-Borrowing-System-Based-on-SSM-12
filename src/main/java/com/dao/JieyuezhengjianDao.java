package com.dao;

import com.entity.JieyuezhengjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JieyuezhengjianVO;
import com.entity.view.JieyuezhengjianView;


/**
 * 借阅证件
 * 
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
public interface JieyuezhengjianDao extends BaseMapper<JieyuezhengjianEntity> {
	
	List<JieyuezhengjianVO> selectListVO(@Param("ew") Wrapper<JieyuezhengjianEntity> wrapper);
	
	JieyuezhengjianVO selectVO(@Param("ew") Wrapper<JieyuezhengjianEntity> wrapper);
	
	List<JieyuezhengjianView> selectListView(@Param("ew") Wrapper<JieyuezhengjianEntity> wrapper);

	List<JieyuezhengjianView> selectListView(Pagination page,@Param("ew") Wrapper<JieyuezhengjianEntity> wrapper);
	
	JieyuezhengjianView selectView(@Param("ew") Wrapper<JieyuezhengjianEntity> wrapper);
	

}
