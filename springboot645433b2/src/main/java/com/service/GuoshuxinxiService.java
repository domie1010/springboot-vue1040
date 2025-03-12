package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuoshuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuoshuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuoshuxinxiView;


/**
 * 果蔬信息
 *
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface GuoshuxinxiService extends IService<GuoshuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuoshuxinxiVO> selectListVO(Wrapper<GuoshuxinxiEntity> wrapper);
   	
   	GuoshuxinxiVO selectVO(@Param("ew") Wrapper<GuoshuxinxiEntity> wrapper);
   	
   	List<GuoshuxinxiView> selectListView(Wrapper<GuoshuxinxiEntity> wrapper);
   	
   	GuoshuxinxiView selectView(@Param("ew") Wrapper<GuoshuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuoshuxinxiEntity> wrapper);

   	

}

