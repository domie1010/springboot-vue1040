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


import com.dao.CaizhaiDao;
import com.entity.CaizhaiEntity;
import com.service.CaizhaiService;
import com.entity.vo.CaizhaiVO;
import com.entity.view.CaizhaiView;

@Service("caizhaiService")
public class CaizhaiServiceImpl extends ServiceImpl<CaizhaiDao, CaizhaiEntity> implements CaizhaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaizhaiEntity> page = this.selectPage(
                new Query<CaizhaiEntity>(params).getPage(),
                new EntityWrapper<CaizhaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaizhaiEntity> wrapper) {
		  Page<CaizhaiView> page =new Query<CaizhaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<CaizhaiVO> selectListVO(Wrapper<CaizhaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaizhaiVO selectVO(Wrapper<CaizhaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaizhaiView> selectListView(Wrapper<CaizhaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaizhaiView selectView(Wrapper<CaizhaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
