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


import com.dao.DiscussguoshuxinxiDao;
import com.entity.DiscussguoshuxinxiEntity;
import com.service.DiscussguoshuxinxiService;
import com.entity.vo.DiscussguoshuxinxiVO;
import com.entity.view.DiscussguoshuxinxiView;

@Service("discussguoshuxinxiService")
public class DiscussguoshuxinxiServiceImpl extends ServiceImpl<DiscussguoshuxinxiDao, DiscussguoshuxinxiEntity> implements DiscussguoshuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussguoshuxinxiEntity> page = this.selectPage(
                new Query<DiscussguoshuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussguoshuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussguoshuxinxiEntity> wrapper) {
		  Page<DiscussguoshuxinxiView> page =new Query<DiscussguoshuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussguoshuxinxiVO> selectListVO(Wrapper<DiscussguoshuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussguoshuxinxiVO selectVO(Wrapper<DiscussguoshuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussguoshuxinxiView> selectListView(Wrapper<DiscussguoshuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussguoshuxinxiView selectView(Wrapper<DiscussguoshuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
