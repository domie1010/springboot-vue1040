package com.dao;

import com.entity.JiaoshuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshuiVO;
import com.entity.view.JiaoshuiView;


/**
 * 浇水
 * 
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface JiaoshuiDao extends BaseMapper<JiaoshuiEntity> {
	
	List<JiaoshuiVO> selectListVO(@Param("ew") Wrapper<JiaoshuiEntity> wrapper);
	
	JiaoshuiVO selectVO(@Param("ew") Wrapper<JiaoshuiEntity> wrapper);
	
	List<JiaoshuiView> selectListView(@Param("ew") Wrapper<JiaoshuiEntity> wrapper);

	List<JiaoshuiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshuiEntity> wrapper);

	
	JiaoshuiView selectView(@Param("ew") Wrapper<JiaoshuiEntity> wrapper);
	

}
