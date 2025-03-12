package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuoshushengchandiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuoshushengchandiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuoshushengchandiView;


/**
 * 果蔬生产地
 *
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface GuoshushengchandiService extends IService<GuoshushengchandiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuoshushengchandiVO> selectListVO(Wrapper<GuoshushengchandiEntity> wrapper);
   	
   	GuoshushengchandiVO selectVO(@Param("ew") Wrapper<GuoshushengchandiEntity> wrapper);
   	
   	List<GuoshushengchandiView> selectListView(Wrapper<GuoshushengchandiEntity> wrapper);
   	
   	GuoshushengchandiView selectView(@Param("ew") Wrapper<GuoshushengchandiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuoshushengchandiEntity> wrapper);

   	

}

