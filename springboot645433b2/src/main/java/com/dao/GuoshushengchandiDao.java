package com.dao;

import com.entity.GuoshushengchandiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuoshushengchandiVO;
import com.entity.view.GuoshushengchandiView;


/**
 * 果蔬生产地
 * 
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface GuoshushengchandiDao extends BaseMapper<GuoshushengchandiEntity> {
	
	List<GuoshushengchandiVO> selectListVO(@Param("ew") Wrapper<GuoshushengchandiEntity> wrapper);
	
	GuoshushengchandiVO selectVO(@Param("ew") Wrapper<GuoshushengchandiEntity> wrapper);
	
	List<GuoshushengchandiView> selectListView(@Param("ew") Wrapper<GuoshushengchandiEntity> wrapper);

	List<GuoshushengchandiView> selectListView(Pagination page,@Param("ew") Wrapper<GuoshushengchandiEntity> wrapper);

	
	GuoshushengchandiView selectView(@Param("ew") Wrapper<GuoshushengchandiEntity> wrapper);
	

}
