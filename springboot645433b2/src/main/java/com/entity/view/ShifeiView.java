package com.entity.view;

import com.entity.ShifeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 施肥
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
@TableName("shifei")
public class ShifeiView  extends ShifeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShifeiView(){
	}
 
 	public ShifeiView(ShifeiEntity shifeiEntity){
 	try {
			BeanUtils.copyProperties(this, shifeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
