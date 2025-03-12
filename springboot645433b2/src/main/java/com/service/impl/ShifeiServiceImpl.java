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


import com.dao.ShifeiDao;
import com.entity.ShifeiEntity;
import com.service.ShifeiService;
import com.entity.vo.ShifeiVO;
import com.entity.view.ShifeiView;

@Service("shifeiService")
public class ShifeiServiceImpl extends ServiceImpl<ShifeiDao, ShifeiEntity> implements ShifeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShifeiEntity> page = this.selectPage(
                new Query<ShifeiEntity>(params).getPage(),
                new EntityWrapper<ShifeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShifeiEntity> wrapper) {
		  Page<ShifeiView> page =new Query<ShifeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShifeiVO> selectListVO(Wrapper<ShifeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShifeiVO selectVO(Wrapper<ShifeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShifeiView> selectListView(Wrapper<ShifeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShifeiView selectView(Wrapper<ShifeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
