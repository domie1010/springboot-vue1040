package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshuiView;


/**
 * 浇水
 *
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface JiaoshuiService extends IService<JiaoshuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshuiVO> selectListVO(Wrapper<JiaoshuiEntity> wrapper);
   	
   	JiaoshuiVO selectVO(@Param("ew") Wrapper<JiaoshuiEntity> wrapper);
   	
   	List<JiaoshuiView> selectListView(Wrapper<JiaoshuiEntity> wrapper);
   	
   	JiaoshuiView selectView(@Param("ew") Wrapper<JiaoshuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshuiEntity> wrapper);

   	

}

