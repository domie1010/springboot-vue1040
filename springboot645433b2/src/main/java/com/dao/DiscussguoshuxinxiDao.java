package com.dao;

import com.entity.DiscussguoshuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussguoshuxinxiVO;
import com.entity.view.DiscussguoshuxinxiView;


/**
 * 果蔬信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-18 14:01:19
 */
public interface DiscussguoshuxinxiDao extends BaseMapper<DiscussguoshuxinxiEntity> {
	
	List<DiscussguoshuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussguoshuxinxiEntity> wrapper);
	
	DiscussguoshuxinxiVO selectVO(@Param("ew") Wrapper<DiscussguoshuxinxiEntity> wrapper);
	
	List<DiscussguoshuxinxiView> selectListView(@Param("ew") Wrapper<DiscussguoshuxinxiEntity> wrapper);

	List<DiscussguoshuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussguoshuxinxiEntity> wrapper);

	
	DiscussguoshuxinxiView selectView(@Param("ew") Wrapper<DiscussguoshuxinxiEntity> wrapper);
	

}
