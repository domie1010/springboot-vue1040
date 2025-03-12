package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussguoshuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussguoshuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussguoshuxinxiView;


/**
 * 果蔬信息评论表
 *
 * @author 
 * @email 
 * @date 2024-04-18 14:01:19
 */
public interface DiscussguoshuxinxiService extends IService<DiscussguoshuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussguoshuxinxiVO> selectListVO(Wrapper<DiscussguoshuxinxiEntity> wrapper);
   	
   	DiscussguoshuxinxiVO selectVO(@Param("ew") Wrapper<DiscussguoshuxinxiEntity> wrapper);
   	
   	List<DiscussguoshuxinxiView> selectListView(Wrapper<DiscussguoshuxinxiEntity> wrapper);
   	
   	DiscussguoshuxinxiView selectView(@Param("ew") Wrapper<DiscussguoshuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussguoshuxinxiEntity> wrapper);

   	

}

