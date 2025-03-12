package com.dao;

import com.entity.YunshuzhuizongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YunshuzhuizongVO;
import com.entity.view.YunshuzhuizongView;


/**
 * 运输追踪
 * 
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface YunshuzhuizongDao extends BaseMapper<YunshuzhuizongEntity> {
	
	List<YunshuzhuizongVO> selectListVO(@Param("ew") Wrapper<YunshuzhuizongEntity> wrapper);
	
	YunshuzhuizongVO selectVO(@Param("ew") Wrapper<YunshuzhuizongEntity> wrapper);
	
	List<YunshuzhuizongView> selectListView(@Param("ew") Wrapper<YunshuzhuizongEntity> wrapper);

	List<YunshuzhuizongView> selectListView(Pagination page,@Param("ew") Wrapper<YunshuzhuizongEntity> wrapper);

	
	YunshuzhuizongView selectView(@Param("ew") Wrapper<YunshuzhuizongEntity> wrapper);
	

}
