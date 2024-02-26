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


import com.dao.CuihaixinxiDao;
import com.entity.CuihaixinxiEntity;
import com.service.CuihaixinxiService;
import com.entity.vo.CuihaixinxiVO;
import com.entity.view.CuihaixinxiView;

@Service("cuihaixinxiService")
public class CuihaixinxiServiceImpl extends ServiceImpl<CuihaixinxiDao, CuihaixinxiEntity> implements CuihaixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CuihaixinxiEntity> page = this.selectPage(
                new Query<CuihaixinxiEntity>(params).getPage(),
                new EntityWrapper<CuihaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CuihaixinxiEntity> wrapper) {
		  Page<CuihaixinxiView> page =new Query<CuihaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CuihaixinxiVO> selectListVO(Wrapper<CuihaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CuihaixinxiVO selectVO(Wrapper<CuihaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CuihaixinxiView> selectListView(Wrapper<CuihaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CuihaixinxiView selectView(Wrapper<CuihaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
