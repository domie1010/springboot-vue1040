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


import com.dao.GuoshushengchandiDao;
import com.entity.GuoshushengchandiEntity;
import com.service.GuoshushengchandiService;
import com.entity.vo.GuoshushengchandiVO;
import com.entity.view.GuoshushengchandiView;

@Service("guoshushengchandiService")
public class GuoshushengchandiServiceImpl extends ServiceImpl<GuoshushengchandiDao, GuoshushengchandiEntity> implements GuoshushengchandiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuoshushengchandiEntity> page = this.selectPage(
                new Query<GuoshushengchandiEntity>(params).getPage(),
                new EntityWrapper<GuoshushengchandiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuoshushengchandiEntity> wrapper) {
		  Page<GuoshushengchandiView> page =new Query<GuoshushengchandiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<GuoshushengchandiVO> selectListVO(Wrapper<GuoshushengchandiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuoshushengchandiVO selectVO(Wrapper<GuoshushengchandiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuoshushengchandiView> selectListView(Wrapper<GuoshushengchandiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuoshushengchandiView selectView(Wrapper<GuoshushengchandiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
