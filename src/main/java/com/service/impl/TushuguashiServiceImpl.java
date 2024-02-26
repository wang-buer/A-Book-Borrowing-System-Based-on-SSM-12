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


import com.dao.TushuguashiDao;
import com.entity.TushuguashiEntity;
import com.service.TushuguashiService;
import com.entity.vo.TushuguashiVO;
import com.entity.view.TushuguashiView;

@Service("tushuguashiService")
public class TushuguashiServiceImpl extends ServiceImpl<TushuguashiDao, TushuguashiEntity> implements TushuguashiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushuguashiEntity> page = this.selectPage(
                new Query<TushuguashiEntity>(params).getPage(),
                new EntityWrapper<TushuguashiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushuguashiEntity> wrapper) {
		  Page<TushuguashiView> page =new Query<TushuguashiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushuguashiVO> selectListVO(Wrapper<TushuguashiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushuguashiVO selectVO(Wrapper<TushuguashiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushuguashiView> selectListView(Wrapper<TushuguashiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushuguashiView selectView(Wrapper<TushuguashiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
