package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YunshuzhuizongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YunshuzhuizongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YunshuzhuizongView;


/**
 * 运输追踪
 *
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public interface YunshuzhuizongService extends IService<YunshuzhuizongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YunshuzhuizongVO> selectListVO(Wrapper<YunshuzhuizongEntity> wrapper);
   	
   	YunshuzhuizongVO selectVO(@Param("ew") Wrapper<YunshuzhuizongEntity> wrapper);
   	
   	List<YunshuzhuizongView> selectListView(Wrapper<YunshuzhuizongEntity> wrapper);
   	
   	YunshuzhuizongView selectView(@Param("ew") Wrapper<YunshuzhuizongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YunshuzhuizongEntity> wrapper);

   	

}

