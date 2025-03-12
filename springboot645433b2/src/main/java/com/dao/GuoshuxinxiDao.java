package com.dao;

import com.entity.GuoshuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuoshuxinxiVO;
import com.entity.view.GuoshuxinxiView;


/**
 * 果蔬信息
 * 
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface GuoshuxinxiDao extends BaseMapper<GuoshuxinxiEntity> {
	
	List<GuoshuxinxiVO> selectListVO(@Param("ew") Wrapper<GuoshuxinxiEntity> wrapper);
	
	GuoshuxinxiVO selectVO(@Param("ew") Wrapper<GuoshuxinxiEntity> wrapper);
	
	List<GuoshuxinxiView> selectListView(@Param("ew") Wrapper<GuoshuxinxiEntity> wrapper);

	List<GuoshuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GuoshuxinxiEntity> wrapper);

	
	GuoshuxinxiView selectView(@Param("ew") Wrapper<GuoshuxinxiEntity> wrapper);
	

}
