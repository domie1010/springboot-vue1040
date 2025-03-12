package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuoshuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuoshuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuoshuleixingView;


/**
 * 果蔬类型
 *
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface GuoshuleixingService extends IService<GuoshuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuoshuleixingVO> selectListVO(Wrapper<GuoshuleixingEntity> wrapper);
   	
   	GuoshuleixingVO selectVO(@Param("ew") Wrapper<GuoshuleixingEntity> wrapper);
   	
   	List<GuoshuleixingView> selectListView(Wrapper<GuoshuleixingEntity> wrapper);
   	
   	GuoshuleixingView selectView(@Param("ew") Wrapper<GuoshuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuoshuleixingEntity> wrapper);

   	

}

