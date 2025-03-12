package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaizhaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaizhaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaizhaiView;


/**
 * 采摘
 *
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface CaizhaiService extends IService<CaizhaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaizhaiVO> selectListVO(Wrapper<CaizhaiEntity> wrapper);
   	
   	CaizhaiVO selectVO(@Param("ew") Wrapper<CaizhaiEntity> wrapper);
   	
   	List<CaizhaiView> selectListView(Wrapper<CaizhaiEntity> wrapper);
   	
   	CaizhaiView selectView(@Param("ew") Wrapper<CaizhaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaizhaiEntity> wrapper);

   	

}

