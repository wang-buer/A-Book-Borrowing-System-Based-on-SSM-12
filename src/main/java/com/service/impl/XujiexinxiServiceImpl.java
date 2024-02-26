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


import com.dao.XujiexinxiDao;
import com.entity.XujiexinxiEntity;
import com.service.XujiexinxiService;
import com.entity.vo.XujiexinxiVO;
import com.entity.view.XujiexinxiView;

@Service("xujiexinxiService")
public class XujiexinxiServiceImpl extends ServiceImpl<XujiexinxiDao, XujiexinxiEntity> implements XujiexinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XujiexinxiEntity> page = this.selectPage(
                new Query<XujiexinxiEntity>(params).getPage(),
                new EntityWrapper<XujiexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XujiexinxiEntity> wrapper) {
		  Page<XujiexinxiView> page =new Query<XujiexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XujiexinxiVO> selectListVO(Wrapper<XujiexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XujiexinxiVO selectVO(Wrapper<XujiexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XujiexinxiView> selectListView(Wrapper<XujiexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XujiexinxiView selectView(Wrapper<XujiexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
