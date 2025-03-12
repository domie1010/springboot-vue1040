package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShifeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShifeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShifeiView;


/**
 * 施肥
 *
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface ShifeiService extends IService<ShifeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShifeiVO> selectListVO(Wrapper<ShifeiEntity> wrapper);
   	
   	ShifeiVO selectVO(@Param("ew") Wrapper<ShifeiEntity> wrapper);
   	
   	List<ShifeiView> selectListView(Wrapper<ShifeiEntity> wrapper);
   	
   	ShifeiView selectView(@Param("ew") Wrapper<ShifeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShifeiEntity> wrapper);

   	

}

