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


import com.dao.YunshuzhuizongDao;
import com.entity.YunshuzhuizongEntity;
import com.service.YunshuzhuizongService;
import com.entity.vo.YunshuzhuizongVO;
import com.entity.view.YunshuzhuizongView;

@Service("yunshuzhuizongService")
public class YunshuzhuizongServiceImpl extends ServiceImpl<YunshuzhuizongDao, YunshuzhuizongEntity> implements YunshuzhuizongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YunshuzhuizongEntity> page = this.selectPage(
                new Query<YunshuzhuizongEntity>(params).getPage(),
                new EntityWrapper<YunshuzhuizongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YunshuzhuizongEntity> wrapper) {
		  Page<YunshuzhuizongView> page =new Query<YunshuzhuizongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YunshuzhuizongVO> selectListVO(Wrapper<YunshuzhuizongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YunshuzhuizongVO selectVO(Wrapper<YunshuzhuizongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YunshuzhuizongView> selectListView(Wrapper<YunshuzhuizongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YunshuzhuizongView selectView(Wrapper<YunshuzhuizongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
