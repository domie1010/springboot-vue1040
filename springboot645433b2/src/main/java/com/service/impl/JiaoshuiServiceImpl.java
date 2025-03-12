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


import com.dao.JiaoshuiDao;
import com.entity.JiaoshuiEntity;
import com.service.JiaoshuiService;
import com.entity.vo.JiaoshuiVO;
import com.entity.view.JiaoshuiView;

@Service("jiaoshuiService")
public class JiaoshuiServiceImpl extends ServiceImpl<JiaoshuiDao, JiaoshuiEntity> implements JiaoshuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshuiEntity> page = this.selectPage(
                new Query<JiaoshuiEntity>(params).getPage(),
                new EntityWrapper<JiaoshuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshuiEntity> wrapper) {
		  Page<JiaoshuiView> page =new Query<JiaoshuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JiaoshuiVO> selectListVO(Wrapper<JiaoshuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshuiVO selectVO(Wrapper<JiaoshuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshuiView> selectListView(Wrapper<JiaoshuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshuiView selectView(Wrapper<JiaoshuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
