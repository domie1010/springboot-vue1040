package com.dao;

import com.entity.ShifeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShifeiVO;
import com.entity.view.ShifeiView;


/**
 * 施肥
 * 
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface ShifeiDao extends BaseMapper<ShifeiEntity> {
	
	List<ShifeiVO> selectListVO(@Param("ew") Wrapper<ShifeiEntity> wrapper);
	
	ShifeiVO selectVO(@Param("ew") Wrapper<ShifeiEntity> wrapper);
	
	List<ShifeiView> selectListView(@Param("ew") Wrapper<ShifeiEntity> wrapper);

	List<ShifeiView> selectListView(Pagination page,@Param("ew") Wrapper<ShifeiEntity> wrapper);

	
	ShifeiView selectView(@Param("ew") Wrapper<ShifeiEntity> wrapper);
	

}
