package com.entity.view;

import com.entity.CaizhaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 采摘
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
@TableName("caizhai")
public class CaizhaiView  extends CaizhaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaizhaiView(){
	}
 
 	public CaizhaiView(CaizhaiEntity caizhaiEntity){
 	try {
			BeanUtils.copyProperties(this, caizhaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
