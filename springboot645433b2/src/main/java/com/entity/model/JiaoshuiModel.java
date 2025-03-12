package com.entity.model;

import com.entity.JiaoshuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 浇水
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public class JiaoshuiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 果蔬图片
	 */
	
	private String guoshutupian;
		
	/**
	 * 灌溉浇水
	 */
	
	private Integer guangaijiaoshui;
		
	/**
	 * 灌溉时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guangaishijian;
				
	
	/**
	 * 设置：果蔬图片
	 */
	 
	public void setGuoshutupian(String guoshutupian) {
		this.guoshutupian = guoshutupian;
	}
	
	/**
	 * 获取：果蔬图片
	 */
	public String getGuoshutupian() {
		return guoshutupian;
	}
				
	
	/**
	 * 设置：灌溉浇水
	 */
	 
	public void setGuangaijiaoshui(Integer guangaijiaoshui) {
		this.guangaijiaoshui = guangaijiaoshui;
	}
	
	/**
	 * 获取：灌溉浇水
	 */
	public Integer getGuangaijiaoshui() {
		return guangaijiaoshui;
	}
				
	
	/**
	 * 设置：灌溉时间
	 */
	 
	public void setGuangaishijian(Date guangaishijian) {
		this.guangaishijian = guangaishijian;
	}
	
	/**
	 * 获取：灌溉时间
	 */
	public Date getGuangaishijian() {
		return guangaishijian;
	}
			
}
