package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JieyuezhengjianDao;
import com.entity.JieyuezhengjianEntity;
import com.service.JieyuezhengjianService;
import com.entity.vo.JieyuezhengjianVO;
import com.entity.view.JieyuezhengjianView;

@Service("jieyuezhengjianService")
public class JieyuezhengjianServiceImpl extends ServiceImpl<JieyuezhengjianDao, JieyuezhengjianEntity> implements JieyuezhengjianService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JieyuezhengjianEntity> page = this.selectPage(
                new Query<JieyuezhengjianEntity>(params).getPage(),
                new EntityWrapper<JieyuezhengjianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JieyuezhengjianEntity> wrapper) {
		  Page<JieyuezhengjianView> page =new Query<JieyuezhengjianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JieyuezhengjianVO> selectListVO(Wrapper<JieyuezhengjianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JieyuezhengjianVO selectVO(Wrapper<JieyuezhengjianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JieyuezhengjianView> selectListView(Wrapper<JieyuezhengjianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JieyuezhengjianView selectView(Wrapper<JieyuezhengjianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
