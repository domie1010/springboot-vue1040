package com.dao;

import com.entity.CaizhaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaizhaiVO;
import com.entity.view.CaizhaiView;


/**
 * 采摘
 * 
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface CaizhaiDao extends BaseMapper<CaizhaiEntity> {
	
	List<CaizhaiVO> selectListVO(@Param("ew") Wrapper<CaizhaiEntity> wrapper);
	
	CaizhaiVO selectVO(@Param("ew") Wrapper<CaizhaiEntity> wrapper);
	
	List<CaizhaiView> selectListView(@Param("ew") Wrapper<CaizhaiEntity> wrapper);

	List<CaizhaiView> selectListView(Pagination page,@Param("ew") Wrapper<CaizhaiEntity> wrapper);

	
	CaizhaiView selectView(@Param("ew") Wrapper<CaizhaiEntity> wrapper);
	

}
